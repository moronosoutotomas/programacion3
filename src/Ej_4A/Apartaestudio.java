package Ej_4A;

public class Apartaestudio extends Apartamento {

	public static final int VALOR_AREA = 1850; // precio metro cuadrado
//	private final int numHabitaciones = 1;

	public Apartaestudio(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
	}

	@Override
	public String toString() {
		return "Apartaestudio [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

} // clase
