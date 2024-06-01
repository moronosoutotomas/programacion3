package Ej_4A;

public class ApartamentoFamiliar extends Apartamento {

	public static final int VALOR_AREA = 2350; // precio metro cuadrado
	protected int valorAdministracion;

	public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int valorAdministracion) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
		this.valorAdministracion = valorAdministracion;
	}

	public int getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	@Override
	public String toString() {
		return "ApartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

	@Override
	public double calcularComision() {
		double res = super.calcularComision() + (valorAdministracion * 3);
		return res;
	}

} // clase
