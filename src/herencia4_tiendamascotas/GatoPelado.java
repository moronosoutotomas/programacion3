package herencia4_tiendamascotas;

public class GatoPelado extends Gato {

	private final int precioDesparasitar = 50; // precio de desparasitarlo
	
	public enum tipoPelado {
		ESFINGE, ELFO, DONSKOY
	}

	private tipoPelado pelado;

	public GatoPelado(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
			tipoPelado pelado) {
		super(nombre, edad, color, alturaSalto, longitudSalto);
		this.pelado = pelado;
	}
	
	public int getPrecioDesparasitar() {
		return precioDesparasitar;
	}

	public tipoPelado getPelado() {
		return pelado;
	}

	public void setPelado(tipoPelado pelado) {
		this.pelado = pelado;
	}

	@Override
	public String toString() {
		return "GatoPelado [pelado=" + pelado + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioDesparasitar;
	}

} // class
