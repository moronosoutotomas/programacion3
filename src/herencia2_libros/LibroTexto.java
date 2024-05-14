package herencia2_libros;

public class LibroTexto extends Libro {

//	Atributos
	protected String curso;

//	Constructores
	public LibroTexto(String titulo, String autor, float precio, String curso) {
		super(titulo, autor, precio);
		this.curso = curso;
	}

	public LibroTexto(String titulo, String autor, String curso) {
		super(titulo, autor);
		this.curso = curso;
	}

//	Getters / Setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "LibroTexto [curso=" + curso + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

} // clase
