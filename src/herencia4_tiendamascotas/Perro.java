package herencia4_tiendamascotas;

public class Perro extends Mascota {

	protected float peso;
	protected boolean ppp; // Perro Potencialmente Peligroso
	protected final int chip = 100; // precio de chipearlo

	public Perro(String nombre, int edad, colores color, float peso, boolean ppp) {
		super(nombre, edad, color);
		this.peso = peso;
		this.ppp = ppp;
	}

	public int getChip() {
		return chip;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isPpp() {
		return ppp;
	}

	public void setPpp(boolean ppp) {
		this.ppp = ppp;
	}

	@Override
	public String toString() {
		return "Perro [peso=" + peso + ", ppp=" + ppp + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color
				+ "]";
	}

//	Método para ladrar.
	public void ladra() {
		System.out.println("Los perros ladran");
	}

	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + chip;
	}

} // clase
