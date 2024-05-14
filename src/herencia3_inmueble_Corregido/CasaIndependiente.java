package herencia3_inmueble_Corregido;

public class CasaIndependiente extends CasaUrbana {

	public static final int VALOR_AREA = 3000; // precio metro cuadrado

	public CasaIndependiente(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int numPisos) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
	}

	@Override
	public String toString() {
		return "CasaIndependiente [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños="
				+ numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

} // clase
