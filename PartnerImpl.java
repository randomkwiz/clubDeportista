/* Alumna: Angela Vazquez Dominguez
 * Clase: PartnerImpl
 * Propiedades:
 * 		Basicas:
 * 			-private String surnameName //consultable no modificable
 * 			-private double fee 	//consultable y modificable
 * 			-private int age		//consultable y modificable
 * 			-private char gender	//consultable no modificable
 * 			-private Sport sport	//consultable y modificable
 * 			-private int numPartner 	//consultable
 * 		Derivadas:
 * 			-relevance que deriva de la propiedad fee (cuota) 
 * 		Compartidas:
 * 			-static contadorNumeroPartner
 * Restricciones de los datos:
 * 			-Age debe ser minimo 18 (mayoria de edad en España) se controlara con excepcion
 * 			-Gender solo puede ser M (male) o F (female) y al no ser modificable lo controlare en el programa principal
 * Metodos Interface 
 * 		//getters
 * 	public String getSurnameName ();
 * 	public double getFee();
 * 	public int getAge();
 * 	public char getGender();
 * 	public Sport getSport();
 * 	public int getNumPartner();
 * 	public double getRelevance();
 * 
 * 	//setters
 * 	public void setFee (double fee);
 * 	public void setAge(int age) throws ExceptionPartner;
 * 	public void setSport(Sport sport);
 * 	
 * Metodos Object
 * compareTo
 * equals
 * toString
 * hashCode
 * clone
 * 
 * */


public class PartnerImpl implements Partner, Comparable<PartnerImpl>, Cloneable {	
		/*Atributos*/
		private String surnameName; //consultable no modificable
		private double fee; 	//consultable y modificable
  		private int age;		//consultable y modificable
 		private char gender;	//consultable no modificable
		private Sport sport;	//consultable y modificable
		private int numPartner; 	//consultable
		
		private final double MULTIPLICADOR = 0.25;	//valor constante por el que se multiplica el salario. Podria cambiar en un futuro.
		private final int MAYORIA_EDAD = 18; 	//mayoria de edad en españa, pero se podria cambiar en otro estado
		
		private static int contadorNumeroPartner = 0; //propiedad compartida
		
		/*Constructores*/
		//Por defecto
		public PartnerImpl () {
			surnameName = " ";
			fee = 0.0;
			age = 0;
			gender = ' ';
			sport = Sport.NULL;
			numPartner = contadorNumeroPartner++;
			}
			//Con parametros
		public PartnerImpl(String surnameName, double fee, int age, char gender, Sport sport){
			numPartner = contadorNumeroPartner++;
			this.surnameName = surnameName;
			this.fee = fee;
			this.age = age;
			this.gender = gender;
			this.sport = sport;
			}
			//De copia
		public PartnerImpl (PartnerImpl partner) {
			numPartner = contadorNumeroPartner++;	//decido que la copia no tendra el mismo numero de partner
			this.surnameName = partner.surnameName;
			this.fee = partner.fee;
			this.age = partner.age;
			this.gender = partner.gender;
			this.sport = partner.sport;
			}
	/*Metodos setters y getters*/
		//getters
   	public String getSurnameName () {return this.surnameName;}
   	public double getFee() {return this.fee;}
   	public int getAge() {return this.age;}
   	public char getGender() {return this.gender;}
   	public Sport getSport() {return this.sport;}
   	public int getNumPartner() {return this.numPartner;}
   	public double getRelevance() {
		return this.getFee() * MULTIPLICADOR;
	}
   
   	//setters
   	public void setFee (double fee){this.fee = fee;}
   	public void setAge(int age) throws ExceptionPartner {
		if (age < MAYORIA_EDAD) {
			throw new ExceptionPartner("Debe ser mayor de edad.");
		} else {
			this.age = age;
			}
		
		}
   	public void setSport(Sport sport) {this.sport = sport;}


	/*Metodos Object */
	
	/*Criterio de igualdad: dos partners son iguales si tienen el mismo numPartner*/
	@Override
	public boolean equals (Object obj) {
		boolean igual = false;
		if (this == obj) {
			igual = true;
		} else {
			if (obj != null && obj instanceof PartnerImpl) {
				PartnerImpl otro = (PartnerImpl) obj;
				if (this.getNumPartner() == otro.getNumPartner() ) {
					igual = true;
					}
				}
			}
		return igual;
		}
		
	/*Criterio de comparacion:
	 * Devuelve:	Si:
	 * -1 		el numero de partner propio es menor al del objeto recibido como parametro de entrada
	 * 0		numero de partner son iguales
	 * 1		el numero de partner propio es mayor al del objeto recibido como parametro de entrada
	 * */
	 
	 public int compareTo (PartnerImpl otro) {
		 int comp = 0;
			if (this.getNumPartner() < otro.getNumPartner() ) {
				comp = -1;
			} else if (this.getNumPartner() > otro.getNumPartner() ) {
				comp = 1;
				}
		 return comp;
		 }
		 /*Metodo toString, pasa a cadena el objeto*/
	@Override
	public String toString () {
		return "numPartner: " + this.getNumPartner() + ", apellidosNombre: "+ this.getSurnameName() + ", relevance: "+this.getRelevance();
		}
	
	/*Metodo clone*/
	@Override
	public PartnerImpl clone () {
		PartnerImpl copia = null;
		try {
			copia = (PartnerImpl) super.clone();
			}catch(CloneNotSupportedException error) {System.out.println("Error en la copia");}
		
		return copia;
		}
	/*Metodo hashCode a partir de numPartner y apellidosNombre*/
	/*Lo hago con el atributo fee en vez de con apellidosNombre porque no se multiplicar una cadena con un entero*/
	@Override
	public int hashCode() {
		return this.getNumPartner() * 27 + (int)this.getFee()* 33 + 7;
		}
}

