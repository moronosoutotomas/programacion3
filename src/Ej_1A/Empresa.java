package Ej_1A;

public class Empresa {
	// Infrastructuras de la empresa:
	static Hotel hotel1 = new Hotel(4, 0);
	static Hotel hotel2 = new Hotel(6, 0);
	static Hotel hotel3 = new Hotel(8, 0);

	/**
	 * Método que aloja a los huéspedes en el hotel requerido cumpliendo la
	 * normativa de la empresa.
	 * 
	 * @param n
	 */
	static void indicarInfrastructura(int n) {
		int huespedes = n;
		if (n >= 18) {
			System.out.println("Lo sentimos mucho, tenemos los hoteles llenos.");
		} else {
			while(huespedes <= 0) {
			if (!hotel1.estaLleno()) {
				huespedes -= hotel1.getCapacidad();
				hotel1.setNumPersonas(hotel1.getCapacidad());
			}

			if (!hotel2.estaLleno()) {
				huespedes -= hotel2.getCapacidad();
				hotel2.setNumPersonas(hotel2.getCapacidad());
			}

			if (!hotel3.estaLleno()) {
				huespedes -= hotel3.getCapacidad();
				hotel3.setNumPersonas(hotel3.getCapacidad());
			}
			}
		}
	}

	/**
	 * Método que imprime todas las infrastructuras de la empresa con sus
	 * respectivos detalles.
	 * 
	 * @return
	 */
	static String imprimirInfrastructuras() {
		String hoteles = "";

		hoteles += "INFRASTRUCTURAS";
		hoteles += "\nHotel 1";
		hoteles += "\nContiene " + hotel1.getNumPersonas() + " de " + hotel1.capacidad + " huéspedes.";
		hoteles += "\nHotel 2";
		hoteles += "\nContiene " + hotel2.getNumPersonas() + " de " + hotel2.capacidad + " huéspedes.";
		hoteles += "\nHotel 3";
		hoteles += "\nContiene " + hotel3.getNumPersonas() + " de " + hotel3.capacidad + " huéspedes.";

		return hoteles;
	}

	/**
	 * Método que reinicia el número de huéspedes de cada hotel para analizar cada
	 * caso por separado.
	 */
	static void resetInfrastructuras() {
		hotel1.numPersonas = 0;
		hotel2.numPersonas = 0;
		hotel3.numPersonas = 0;
	}

	public static void main(String[] args) {

//			Haremos 4 casos, testeando que las personas se alojen en orden,
//			con cifras que pongan a prueba el requisito de alojarse en el 1º
//			hotel antes que en el 2º y en el 3º, y un cuarto caso en el
//			que la gente no quepa en la capacidad total de los 3 hoteles,
//			en cuyo caso la empresa no podría ofrecer el servicio adecuadamente.

		System.out.println("\n========== CASO 1 ==========");
		indicarInfrastructura(3);
		System.out.println(imprimirInfrastructuras());
		resetInfrastructuras();

		System.out.println("\n========== CASO 2 ==========");
		indicarInfrastructura(5);
		System.out.println(imprimirInfrastructuras());
		resetInfrastructuras();

		System.out.println("\n========== CASO 3 ==========");
		indicarInfrastructura(7);
		System.out.println(imprimirInfrastructuras());
		resetInfrastructuras();

		System.out.println("\n========== CASO 4 ==========");
		indicarInfrastructura(9);
		System.out.println(imprimirInfrastructuras());

	} // main
} // clase
