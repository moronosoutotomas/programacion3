package Carro;

public class Llanta {

	private String marca;
	private int diametroRin;
	private int altura;
	private int anchura;

	public Llanta(String marca, int diametroRin, int altura, int anchura) {
		super();
		this.marca = marca;
		this.diametroRin = diametroRin;
		this.altura = altura;
		this.anchura = anchura;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getDiametroRin() {
		return diametroRin;
	}

	public void setDiametroRin(int diametroRin) {
		this.diametroRin = diametroRin;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", diametroRin=" + diametroRin + ", altura=" + altura + ", anchura=" + anchura
				+ "]";
	}

} // clase
