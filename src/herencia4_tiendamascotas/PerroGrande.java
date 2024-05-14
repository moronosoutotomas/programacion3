package herencia4_tiendamascotas;

public class PerroGrande extends Perro {

	private final int precioVacunar = 150; // precio de vacunarlo

	public enum tipoRazaGrande {
		PASTOR_ALEMAN, DOBERMAN, ROTWEILLER
	}

	private tipoRazaGrande razaGrande;

	public PerroGrande(String nombre, int edad, colores color, float peso, boolean ppp, tipoRazaGrande raza) {
		super(nombre, edad, color, peso, ppp);
		this.razaGrande = raza;
	}

	public int getVacuna() {
		return precioVacunar;
	}

	public tipoRazaGrande getRaza() {
		return razaGrande;
	}

	public void setRaza(tipoRazaGrande raza) {
		this.razaGrande = raza;
	}

	@Override
	public String toString() {
		return "PerroGrande [raza=" + razaGrande + ", peso=" + peso + ", ppp=" + ppp + ", nombre=" + nombre + ", edad="
				+ edad + ", color=" + color + "]";
	}
	
	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioVacunar;
	}

} // clase
