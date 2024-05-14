package herencia10_medicina;

public class Ortopedista extends Medico {

	private tipologiaO tipo;

	public Ortopedista(String nombre, tipologiaO tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public tipologiaO getTipo() {
		return tipo;
	}

	public void setTipo(tipologiaO tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + ", nombre=" + nombre + "]";
	}

	public void revisaProtesis() {
		System.out.println("Revisa la prótesis");
	}

} // clase
