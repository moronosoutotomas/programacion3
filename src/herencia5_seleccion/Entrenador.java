package herencia5_seleccion;

public class Entrenador extends SeleccionFutbol {

//	Atributos
	private String licencia;

//	Constructores
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String licencia) {
		super(id, nombre, apellidos, edad);
		this.licencia = licencia;
	}

//	Getters y Setters
	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

//	Métodos propios
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

	@Override
	public void viajar() {
		super.viajar();
		System.out.println("con un guiskito");
	}

	@Override
	public String toString() {
		return "Entrenador [licencia=" + licencia + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}

} // clase
