package herencia5_seleccion2_abstract;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

//		Atributos
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

//		Constructores
	public SeleccionFutbol() {

	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

//		Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

//		Métodos propios
	public abstract void concentrarse();

	public abstract void viajar();

	public void entrenar() {
		System.out.println("Entrenar (Clase Padre)");
	}

	public void jugarPartido() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}

} // clase
