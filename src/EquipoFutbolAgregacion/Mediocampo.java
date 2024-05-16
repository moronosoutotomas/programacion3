package EquipoFutbolAgregacion;

public class Mediocampo extends Jugador {

	private int numAsistencias;

	public Mediocampo(String nombre, String apellidos, int edad, boolean esTitular, int numAsistencias) {
		super(nombre, apellidos, edad, esTitular);
		this.numAsistencias = numAsistencias;
	}

	public int getNumAsistencias() {
		return numAsistencias;
	}

	public void setNumAsistencias(int numAsistencias) {
		this.numAsistencias = numAsistencias;
	}

	@Override
	public String toString() {
		return "Mediocampo [numAsistencias=" + numAsistencias + "]";
	}

} // clase
