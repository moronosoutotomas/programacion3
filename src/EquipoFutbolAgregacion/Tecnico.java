package EquipoFutbolAgregacion;

public class Tecnico extends Persona {

	int añosExperiencia;
	boolean esNacional;

	public Tecnico(String nombre, String apellidos, int edad, int añosExperiencia, boolean esNacional) {
		super(nombre, apellidos, edad);
		this.añosExperiencia = añosExperiencia;
		this.esNacional = esNacional;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public boolean isEsNacional() {
		return esNacional;
	}

	public void setEsNacional(boolean esNacional) {
		this.esNacional = esNacional;
	}

	@Override
	public String toString() {
		return "Tecnico [añosExperiencia=" + añosExperiencia + ", esNacional=" + esNacional + "]";
	}

} // clase
