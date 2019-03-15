/*Clase de validaciones*/
import java.lang.Character;
import java.util.Scanner;
public class Validar {
	
		/*	INTERFAZ
	 * Cabecera:public static int ejecutarPrograma() 
	 * Comentario: pide y valida si se desea ejecutar el programa
	 * Precondiciones: no hay parametros de entrada
	 * Datos entrada: no hay
	 * Datos salida:
	 * Postcondiciones: asociado al nombre devuelve un entero que es la opcion del usuario
	 * */
	public static int ejecutarPrograma() {
		Scanner entrada = new Scanner(System.in);
		int opcionPP;
		do{
			System.out.println("1. Ejecutar\n0.Salir");
			opcionPP = entrada.nextInt();
			}while(opcionPP < 0 || opcionPP > 1);
		return opcionPP;
		}
	
		/*	INTERFAZ
	 * Cabecera:public static int cantidadSociosAProcesar()
	 * Comentario: pide y valida la cantidad de socios a procesar
	 * Precondiciones: 
	 * Datos entrada:
	 * Datos salida: un entero que es la cantidad de socios a procesar
	 * Postcondiciones: asociado al nombre devuelve la cantidad de socios a procesar
	 * */
	public static int cantidadSociosAProcesar(){
		
		Scanner entrada = new Scanner(System.in);
		int cantidad;
		do{
			System.out.println("Introduce la cantidad de socios que vas a validar:");
			cantidad = entrada.nextInt();
			}while(cantidad <0 );
		return cantidad;
		}
	
		/*	INTERFAZ
	 * Cabecera: public static char genero ()
	 * Comentario: pide y valida el genero (debe ser un caracter F o M)
	 * Precondiciones: 
	 * Datos entrada:
	 * Datos salida: devuelve un char que es el genero
	 * Postcondiciones: asociado al nombre devuelve el genero
	 * */
	public static char genero () {
		Scanner entrada = new Scanner(System.in);
		char gender;
		do{
		System.out.print("Genero: ");
		gender = Character.toUpperCase(entrada.next().charAt(0));
		}while (gender != 'F' && gender != 'M');
		return gender;
		}
	
		/*	INTERFAZ
	 * Cabecera: public static int sport()
	 * Comentario: pide y valida un deporte
	 * Precondiciones: 
	 * Datos entrada: 
	 * Datos salida: entero que es el deporte seleccionado
	 * Postcondiciones: asociado al nombre devuelve un entero que representa el deporte seleccionado
	 * */
	public static int sport(){
		Scanner entrada = new Scanner(System.in);
		int sport;
		do{
		System.out.print("Deporte: 1. RUGBY, 2. CRICKET, 3. GOLF, 4. TENNIS : ");
		sport = entrada.nextInt();
		}while (sport < 1 || sport > 4) ;
		return sport;
		}
	
		/*	INTERFAZ
	 * Cabecera:  public static int age ()
	 * Comentario: pide y valida la edad (debe ser mayor de edad)
	 * Precondiciones:
	 * Datos entrada:
	 * Datos salida: entero que es la edad
	 * Postcondiciones: asociado al nombre devuelve la edad
	 * */
	public static int age () {
		Scanner entrada = new Scanner(System.in);
		int age;
		do{
		System.out.print("Edad: ");
		age = entrada.nextInt();
		}while(age < 18);
		return age;
		}
	
		/*	INTERFAZ
	 * Cabecera: public static int menuSecundario ()
	 * Comentario: muestra el menu y pide al usuario la opcion que quiera escoger
	 * Precondiciones:
	 * Datos entrada: 
	 * Datos salida: entero que es la opcion del menu elegida por el usuario
	 * Postcondiciones: asociado al nombre devuelve la opcion elegida
	 * */
	public static int menuSecundario () {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		do{
		System.out.println("1. Cuantos socios realizan un deporte en particular");
		System.out.println("2. Porcentaje que representan sobre el total de socios");
		System.out.println("0. Salir");
		opcion= entrada.nextInt();
		}while(opcion < 0 || opcion > 2);
		return opcion;
		}

}

