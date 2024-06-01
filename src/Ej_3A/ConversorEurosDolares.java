package Ej_3A;

public class ConversorEurosDolares {

	/**
	 * Método que cambia de euros a dólares.
	 * 
	 * @param e
	 * @return
	 */
	public static double eurosDolares(double e) {
		double dolares;
		dolares = e * 1.07; // aprox
		return dolares;
	}

	/**
	 * Método que cambia de dólares a euros.
	 * 
	 * @param d
	 * @return
	 */
	public static double dolaresEuros(double d) {
		double euros;
		euros = 93.458; // aprox
		return euros;
	}

} // clase
