package herencia2;

public class Novela extends Libro {

//	Atributos
	public enum genero {
		HISTORICA, ROMANTICA, POLICIACA, REALISTA, FICCION, AVENTURAS
	};

	private genero tipoNovela;

//	Constructores
	public Novela(String titulo, String autor, float precio, genero tipoNovela) {
		super(titulo, autor, precio);
		this.tipoNovela = tipoNovela;
	}

	public Novela(String titulo, String autor, genero tipoNovela) {
		super(titulo, autor);
		this.tipoNovela = tipoNovela;
	}

//	Getters / Setters
	public genero getTipoNovela() {
		return tipoNovela;
	}

	public void setTipoNovela(genero tipoNovela) {
		this.tipoNovela = tipoNovela;
	}

	@Override
	public String toString() {
		return "Novela [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

} // clase
