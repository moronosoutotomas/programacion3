package herencia3_inmueble_Tomas;

public class ApartamentoFamiliar extends Apartamento {

	public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			double valorAdministracion) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, valorAdministracion);
	}

	@Override
	public String toString() {
		return "ApartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

} // clase
