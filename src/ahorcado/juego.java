package ahorcado;

import java.util.Scanner;

public class juego {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		// Crear variable

		int intentos = 5; 
		int  w = 0;

		boolean verdadero = true, t = true;
		int repetir = 0;

		// palabra para buscar

		System.out.println("Ingrese una palabra");

		String palabra = teclado.nextLine();

		System.out.println("\n\n");

		String letra[] = new String[5];

		// separando String en letras

		String[] letras = palabra.split("");

		String intento[] = new String[letras.length];

		String ingresadas[] = new String[letras.length];

		// Asignar tamaño de letras a la variable

		int gaizka = letras.length - 1;

		for (int i = 0; i < letras.length; i++) {
			System.out.println("");
		}

		for (int i = 1; i < letras.length; i++) {

			intento[i] = "_ ";// palabra ingresada asi la variable intento

		}

		// Teniendo 5 intentos mientras no se acaben se repetin las acciones

		while (intentos > 0)

		{

			// Muestro líneas de la palabra ingresada

			for (int i = 1; i < letras.length; i++) {

				System.out.print(intento[i]);

			}

			System.out.println("Ingrese una letra");
			letra[0] = teclado.nextLine();

			repetir = 0;
			boolean aviso = true;

			for (int i = 1; i < letras.length; i++) {

				t = true;

				// si la letra ingresada se encuentra en parte de las letras que forman parte de
				// la palabra ingresada entra

				if (letras[i].equals(letra[0])) { // si la palabra no fue ingresada antes entra

					if (!intento[i].equals(letra[0])) {

						// Asignando a la variable intento la letra ingresada

						intento[i] = letra[0];

						verdadero = false;

						repetir++;
						ingresadas[i] = letras[0];

					} else {
						aviso = false;
						verdadero = false;
					}

				}

			}

			// en caso ya se siga introducido x

			// letra que ya estaba aparecera este mensaje

			if (aviso == false) {

				System.out.println(" Aviso: Ya has ingresado esa letra ");

			}

			aviso = true;

			if (verdadero == true) { // reducir intentos

				intentos--;

			} else {
				w = w - repetir;
			}

			System.out.println(" \nQuedan: " + intentos + " Intentos");

			// llamada a la funcion

			impresion(intentos);

			if (intentos == 0) {

				System.out.println("\nPerdiste\nLa palabra es: " + palabra);

			}

			if (w <= 0) {

				System.out.println(palabra + "\nZorionak has ganado.");
				intentos = 0;
			}

			verdadero = true;
			repetir = 0;

		
		}

		teclado.close(); // cerrar scanner teclado

	}

	// Para imprimir el dibujo del ahorcado
	private static void impresion(int intentos) {
		// TODO Auto-generated method stub

	}

}
