package repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {

	public static ArrayList<String> pueblaLista() {
		ArrayList<String> numeros = new ArrayList<String>();
		numeros.add("uno");
		numeros.add("dos");
		numeros.add("tres");
		numeros.add("cuatro");
		numeros.add("cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		numeros.add("nueve");
		numeros.add("diez");

		return numeros;
	}

	public static void main(String[] args) {

		ArrayList<String> array = pueblaLista();
//		for (int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}

//		Elemento recorrido por un Iterator
		System.out.println("Elementos del array recorridos por Iterator");

		Iterator<String> iterator = array.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator.remove();

		System.out.println("Elementos después de remover Iterator");
		iterator = array.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	} // main
} // clase
