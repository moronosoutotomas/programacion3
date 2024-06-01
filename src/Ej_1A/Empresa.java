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
	 * @param huespedes
	 */
	static void indicarInfrastructura(int huespedes) {
		int habitacionesDisponibles = hotel1.habitacionesLibres() + hotel2.habitacionesLibres()
				+ hotel3.habitacionesLibres();
		int huespedesRestantesHotel1 = 0;
		int huespedesRestantesHotel2 = 0;

		if (huespedes >= habitacionesDisponibles) {
			System.out.println("Lo sentimos mucho, tenemos los hoteles llenos.");
		} else {
			if (!hotel1.estaLleno()) {
				hotel1.reserva(huespedes);
				huespedesRestantesHotel1 = hotel1.reserva(huespedes);
			}
			if (!hotel2.estaLleno() && huespedesRestantesHotel1 != 0) {
				huespedesRestantesHotel2 = hotel2.reserva(huespedesRestantesHotel1);
			}
			if (huespedesRestantesHotel2 != 0) {
				hotel3.reserva(huespedesRestantesHotel2);
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
