package Human;

public class Pierna {

	String nombre;
	double longitud;
	int num_dedos;
	
	public Pierna() {
	}

	public Pierna(String nombre, double longitud, int num_dedos) {
		this.nombre = nombre;
		this.longitud = longitud;
		this.num_dedos = num_dedos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getNum_dedos() {
		return num_dedos;
	}

	public void setNum_dedos(int num_dedos) {
		this.num_dedos = num_dedos;
	}

	@Override
	public String toString() {
		return "Pierna [nombre=" + nombre + ", longitud=" + longitud + ", num_dedos=" + num_dedos + "]";
	}

} // clase
