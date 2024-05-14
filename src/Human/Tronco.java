package Human;

public class Tronco {

	String nombre;
	double ancho;
	double largo;
	boolean ombligo = true;
	
	public Tronco() {
	}

	public Tronco(String nombre, double ancho, double largo, boolean ombligo) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.ombligo = ombligo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public boolean isOmbligo() {
		return ombligo;
	}

	public void setOmbligo(boolean ombligo) {
		this.ombligo = ombligo;
	}

	@Override
	public String toString() {
		return "Tronco [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", ombligo=" + ombligo + "]";
	}

} // clase
