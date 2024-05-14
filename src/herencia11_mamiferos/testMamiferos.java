package herencia11_mamiferos;

import java.util.ArrayList;

public class testMamiferos {

	public static void main(String[] args) {

		ArrayList<Mamifero> animalia = new ArrayList<>();
		Ornitorrinco mario = new Ornitorrinco();
		animalia.add(mario);
		Ballena quique = new Ballena();
		animalia.add(quique);
		Gato tomas = new Gato();
		animalia.add(tomas);
		Murcielago miro = new Murcielago();
		animalia.add(miro);

		mario.ponerHuevos();

		for (Mamifero m : animalia) {
			m.amamantarCrias();
			if (m instanceof Ornitorrinco)
				((Ornitorrinco) m).ponerHuevos();

			if (m instanceof Murcielago)
				((Murcielago) m).volar("alto como el grajo");
		}

	} // main
} // clase
