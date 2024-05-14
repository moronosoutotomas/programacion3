package herencia10_medicina;

public class Medico implements Entretenerse {

	protected String nombre;

	public Medico(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + "]";
	}

	public void tomaTension() {
		System.out.println("Toma la tensión");
	}

	@Override
	public void verVideos() {
		System.out.println("medico ve video de operaciones quirurgicas");
	}

	@Override
	public void escucharPodcasts() {
		System.out.println("medico oye podcast de practica clinica");
	}

} // clase
