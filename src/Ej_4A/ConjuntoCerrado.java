package Ej_4A;

public class ConjuntoCerrado extends CasaUrbana {

	public static final int VALOR_AREA = 2250; // precio metro cuadrado
	protected double valorAdministracion;
	private boolean Piscina;
	private boolean CampoDeportivo;

	public ConjuntoCerrado(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int numPisos, double valorAdministracion, boolean piscina, boolean campoDeportivo) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
		this.valorAdministracion = valorAdministracion;
		this.Piscina = piscina;
		this.CampoDeportivo = campoDeportivo;
	}

	public double getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(double valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public boolean hasPiscina() {
		return Piscina;
	}

	public void setPiscina(boolean piscina) {
		Piscina = piscina;
	}

	public boolean hasCampoDeportivo() {
		return CampoDeportivo;
	}

	public void setCampoDeportivo(boolean campoDeportivo) {
		CampoDeportivo = campoDeportivo;
	}

	@Override
	public String toString() {
		return "ConjuntoCerrado [valorAdministracion=" + valorAdministracion + ", Piscina=" + Piscina
				+ ", CampoDeportivo=" + CampoDeportivo + ", numPisos=" + numPisos + ", numHabitaciones="
				+ numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

} // clase
