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
	 * Método que añade el número de personas pasadas por parámetro al hospedaje.
	 * 
	 * @param n
	 */
	public void lleganPersonas(int n) {
		if (numPersonas < (this.getCapacidad()) - numPersonas)
			numPersonas += n;
		else
			System.out.println("Lo sentimos mucho, no tenemos habitaciones suficientes.");
	}

	/**
	 * Método que elimina el número de personas pasadas por parámetro al hospedaje.
	 * 
	 * @param n
	 */
	public void marchanPersonas(int n) {
		if (numPersonas >= n)
			this.numPersonas -= n;
		else
			System.out.println("Error, no pueden irse mas personas de las que están alojadas en nuestros hoteles.");
	}

	/**
	 * Método que indica si el hospedaje de un hotel específico está completo o no.
	 * 
	 * @return
	 */
	public boolean estaLleno() {
		if (this.capacidad >= this.numPersonas)
			return true;
		else
			return false;
	}

} // clase
