package trimestre3_ej_4A;

public class Contrarrelojista extends Ciclista {

	private double velocidadMaxima; // en km/h

	public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
		super(identificador, nombre);
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
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
		System.out.println("Velocidad máxima = " + velocidadMaxima);
	}

	@Override
	public void calculaTiempoParcial() {
		double vel = this.velocidadMaxima * 4;
		this.setTiempoAcumulado(this.getTiempoAcumulado() + vel);
		super.calculaTiempoParcial();
	}

} // clase
