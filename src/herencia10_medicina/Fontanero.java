package herencia10_medicina;

public class Fontanero implements Entretenerse {

	private String nombre;
	private int licencia;

	public Fontanero(String nombre, int licencia) {
		super();
		this.nombre = nombre;
		this.licencia = licencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLicencia() {
		return licencia;
	}

	public void setLicencia(int licencia) {
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return "Fontanero [nombre=" + nombre + ", licencia=" + licencia + "]";
	}

	@Override
	public void verVideos() {
		System.out.println("ve videos de ñapas");
	}

	@Override
	public void escucharPodcasts() {
		System.out.println("el fontanero oye podcasts de goteras");
	}

} // clase
