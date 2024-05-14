package herencia11_mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo {

	@Override
	void amamantarCrias() {
		System.out.println("El ornitorrinco amamanta sus crías.");
	}

	@Override
	public void ponerHuevos() {
		System.out.println("El ornitorrinco pone huevos de uno en uno.");

	}

} // clase
