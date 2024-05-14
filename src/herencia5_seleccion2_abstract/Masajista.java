package herencia5_seleccion2_abstract;

public class Masajista extends SeleccionFutbol {

//	Atributos
	private String titulacion;
	private int añosExperiencia;

//	Constructores
	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.añosExperiencia = añosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

//	Métodos propios

	// Me veo obligado a sobrescribir el método que me falta porque sinó esta clase
	// sería abstracta (al heredar un método abstracto de su clase madre).
	@Override
	public void concentrarse() {
		System.out.println("Soy fisio y me concentro haciendo respiraciones diafragmáticas");
	}

	@Override
	public void viajar() {
		System.out.println("Soy fisio y viajo en bodega sin transportín");
	}

	public void entrenar() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un masaje");
	}

} // clase
