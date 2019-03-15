/*Programa de GestionPartners*/

import java.util.Scanner;
public class GestionPartners {
	
	/*	INTERFAZ
	 * Cabecera: public static void procesarSocio () 
	 * Comentario: pide y recoge los datos de un socio
	 * Precondiciones: no hay entradas por parametro pero dentro del subprograma si se lee porque es su objetivo
	 * Datos entrada:
	 * Datos salida: objeto partner
	 * Postcondiciones: asociado al nombre devuelve el objeto partner
	 * */
	
	public static PartnerImpl procesarSocio () {
		Scanner entrada = new Scanner(System.in);
		String nombre = " ";
		double fee = 0.0;
		int age = 0;
		char gender = ' ';
		Sport sport = Sport.NULL;
		int sp = 0;
		
		System.out.println("Introduce tus datos, socio: ");
		System.out.print("Nombre y apellidos: ");
		nombre = entrada.nextLine();
		System.out.print("Cuota: ");
		fee = entrada.nextDouble();
		age = Validar.age();
		gender = Validar.genero();
		sp = Validar.sport();
		switch(sp ) {
			case 1:
				sport = Sport.RUGBY;
			break;
			case 2:
				sport = Sport.CRICKET;
			break;
			case 3:
				sport = Sport.GOLF;
			break;
			case 4:
				sport = Sport.TENNIS;
			break;
			}

			PartnerImpl p = new PartnerImpl(nombre, fee, age, gender, sport);
			return p;
		}
		
	/*	INTERFAZ
	 * Cabecera: public static imprimirSociosPorDeporte (int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket)
	 * Comentario: muestra por pantalla los socios que practican cada deporte
	 * Precondiciones: por valor se pasan los contadores de los socios que juegan cada deporte (cuatro parametros de entrada que son int)
	 * Datos entrada: int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket
	 * Datos salida: nada, imprime en pantalla
	 * Postcondiciones: asociado al nombre no devuelve nada
	 * */
	public static void imprimirSociosPorDeporte (int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket) {
		System.out.println("Jugadores de RUGBY : "+contadorRugby);
		System.out.println("Jugadores de TENNIS : "+contadorTennis);
		System.out.println("Jugadores de GOLF : "+contadorGolf);
		System.out.println("Jugadores de CRICKET : "+contadorCricket);
		}
	
		/*	INTERFAZ
	 * Cabecera: public static imprimirSociosPorDeportePorcentajes (int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket, int total)
	 * Comentario: muestra por pantalla los socios que practican cada deporte en porcentajes sobre el total
	 * Precondiciones: por valor se pasan los contadores de los socios que juegan cada deporte (cuatro parametros de entrada que son int y ademas el total de socios)
	 * Datos entrada: int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket, int total
	 * Datos salida: nada, imprime en pantalla
	 * Postcondiciones: asociado al nombre no devuelve nada
	 * */
	public static void imprimirSociosPorDeportePorcentajes (int contadorRugby, int contadorTennis, int contadorGolf, int contadorCricket, int total) {
		System.out.println("Jugadores de RUGBY : "+ ( (contadorRugby * total )/ 100 ));
		System.out.println("Jugadores de TENNIS : "+ (( contadorTennis *total) / 100 )  );
		System.out.println("Jugadores de GOLF : "+ (( contadorGolf * total) /100 ) );
		System.out.println("Jugadores de CRICKET : "+ ( (contadorCricket * total ) /100)   );
		}
}

