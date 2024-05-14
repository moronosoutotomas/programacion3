package Carro;

public class Asiento {

//	TODO no está implementada en la clase Carro asique no hace nada,
//	pero puede ser útil mas adelante.

	public enum tipoAsiento {
		CONDUCTOR, ACOMPAÑANTE, TRASERO
	}

	public enum tipoMaterial {
		TEXTIL, PIEL, SKY
	}

	private tipoAsiento tipoAsiento;
	private tipoMaterial tipoMaterial;

	public Asiento(tipoAsiento tipoAsiento, tipoMaterial tipoMaterial) {
		this.tipoAsiento = tipoAsiento;
		this.tipoMaterial = tipoMaterial;
	}

	public tipoAsiento getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(tipoAsiento tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

	public tipoMaterial getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(tipoMaterial tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String toString() {
		return "Asiento [tipoAsiento=" + tipoAsiento + ", tipoMaterial=" + tipoMaterial + "]";
	}

} // clase
