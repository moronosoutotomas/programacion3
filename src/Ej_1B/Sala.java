package Ej_1B;

public class Sala {

	private int numeroPersonas;
	private int capacidad;

	public Sala(int capacidad, int numeroPersonas) {
		this.capacidad = capacidad;
		this.numeroPersonas = numeroPersonas;

	}

	public boolean isFull() {
		if (numeroPersonas == capacidad) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (numeroPersonas == 0) {
			return true;
		}
		return false;
	}

	public void añadirPersona() {
		numeroPersonas++;
	}

	public void borrarPersona() {
		numeroPersonas--;

	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void imprimirSala() {
		System.out.println("------");
		System.out.println("Sala:");
		System.out.println("Numero personas: " + numeroPersonas + "capacidad: " + capacidad);
		System.out.println("-------");
	}
}
