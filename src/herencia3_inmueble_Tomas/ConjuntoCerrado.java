package herencia3_inmueble_Tomas;

public class ConjuntoCerrado extends CasaUrbana {

	private double valorAdministracion;
	private boolean Piscina;
	private boolean CampoDeportivo;

	public ConjuntoCerrado(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int numPisos, double valorAdministracion, boolean tienePiscina, boolean tieneCampoDeportivo) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
		this.valorAdministracion = valorAdministracion;
		this.Piscina = tienePiscina;
		this.CampoDeportivo = tieneCampoDeportivo;
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

	public void setPiscina(boolean tienePiscina) {
		this.Piscina = tienePiscina;
	}

	public boolean hasCampoDeportivo() {
		return CampoDeportivo;
	}

	public void setCampoDeportivo(boolean tieneCampoDeportivo) {
		this.CampoDeportivo = tieneCampoDeportivo;
	}

	@Override
	public String toString() {
		return "ConjuntoCerrado [valorAdministracion=" + valorAdministracion + ", tienePiscina=" + Piscina
				+ ", tieneCampoDeportivo=" + CampoDeportivo + ", numHabitaciones=" + numHabitaciones + ", numBaños="
				+ numBaños + ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

} // clase
