package Ej_5_Luis;

public class Escalador extends Ciclista {

	private float aPromedioSubida;
	private float gradoRampa;

	public Escalador(int identificador, String nombre, float aPromedioSubida, float gradoRampa) {
		super(identificador, nombre);
		this.aPromedioSubida = aPromedioSubida;
		this.gradoRampa = gradoRampa;
	}

	/**
	 * @return the aPromedioSubida
	 */
	public float getaPromedioSubida() {
		return aPromedioSubida;
	}

	/**
	 * @param aPromedioSubida the aPromedioSubida to set
	 */
	public void setaPromedioSubida(float aPromedioSubida) {
		this.aPromedioSubida = aPromedioSubida;
	}

	/**
	 * @return the gradoRampa
	 */
	public float getGradoRampa() {
		return gradoRampa;
	}

	/**
	 * @param gradoRampa the gradoRampa to set
	 */
	public void setGradoRampa(float gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	@Override
	protected void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("AceleracionPromedioSubida=" + aPromedioSubida);
		System.out.println("Grado rampa " + gradoRampa);
	}

	@Override
	public String toString() {
		return "Escalador [aPromedioSubida=" + aPromedioSubida + ", gradoRampa=" + gradoRampa + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
		return "Es un " + this.getClass().getSimpleName();
	}

	@Override
	protected double calculaTiempoParcial() {
		// TODO Auto-generated method stub
		this.setTiempoAcumulado(3 * this.aPromedioSubida + ((Math.random() * 15) + 5));
		return this.getTiempoAcumulado();
	}

}
