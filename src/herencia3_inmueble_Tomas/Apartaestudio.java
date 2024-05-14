package herencia3_inmueble_Tomas;

public class Apartaestudio extends Apartamento {

	private final int numHabitaciones = 1;

//	OJO!!! Tenemos que parametrizar valorAdministracion porque viene del super aunque
//	vaya a ser un valor fijo
	public Apartaestudio(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			double valorAdministracion) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, valorAdministracion);
	}

	@Override
	public String toString() {
		return "Apartaestudio [numHabitaciones=" + numHabitaciones + ", valorAdministracion=" + valorAdministracion
				+ ", numBaños=" + numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion="
				+ direccion + "]";
	}

} // clase
