package herencia5_seleccion;

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
	public void darMasaje() {
		System.out.println("Da un masaje");
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", añosExperiencia=" + añosExperiencia + ", id=" + id
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

} // clase
