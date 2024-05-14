package herencia3_inmueble_Corregido;

public class Apartamento extends Vivienda {

	public Apartamento(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
	}

	@Override
	public String toString() {
		return "Apartamento [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

} // clase
