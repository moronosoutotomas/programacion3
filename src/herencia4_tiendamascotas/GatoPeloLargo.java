package herencia4_tiendamascotas;

public class GatoPeloLargo extends Gato {

	private final int precioDesparasitar = 200; // precio de desparasitarlo

	public enum tipoPeloLargo {
		ANGORA, HIMALAYO, BALINES, SOMALI
	}

	private tipoPeloLargo peloLargo;

	public GatoPeloLargo(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
			tipoPeloLargo peloLargo) {
		super(nombre, edad, color, alturaSalto, longitudSalto);
		this.peloLargo = peloLargo;
	}

	public int getPrecioDesparasitar() {
		return precioDesparasitar;
	}

	public tipoPeloLargo getPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(tipoPeloLargo peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public String toString() {
		return "GatoPeloLargo [peloLargo=" + peloLargo + ", alturaSalto=" + alturaSalto + ", longitudSalto="
				+ longitudSalto + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioDesparasitar;
	}

} // class
