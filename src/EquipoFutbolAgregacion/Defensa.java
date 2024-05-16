package EquipoFutbolAgregacion;

public class Defensa extends Jugador {

	private int numeroPatadas; // creado por Pepe, no sale en el libro

	public Defensa(String nombre, String apellidos, int edad, boolean esTitular, int numTarjetas) {
		super(nombre, apellidos, edad, esTitular);
		this.numeroPatadas = numTarjetas;
	}

	public int getNumTarjetas() {
		return numeroPatadas;
	}

	public void setNumTarjetas(int numTarjetas) {
		this.numeroPatadas = numTarjetas;
	}

	@Override
	public String toString() {
		return "Defensa [numTarjetas=" + numeroPatadas + "]";
	}

} // clase
