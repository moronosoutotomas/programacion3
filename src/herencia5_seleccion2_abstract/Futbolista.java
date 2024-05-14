package herencia5_seleccion2_abstract;

public class Futbolista extends SeleccionFutbol {

//	Atributos
	private int dorsal;
	private String demarcacion;

//	Constructores
	public Futbolista() {
		super();
	}

//	OJO!! Hay que fijarse al escoger de qué constructor generamos este
//	para que salgan todos los atributos deseados 
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

//	Getters y Setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

//	Métodos propios

	// Me veo obligado a sobrescribir el método que me falta porque sinó esta clase
	// sería abstracta (al heredar un método abstracto de su clase madre).
	@Override
	public void concentrarse() {
		System.out.println("Soy futbolista y me concentro con las hierbas");
	}

	@Override
	public void viajar() {
		System.out.println("Soy futbolista y viajo en avión");
	}

	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	public void jugarPartido() {
		System.out.println("Juega un partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

} // clase
