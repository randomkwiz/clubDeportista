/*Alumna: Angela Vazquez Dominguez
 * Comentario: programa que gestiona los partners. Examen de POO. 13/02/2019
 * Datos de entrada: opciones del usuario
 * Datos de salida: mensajes de ayuda al usuario
 * Precondiciones: 
 * Restricciones: las opciones del usuario deberan estar en el rango valido seleccionado por el programador
 * 
 * PSEUDOCODIGO 
 * 	inicio
 * 	repetir
 * 		pedirValidarEjecutarPrograma*
 * 		si (opcionProgramaPrincipal no es salir)
 * 			pedirValidarCantidadSociosAProcesar*
 * 			para (contador igual a 0 mientras contador sea menor a la cantidad de socios a procesar, sumar 1 a contador)
 * 				procesarSocio
 * 				contarSociosDeporte
 * 			finPara
 * 			repetir
 * 				mostrarMenuPedirValidarOpcion*
 * 				si (opcion no es salir)
 * 				segun (opcion)
 * 					caso 1: mostrar cantidad de socios que practican un deporte*
 * 					caso 2: mostrar porcentaje que representan sobre el total de socios*
 * 				finSi
 * 			mientras (opcion no sea salir)
 * 		finSi
 * 	mientras (opcionProgramaPrincipal no sea salir)
 * 	fin
 * */


public class Main {
	
	public static void main (String[] args) {
		int opcionPP, opcion,cantidad;
		int contadorRugby=0, contadorCricket=0, contadorTennis=0, contadorGolf=0;
		
		do{
			//pedirValidarEjecutarPrograma
			opcionPP = Validar.ejecutarPrograma();
			
			if (opcionPP != 0 ){
			//pedirValidarCantidadSociosAProcesar
			cantidad = Validar.cantidadSociosAProcesar();
			
			for(int contador = 0; contador < cantidad; contador++){
				//procesarSocio
				System.out.println("Socio a procesar numero: "+(contador+1));
				PartnerImpl p = new PartnerImpl( GestionPartners.procesarSocio() );
				
				//contarSociosDeporte
					if (p.getSport() == Sport.CRICKET ) {
						contadorCricket++;
					}else if (p.getSport() == Sport.GOLF ) {
						contadorGolf++;
					}else if (p.getSport() == Sport.TENNIS ) {
						contadorTennis++;
					}else if (p.getSport() == Sport.RUGBY ) {
						contadorRugby++;
					}
				}
				do {
					//mostrarMenuPedirValidarOpcion
				opcion = Validar.menuSecundario();
				if (opcion != 0) {
				switch(opcion) {
					case 1:
					//mostrar cantidad de socios que practican un deporte
					GestionPartners.imprimirSociosPorDeporte(contadorRugby,contadorTennis,  contadorGolf,  contadorCricket);
					break;
					
					case 2:
					//mostrar porcentaje que representan sobre el total de socios
					GestionPartners.imprimirSociosPorDeportePorcentajes(contadorRugby,contadorTennis,  contadorGolf,  contadorCricket, cantidad);
					break;
					}
				}
				}while(opcion != 0);	
			}
			}while (opcionPP != 0); //cierra programa principal
		
		
	}
}

