import java.util.Scanner;
public class ControlDeFlujoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if (condicion) si se cumple{
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * if (condición) si se cumple {
		 * codigo 
		 * codigo
		 * codigo
		 * } else o si no {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * if (condicion) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * } else if (condicion 2) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 */
		
		/*
		 * Escribir un programa que reciba la edad del user
		 * por consola. Si es mayor de 18 años, devolver
		 * un mensaje de que puede votar, de lo contrario
		 * que no puede votar
		 */
		
		/*
		*Scanner leerEdad = new Scanner(System.in);
		*System.out.println("Ingresa tu edad: ");
		*int edad = leerEdad.nextInt();
		*String mensaje = votar(edad);
		*
		*System.out.println(mensaje);
		*/
		
		/*
		 * Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"
		 */
		
		Scanner leerNombre = new Scanner(System.in);
		System.out.println("¡Hola! Escribe tu nombre, por favor: ");
		String nombre = leerNombre.nextLine();
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Gracias. Ahora, escribe tu edad: ");
		int edad = leerEdad.nextInt();
		String mensaje = aceptacion(nombre, edad);
		
		System.out.println(mensaje);
		
	}
	/* public static String votar(int edad) {
	*	 String mensaje = "";
	*	if (edad >= 18) {
	*		mensaje = "Felicidades, puedes votar";
	*	} else {
	*		mensaje = "No puedes votar";
	*	}
	*	
	*	return mensaje;
	*	
	* }
	*/
	
	public static String aceptacion(String nombre, int edad) {
		String mensaje = "";
		if (edad >= 18 && edad <= 29) {
			mensaje = "Felicidades " + nombre + ", puedes entrar al programa de Generation Java Full Stack";
		} else {
			mensaje = "Lo sentimos. No cumples con los requisitos para el bootcamp Java Full Stack";
		}
		
		return mensaje;
	}

}
