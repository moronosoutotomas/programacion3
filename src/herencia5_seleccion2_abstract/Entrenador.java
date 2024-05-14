package herencia5_seleccion2_abstract;

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

	// Me veo obligado a sobrescribir el método que me falta porque sinó esta clase
	// sería abstracta (al heredar un método abstracto de su clase madre).
	@Override
	public void concentrarse() {
		System.out.println("Soy entrenador y me concentro con los destilados");
	}

	@Override
	public void viajar() {
		System.out.println("Soy entrenador y viajo en primera clase");
	}

	public void jugarPartido() {
		System.out.println("Dirige un partido (Clase Entrenador)");
	}

	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}

} // clase
