package trimestre3_ej_4A;

public class Velocista extends Ciclista {

	private double potenciaPromedio; // en vatios
	private double velocidadPromedio; // en km/h

	public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
		super(identificador, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	/**
	 * Método muestra en pantalla la clase a la que pertenece el objeto.
	 * 
	 * @return El tipo de la clase.
	 */
	@Override
	public String imprimirTipo() {
		String tipo = "Es un " + this.getClass().getSimpleName();
		return tipo;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Potencia promedio = " + potenciaPromedio);
		System.out.println("Velocidad promedio = " + velocidadPromedio);
	}

	@Override
	public void calculaTiempoParcial() {
		double vel = this.velocidadPromedio * 5;
		double pot = this.potenciaPromedio * 2;
		this.setTiempoAcumulado(this.getTiempoAcumulado() + vel - pot);
		super.calculaTiempoParcial();
	}

} // clase
