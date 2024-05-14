package herencia6_universidad;

public class Alumno extends Persona {

	String carrera;
	int semestre;

	public Alumno(String nombre, String direccion, String carrera, int semestre) {
		super(nombre, direccion);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public void estudia() {
		System.out.println("Estudia porque mañana tiene examen");
	}

	public void suspende() {
		System.out.println("Si no estudia suficiente, suspende");
	}

} // clase
