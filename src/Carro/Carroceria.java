package Carro;

public class Carroceria {

	private String color;
	tipoCarroceria tipo;

	public enum tipoCarroceria {
		INDEPENDIENTE, AUTOPORTANTE, TUBULAR
	}

	public Carroceria(String color, tipoCarroceria tipo) {
		super();
		this.color = color;
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public tipoCarroceria getTipo() {
		return tipo;
	}

	public void setTipo(tipoCarroceria tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Carroceria [color=" + color + ", tipo=" + tipo + "]";
	}

} // clase
