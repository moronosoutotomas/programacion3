package herencia3_inmueble_Tomas;

public class Comercial extends Local {

	private String centroComercial;
	public static final int VALOR_AREA = 3000; // precio metro cuadrado

	public Comercial(int idInmobiliario, int area, String direccion, tipo tipoLocal) {
		super(idInmobiliario, area, direccion, tipoLocal);
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}

	@Override
	public String toString() {
		return "Comercial [centroComercial=" + centroComercial + ", tipoLocal=" + tipoLocal + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

} // clase
