package herencia4_tiendamascotas;

public class Gato extends Mascota {

	protected double alturaSalto;
	protected double longitudSalto;
	protected final int chip = 75; // precio de chipearlo

	public Gato(String nombre, int edad, colores color, double alturaSalto, double longitudSalto) {
		super(nombre, edad, color);
		this.alturaSalto = alturaSalto;
		this.longitudSalto = longitudSalto;
	}

	public double getAlturaSalto() {
		return alturaSalto;
	}

	public void setAlturaSalto(int alturaSalto) {
		this.alturaSalto = alturaSalto;
	}

	public double getLongitudSalto() {
		return longitudSalto;

	}

	public int getChip() {
		return chip;
	}

	public void setLongitudSalto(int longitudSalto) {
		this.longitudSalto = longitudSalto;
	}

	@Override
	public String toString() {
		return "Gato [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}

//	Método para maullar.
	public void maulla() {
		System.out.println("Los gatos maúllan y ronronean");
	}

	@Override
	protected int calculaImpuestos() {
		return super.calculaImpuestos() + chip;
	}

} // clase
