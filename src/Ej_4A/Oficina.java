package Ej_4A;

public class Oficina extends Local {

	private boolean Gubernamental;
	public static final int VALOR_AREA = 3750; // precio metro cuadrado

	public Oficina(int idInmobiliario, int area, String direccion, tipo tipoLocal) {
		super(idInmobiliario, area, direccion, tipoLocal);
	}

	public boolean isGubernamental() {
		return Gubernamental;
	}

	public void setGubernamental(boolean Gubernamental) {
		this.Gubernamental = Gubernamental;
	}

	@Override
	public String toString() {
		return "Oficina [Gubernamental=" + Gubernamental + ", tipoLocal=" + tipoLocal + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

} // clase
