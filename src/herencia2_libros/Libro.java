package herencia2_libros;

import java.util.Objects;

public class Libro {

//	Atributos
	protected String titulo;
	protected String autor;
	protected float precio;

//	Constructores
	public Libro(String titulo, String autor, float precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

//	Getters/Setters
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

} // clase
