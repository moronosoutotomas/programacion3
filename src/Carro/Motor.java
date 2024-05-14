package Carro;

public class Motor {

	private int volumen;

	public Motor(int volumen) {
		super();
		this.volumen = volumen;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Motor [volumen=" + volumen + "]";
	}

} // clase
