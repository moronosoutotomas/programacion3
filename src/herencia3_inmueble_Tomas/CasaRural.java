package herencia3_inmueble_Tomas;

public class CasaRural extends Vivienda {

	protected int disCabeceraMunicipal;
	protected int altitudNivelMar;

	public CasaRural(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños,
			int disCabeceraMunicipal, int altitudNivelMar) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
		this.disCabeceraMunicipal = disCabeceraMunicipal;
		this.altitudNivelMar = altitudNivelMar;
	}

	public int getDisCabeceraMunicipal() {
		return disCabeceraMunicipal;
	}

	public void setDisCabeceraMunicipal(int disCabeceraMunicipal) {
		this.disCabeceraMunicipal = disCabeceraMunicipal;
	}

	public int getAltitudNivelMar() {
		return altitudNivelMar;
	}

	public void setAltitudNivelMar(int altitudNivelMar) {
		this.altitudNivelMar = altitudNivelMar;
	}

	@Override
	public String toString() {
		return "CasaRural [disCabeceraMunicipal=" + disCabeceraMunicipal + ", altitudNivelMar=" + altitudNivelMar + "]";
	}

} // clase
