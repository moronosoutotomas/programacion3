package herencia10_medicina;

public class Alumno implements Entretenerse {

	private String nombre;
	private String centro;

	public Alumno(String nombre, String centro) {
		super();
		this.nombre = nombre;
		this.centro = centro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", centro=" + centro + "]";
	}

	@Override
	public void verVideos() {
		System.out.println("el alumno no ve videos. Solo atiende");
	}

	@Override
	public void escucharPodcasts() {
		System.out.println("el alumno no escucha podcast. ESta centrado en su trabajo");
	}

} // clase
