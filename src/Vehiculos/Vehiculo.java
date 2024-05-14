package Vehiculos;

public class Vehiculo {

	protected int velocidadActual, velocidadMaxima;

	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void acelerar(int velocidad) {
		this.velocidadActual += velocidad;
	}

	public void frenar(int velocidad) {
		this.velocidadActual -= velocidad;
	}

	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}

} // clase
