package herencia10_medicina;

public class Pediatra extends Medico {

	private tipologiaP tipo;

	public Pediatra(String nombre, tipologiaP tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public tipologiaP getTipo() {
		return tipo;
	}

	public void setTipo(tipologiaP tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pediatra [tipo=" + tipo + ", nombre=" + nombre + "]";
	}

	public void poneInyeccion() {
		System.out.println("Pone una inyección");
	}

} // clase
