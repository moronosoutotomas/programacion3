package Ej_4A;

public class Local extends Inmueble implements Comision {

	public enum tipo {
		CALLE, INTERNO
	}

	protected tipo tipoLocal;

	public Local(int idInmobiliario, int area, String direccion, tipo tipoLocal) {
		super(idInmobiliario, area, direccion);
		this.tipoLocal = tipoLocal;
	}

	public tipo getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(tipo tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

	@Override
	public String toString() {
		return "Local [tipoLocal=" + tipoLocal + ", idInmobiliario=" + idInmobiliario + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularComision() {
		double comision = this.calculaPrecioVenta() * 0.03;
		return comision;
	}

} // clase
