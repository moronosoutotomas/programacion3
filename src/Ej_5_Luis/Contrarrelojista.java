package Ej_5_Luis;

public class Contrarrelojista extends Ciclista {

	private double vmax;

	public Contrarrelojista(int identificador, String nombre, double vmax) {
		super(identificador, nombre);
		this.vmax = vmax;
	}

	/**
	 * @return the vmax
	 */
	public double getVmax() {
		return vmax;
	}

	/**
	 * @param vmax the vmax to set
	 */
	public void setVmax(double vmax) {
		this.vmax = vmax;
	}

	@Override
	protected void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("Velocidad Maxima=" + vmax);
	}

	@Override
	public String toString() {
		return "Contrarrelojista [vmax=" + vmax + ", toString()=" + super.toString() + "]";
	}

	@Override
	String imprimirTipo() {
		// TODO Auto-generated method stub
		return "Es un " + this.getClass().getSimpleName();
	}

	@Override
	protected double calculaTiempoParcial() {
		// TODO Auto-generated method stub
		this.setTiempoAcumulado(4 * this.vmax + ((Math.random() * 15) + 5));
		return this.getTiempoAcumulado();
	}

}
