package Ej_4A;

public class Vivienda extends Inmueble {

	protected int numHabitaciones;
	protected int numBaños;

	public Vivienda(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
		super(idInmobiliario, area, direccion);
		this.numHabitaciones = numHabitaciones;
		this.numBaños = numBaños;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumBaños() {
		return numBaños;
	}

	public void setNumBaños(int numBaños) {
		this.numBaños = numBaños;
	}

	@Override
	public String toString() {
		return "Vivienda [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + "]";
	}

} // clase
