package trimestre3_ej_3A;

public class CasaIndependiente extends CasaUrbana implements Impuesto {

	public static final int VALOR_AREA = 3400; // precio metro cuadrado

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
