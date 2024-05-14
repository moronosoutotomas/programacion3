package Circulo;

import java.awt.Color;

public class Circulo {

	private int radio;
	private Punto punto;
	Color colorete;

	public Circulo(int x, int y, int radio, Color color) {
		this.radio = radio;
		punto = new Punto(x, y);
		this.colorete = color;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public Color getColorete() {
		return colorete;
	}

	public void setColorete(Color colorete) {
		this.colorete = colorete;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + getRadio() + ", punto=" + punto + ", colorete=" + colorete + "]";
	}

} // clase
