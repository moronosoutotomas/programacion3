package herencia4_tiendamascotas;

public class GatoPeloCorto extends Gato {

	private final int precioDesparasitar = 100; // precio de desparasitarlo
	
	public enum tipoPeloCorto {
		AZUL_RUSO, BRITANICO, MANX, DEVON_REX
	}

	private tipoPeloCorto peloCorto;

	public GatoPeloCorto(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
			tipoPeloCorto peloCorto) {
		super(nombre, edad, color, alturaSalto, longitudSalto);
		this.peloCorto = peloCorto;
	}
	
	public int getPrecioDesparasitar() {
		return precioDesparasitar;
	}

	public tipoPeloCorto getPeloCorto() {
		return peloCorto;
	}

	public void setPeloCorto(tipoPeloCorto peloCorto) {
		this.peloCorto = peloCorto;
	}

	@Override
	public String toString() {
		return "GatoPeloCorto [peloCorto=" + peloCorto + ", alturaSalto=" + alturaSalto + ", longitudSalto="
				+ longitudSalto + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioDesparasitar;
	}

} // class
