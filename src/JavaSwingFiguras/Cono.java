package JavaSwingFiguras;

public class Cono extends FiguraGeometrica {

	private double altura;
	private double alturaInclinada;
	private double radio;

	public Cono(double altura, double alturaInclinada, double radio) {
		this.altura = altura;
		this.alturaInclinada = alturaInclinada;
		this.radio = radio;
		this.setVolumen(calcularVolumen()); // Calcula el volumen y establece su atributo
		this.setSuperficie(calcularSuperficie()); // Calcula la superficie y establece su atributo
	}

	public double calcularVolumen() {
		double volumen = (Math.PI * altura * (Math.pow(radio, 2))) / 3;
		return volumen;
	}

	public double calcularSuperficie() {
		double area = Math.PI * radio * (radio + alturaInclinada);
		return area;
	}

} // clase
