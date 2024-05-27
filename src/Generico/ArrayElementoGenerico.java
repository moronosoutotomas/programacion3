package Generico;

public class ArrayElementoGenerico {

	/**
	 * Esta clase denominada ArrayElementosGenéricos modela una clase que incluye un
	 * método genérico que imprime en pantalla los elementos de un array genérico.
	 * 
	 * @version 1.2/2020
	 */

	/**
	 * Método estático que imprime en pantalla los elementos de un array genérico
	 */
	public static <E> void imprimirArray(E[] array) {
		/*
		 * Se recorre cada elemento del array donde sus elementos se indican con el
		 * parámetro genérico E
		 */
		for (E item : array) {
			System.out.printf("%s ", item);
		}
		System.out.println();
	}

	/**
	 * Genericidad, excepciones y lectura/escritura de archivos 397 Método main que
	 * prueba el array genérico imprimiendo en pantalla los valores de diferentes
	 * tipos del array
	 */
	public static void main(String args[]) {

		// Imprime un array de datos enteros
		Integer[] intArray = { 20, 25, 31 };
		System.out.println("Array de enteros:");
		imprimirArray(intArray);

		// Imprime un array de datos double
		Double[] doubleArray = { 3.1415, 2.7182, 1.618 };
		System.out.println("\nArray de doubles:");
		imprimirArray(doubleArray);

		// Imprime un array de datos boolean
		Boolean[] booleanArray = { true, false };
		System.out.println("\nArray de booleans:");
		imprimirArray(booleanArray);

		// Imprime un array de datos Character
		Character[] charArray = { 'I', 'n', 'f', 'o', 'r', 'm', 'á', 't', 'i', 'c', 'a' };
		System.out.println("\nArray de caracteres:");
		imprimirArray(charArray);

		// Imprime un array de datos String
		String[] stringArray = { "Administración", "Sistemas", "Informáticos" };
		System.out.println("\nArray de strings:");
		imprimirArray(stringArray);
	}

} // clase
