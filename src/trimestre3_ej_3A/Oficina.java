package trimestre3_ej_3A;

public class Oficina extends Local implements Impuesto {

	private boolean Gubernamental;
	public static final int VALOR_AREA = 3975; // precio metro cuadrado

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
	public double calcularImpuesto() {
		double res = super.calcularImpuesto();
		if (!Gubernamental) {
			res -= 3000;
		}
		return res;
	}

} // clase
