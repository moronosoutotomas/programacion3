package herencia3_inmueble_Tomas;

public class CasaIndependiente extends CasaUrbana {

	public CasaIndependiente(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int numPisos) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
	}

	@Override
	public String toString() {
		return "CasaIndependiente [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

} // clase
