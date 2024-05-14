package Biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private int añoPublicacion;
	private String editorial;
	private String isbn;

	/**
	 * Constructor por defecto, para tenerlo a mano en caso de necesitarlo en el menú.
	 */
	public Libro() {
	}

	/**
	 * Constructor original de la clase Libro para construír uno con todos sus atributos.
	 * @param titulo
	 * @param autor
	 * @param añoPublicacion
	 * @param editorial
	 * @param isbn
	 */
	public Libro(String titulo, String autor, int añoPublicacion, String editorial, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.editorial = editorial;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion + ", editorial="
				+ editorial + ", ISBN=" + isbn + "]";
	}

} // clase
