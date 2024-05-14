package herencia2;

public class LibrosDeTextoUNC extends LibroTexto {

//	Atributos
	private String facultad;

//	Constructores
	public LibrosDeTextoUNC(String titulo, String autor, float precio, String curso, String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad = facultad;
	}

	public LibrosDeTextoUNC(String titulo, String autor, String curso, String facultad) {
		super(titulo, autor, curso);
		this.facultad = facultad;
	}

//	Getters / Setters
	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "LibrosDeTextoUNC [facultad=" + facultad + ", curso=" + curso + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}

} // clase
