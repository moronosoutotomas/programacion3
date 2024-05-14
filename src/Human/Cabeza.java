package Human;

public class Cabeza {

	String nombre;
	int num_ojos;
	boolean peludo = true;
	double longitudSombrero;

	public Cabeza() {
	}

	public Cabeza(String nombre, int num_ojos, boolean peludo, double longitudSombrero) {
		this.nombre = nombre;
		this.num_ojos = num_ojos;
		this.peludo = peludo;
		this.longitudSombrero = longitudSombrero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_ojos() {
		return num_ojos;
	}

	public void setNum_ojos(int num_ojos) {
		this.num_ojos = num_ojos;
	}

	public boolean isPeludo() {
		return peludo;
	}

	public void setPeludo(boolean peludo) {
		this.peludo = peludo;
	}

	public double getLongitudSombrero() {
		return longitudSombrero;
	}

	public void setLongitudSombrero(double longitudSombrero) {
		this.longitudSombrero = longitudSombrero;
	}

	@Override
	public String toString() {
		return "Cabeza [nombre=" + nombre + ", num_ojos=" + num_ojos + ", peludo=" + peludo + ", longitudSombrero="
				+ longitudSombrero + "]";
	}

} // clase
