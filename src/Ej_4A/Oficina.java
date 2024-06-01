package Ej_4A;

public class Oficina extends Local implements Comision {

	private boolean Gubernamental;
	public static final int VALOR_AREA = 3750; // precio metro cuadrado

	public Oficina(int idInmobiliario, int area, String direccion, tipo tipoLocal, boolean gubernamental) {
		super(idInmobiliario, area, direccion, tipoLocal);
		Gubernamental = gubernamental;
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

	@Override
	public double calcularComision() {
		double res = super.calcularComision();
		if (Gubernamental) {
			res += 2000;
		}
		return res;
	}

} // clase
