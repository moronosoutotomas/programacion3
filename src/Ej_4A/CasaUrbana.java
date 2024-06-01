package Ej_4A;

public class CasaUrbana extends Casa {

	public CasaUrbana(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
	}

	@Override
	public String toString() {
		return "CasaUrbana [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños
				+ ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

} // clase
