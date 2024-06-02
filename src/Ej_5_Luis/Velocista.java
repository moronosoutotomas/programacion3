package Ej_5_Luis;

public class Velocista extends Ciclista {

	private double potenciaPromedio;
	private double vSprintPromedio;

	public Velocista(int identificador, String nombre, double potenciaPromedio, double vSprintPromedio) {
		super(identificador, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.vSprintPromedio = vSprintPromedio;
	}

	/**
	 * @return the potenciaPromedio
	 */
	protected double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	/**
	 * @param potenciaPromedio the potenciaPromedio to set
	 */
	protected void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	/**
	 * @return the vSprintPromedio
	 */
	protected double getvSprintPromedio() {
		return vSprintPromedio;
	}

	/**
	 * @param vSprintPromedio the vSprintPromedio to set
	 */
	protected void setvSprintPromedio(double vSprintPromedio) {
		this.vSprintPromedio = vSprintPromedio;
	}

	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
		return "Es un " + this.getClass().getSimpleName();
	}

	@Override
	protected void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("Potencia Promedio =" + potenciaPromedio);
		System.out.println("Velocidad Promedio =" + vSprintPromedio);
	}

	@Override
	public String toString() {
		return "Velocista [potenciaPromedio=" + potenciaPromedio + ", vSprintPromedio=" + vSprintPromedio
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	protected double calculaTiempoParcial() {
		// TODO Auto-generated method stub
		this.setTiempoAcumulado(4 * this.vSprintPromedio + ((Math.random() * 15) + 5));
		return this.getTiempoAcumulado();
	}

}
