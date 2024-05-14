package herencia3_inmueble_Tomas;

public class Apartamento extends Vivienda {

	protected double valorAdministracion;

	public Apartamento(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			double valorAdministracion) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
		this.valorAdministracion = valorAdministracion;
	}

	public double getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(double valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	@Override
	public String toString() {
		return "Apartamento [valorAdministracion=" + valorAdministracion + ", numHabitaciones=" + numHabitaciones
				+ ", numBaños=" + numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion="
				+ direccion + "]";
	}

} // clase
