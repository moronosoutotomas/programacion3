package herencia3_inmueble_Corregido;

public class Local extends Inmueble {

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

} // clase
