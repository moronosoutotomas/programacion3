package trimestre3_ej_3A;

public class CasaRural extends Casa implements Impuesto {

	public static final int VALOR_AREA = 1525; // precio metro cuadrado
	protected int distanciaCabecera;
	protected int altitud;

	public CasaRural(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,
			int distanciaCabecera, int altitud) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
		this.distanciaCabecera = distanciaCabecera;
		this.altitud = altitud;
	}

	public int getDisCabeceraMunicipal() {
		return distanciaCabecera;
	}

	public void setDisCabeceraMunicipal(int disCabeceraMunicipal) {
		this.distanciaCabecera = disCabeceraMunicipal;
	}

	public int getAltitudNivelMar() {
		return altitud;
	}

	public void setAltitudNivelMar(int altitudNivelMar) {
		this.altitud = altitudNivelMar;
	}

	@Override
	public String toString() {
		return "CasaRural [disCabeceraMunicipal=" + distanciaCabecera + ", altitudNivelMar=" + altitud + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return this.area * VALOR_AREA;
	}

	@Override
	public double calcularImpuesto() {
		double comision = super.calcularImpuesto();
		comision += (altitud * 4);
		return comision;
	}

} // clase
