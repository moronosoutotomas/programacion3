package herencia7_animales;

import java.util.ArrayList;

public class testAnimales {

	public static void main(String[] args) {

		ArrayList<Animal> madroa = new ArrayList<Animal>();

		Perro perro = new Perro();
		madroa.add(perro);
		Lobo lobo = new Lobo();
		madroa.add(lobo);
		Leon leon = new Leon();
		madroa.add(leon);
		Gato gato = new Gato();
		madroa.add(gato);

		System.out.println("Animais da madroa");

		for (Animal m : madroa) {
			if (m instanceof Perro) {
				System.out.println(((Perro) m).toString());
			} // perro

			if (m instanceof Lobo) {
				System.out.println(((Lobo) m).toString());
			} // lobo

			if (m instanceof Leon) {
				System.out.println(((Leon) m).toString());
			} // leon

			if (m instanceof Gato) {
				System.out.println(((Gato) m).toString());
			} // gato
		} // foreach

	} // main
} // clase
