package herencia6_universidad;

public class Persona {

	String nombre;
	String direccion;

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void asisteAlCentro() {
		System.out.println("Va al centro a intentar cumplir sus funciones");
	}

	public void respira() {
		System.out.println("Si todo va bien, respira");
	}

} // clase
