package Generico;

class Tripleta<I, P, S> {

	/**
	 * Esta clase denominada Tripleta modela una clase genérica que representa una
	 * tripleta (una colección con tres elementos). Los atributos de la tripeta son
	 * tres elementos genéricos denominados i, p, s.
	 * 
	 * @version 1.2/2020
	 */

	private final I i; /* Atributo que identifica el primer elemento de la tripleta */
	private final P p; /* Atributo que identifica el segundo elemento de la tripleta */
	private final S s; /* Atributo que identifica el tercer elemento de la tripleta */

	/**
	 * Constructor de la clase Tripleta388 Ejercicios de programación orientada a
	 * objetos con Java y UML
	 * 
	 * @param valor1 Parámetro que define el primer elemento de la tripleta
	 * @param valor2 Parámetro que define el segundo elemento de la tripleta
	 * @param valor3 Parámetro que define el tercer elemento de la tripleta
	 */
	public Tripleta(I valor1, P valor2, S valor3) {
		i = valor1;
		p = valor2;
		s = valor3;
	}

	/**
	 * Método que convierte a String los datos de una tripleta
	 * 
	 * @return Un String que concatena los datos de la tripleta
	 */
	public String toString() {
		return String.format(i + " - " + p + " - " + s);
	}

	/**
	 * Método main que crea dos tripletas y muestra su información en pantalla
	 */
	public static void main(String[] args) {

		// Crea una tripleta conformada por un Integer y dos String
		Tripleta<Integer, String, String> tripleta1 = new Tripleta<Integer, String, String>(1, "Cálculo",
				"Cómputo que se hace de algo por medio de operaciones matemáticas.");

		System.out.println(tripleta1);

		// Crea una tripleta conformada por tres String
		Tripleta<String, String, String> tripleta2 = new Tripleta<String, String, String>("Real Madrid", "Barcelona",
				"3-3");

		System.out.println(tripleta2);

		// Crea una tripleta conformada por dos String y un Integer

		Tripleta<String, String, Integer> tripleta3 = new Tripleta<String, String, Integer>("Temperatura",
				"Grados centígrados", 18);

		System.out.println(tripleta3);
	} // main
} // clase
