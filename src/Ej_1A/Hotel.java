package Ej_1A;

public class Hotel {

	int capacidad; // atributo que indica la capacidad del hotel en cuestión
	int numPersonas; // atributo que indica el número de personas que se alojan en el hotel

	public Hotel(int capacidad, int numPersonas) {
		this.capacidad = capacidad;
		this.numPersonas = numPersonas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * Método que añade el número de personas pasadas por parámetro al hospedaje si
	 * caben en el hotel y sinó devuelve el número de huéspedes que no caben en el
	 * susodicho hotel.
	 * 
	 * @param huespedes
	 * @return número de huéspedes que quedan por reservar.
	 */
	public int reserva(int huespedes) {
		if (huespedes <= (this.habitacionesLibres())) {
			numPersonas += huespedes;
			return 0;
		} else {
			int huespedesRestantes = 0;
			numPersonas += this.habitacionesLibres();
			huespedesRestantes = huespedes - this.habitacionesLibres();
			return huespedesRestantes;
		}
	}

	/**
	 * Método que elimina el número de personas pasadas por parámetro al hospedaje
	 * de un hotel.
	 * 
	 * @param huespedes
	 * @return número de personas que se quieren ir pero están alojadas en otra
	 *         infrastructura de la empresa.
	 */
	public int marchanPersonas(int huespedes) {
		if (huespedes <= numPersonas) {
			numPersonas -= huespedes;
			return 0;
		} else {
			int huespedesRestantes = 0;
			huespedesRestantes = huespedes - numPersonas;
			numPersonas = 0;
			return huespedesRestantes;
		}
	}

	/**
	 * Método que indica si el hospedaje de un hotel específico está completo o no.
	 * 
	 * @return
	 */
	public boolean estaLleno() {
		if (this.capacidad == this.numPersonas)
			return true;
		else
			return false;
	}

	/**
	 * Número de habitaciones libres del hotel.
	 * 
	 * @return
	 */
	public int habitacionesLibres() {
		int total = this.getCapacidad() - this.getNumPersonas();
		return total;
	}

} // clase
