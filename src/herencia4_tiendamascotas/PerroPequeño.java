package herencia4_tiendamascotas;

public class PerroPequeño extends Perro {

	private final int precioVacunar = 100; // precio de vacunarlo

	public enum tipoRazaPequeña {
		CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA
	}

	private tipoRazaPequeña razaPequeña;

	public PerroPequeño(String nombre, int edad, colores color, float peso, boolean ppp, tipoRazaPequeña razaPequeña) {
		super(nombre, edad, color, peso, ppp);
		this.razaPequeña = razaPequeña;
	}

	public int getVacuna() {
		return precioVacunar;
	}

	public tipoRazaPequeña getRazaPequeña() {
		return razaPequeña;
	}

	public void setRazaPequeña(tipoRazaPequeña razaPequeña) {
		this.razaPequeña = razaPequeña;
	}

	@Override
	public String toString() {
		return "PerroPequeño [razaPequeña=" + razaPequeña + ", peso=" + peso + ", ppp=" + ppp + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}

	protected int calculaImpuestos() {
		return super.calculaImpuestos() + precioVacunar;
	}

} // clase
