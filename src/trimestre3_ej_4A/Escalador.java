package trimestre3_ej_4A;

public class Escalador extends Ciclista {

	private double aceleracionPromedio; // en m/s
	private double gradoRampa; // en grados de inclinación

	public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
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
		System.out.println("Aceleración promedio = " + aceleracionPromedio);
		System.out.println("Grado promedio = " + gradoRampa);
	}

	@Override
	public void calculaTiempoParcial() {
		double vel = this.aceleracionPromedio * 3;
		double grad = this.gradoRampa * 5;
		this.setTiempoAcumulado(this.getTiempoAcumulado() + vel - grad);
		super.calculaTiempoParcial();
	}

} // clase
