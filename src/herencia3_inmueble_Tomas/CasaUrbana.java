package herencia3_inmueble_Tomas;

public class CasaUrbana extends Vivienda {

	private int numPisos;

	public CasaUrbana(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
		this.numPisos = numPisos;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "CasaUrbana [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños
				+ ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

} // clase
