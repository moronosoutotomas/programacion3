package JavaSwing;

public class Persona {

	String nombre; // Atributo que identifica el nombre de una persona
	String apellidos; // Atributo que identifica los apellidos de una persona
	String telefono; // Atributo que identifica el teléfono de una persona
	String direccion; // Atributo que identifica la dirección de una persona

	public Persona(String nombre, String apellidos, String teléfono, String dirección) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = teléfono;
		this.direccion = dirección;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return nombre + "-" + apellidos + "-" + telefono + "-" + direccion;
	}

} // clase
