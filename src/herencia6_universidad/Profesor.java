package herencia6_universidad;

public class Profesor extends Persona {

	String departamento;
	String categoria;

	public Profesor(String nombre, String direccion, String departamento, String categoria) {
		super(nombre, direccion);
		this.departamento = departamento;
		this.categoria = categoria;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void evalua() {
		System.out.println("Reparte las notas cada trimestre");
	}

	public void castiga() {
		System.out.println("Castiga a los que faltan al respeto");
	}

} // clase
