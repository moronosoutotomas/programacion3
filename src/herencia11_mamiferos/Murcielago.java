package herencia11_mamiferos;

public class Murcielago extends Mamifero implements Volador {

	@Override
	void amamantarCrias() {
		System.out.println("El murciélago amamanta a sus crías.");
	}

	public void volar(String parametro) {
		System.out.println("El murciélago vuela " + parametro + ".");
	}

} // clases
