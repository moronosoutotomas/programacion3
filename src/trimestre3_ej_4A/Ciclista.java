package trimestre3_ej_4A;

import java.util.Random;

public abstract class Ciclista {

	private int identificador; // identificador de un ciclista
	private String nombre; // nombre del ciclista
	private double tiempoParcial = 0; // tiempo parcial para cada etapa
	private double tiempoAcumulado = 0; // tiempo acumulado de un ciclista
	private int posicionGeneral;

	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	abstract String imprimirTipo();

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el puesto que ocupa un ciclista en la posición general de
	 * la competencia
	 * 
	 * @return El puesto del ciclista en la posición general
	 */

	public int getPosicionGeneral() {
		return posicionGeneral;
	}

	/**
	 * Método que establece el puesto que ocupa un ciclista en la posición general
	 * 
	 * @param Parámetro que especifica el puesto que ocupa un ciclista en la
	 *                  posición general
	 */
	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	/**
	 * Método que devuelve el tiempo acumulado de un ciclista en una competencia
	 * 
	 * @return El tiempo acumulado de un ciclista en una competencia
	 */
	public double getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	/**
	 * Método que establece el tiempo acumulado por un ciclista
	 * 
	 * @param Parámetro que especifica el tiempo acumulado por un ciclista
	 */
	public void setTiempoAcumulado(double tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public double getTiempoParcial() {
		return tiempoParcial;
	}

	public void setTiempoParcial(double tiempoParcial) {
		this.tiempoParcial = tiempoParcial;
	}

	/**
	 * Método que genera aleatoriamente el tiempo parcial de un ciclista (entre 5 y
	 * 20)
	 */
	public void calculaTiempoParcial() {
		Random random = new Random();
		this.tiempoParcial += random.nextInt(21) + 20; // OJO! Esto va acumulando...
	}

	/**
	 * Método que acumula el total de tiempos parciales de un ciclista
	 */
	public void acumulaTiempoTotal() {
		this.tiempoAcumulado += this.tiempoParcial;
	}

	/**
	 * Método que resetea a cero el tiempo de etapa de un ciclista
	 */
	public void reseteaTiempoParcial() {
		setTiempoParcial(0);
	}

	/**
	 * Método que muestra en pantalla los datos de un ciclista
	 */
	public void imprimir() {
		System.out.println("\nIdentificador = " + identificador);
		System.out.println("Nombre = " + nombre);
		System.out.println("Tiempo Parcial = " + tiempoParcial);
		System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
		System.out.println("Posición general = " + posicionGeneral);
	}

	@Override
	public String toString() {
		return "Ciclista [nombre=" + nombre + ", Parcial=" + tiempoParcial + ", Acumulado=" + tiempoAcumulado + "]";
	}

} // clase
