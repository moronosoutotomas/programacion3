package herencia4_tiendamascotas;

public class PerroMediano extends Perro {

	private final int precioVacunar = 125; // precio de vacunarlo

	public enum tipoRazaMediana {
		COLLIE, DALMATA, BULLDOG, GALGO, SABUESO
	}

	private tipoRazaMediana razaMediana;

	public PerroMediano(String nombre, int edad, colores color, float peso, boolean ppp, tipoRazaMediana razaMediana) {
		super(nombre, edad, color, peso, ppp);
		this.razaMediana = razaMediana;
	}

	public int getVacuna() {
		return precioVacunar;
	}

	public tipoRazaMediana getRazaMediana() {
		return razaMediana;
	}

	public void setRazaMediana(tipoRazaMediana razaMediana) {
		this.razaMediana = razaMediana;
	}

	@Override
	public String toString() {
		return "PerroMediano [razaMediana=" + razaMediana + ", peso=" + peso + ", ppp=" + ppp + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioVacunar;
	}

} // clase
