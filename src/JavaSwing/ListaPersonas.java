package JavaSwing;

import java.util.ArrayList;

public class ListaPersonas {

	ArrayList<Persona> listaPersonas; // Atributo que identifica un vector de personas

	public ListaPersonas() {
		listaPersonas = new ArrayList<Persona>(); // Crea el ArrayList de personas
	}

	/**
	 * Método que permite agregar una persona al ArrayList de personas
	 * 
	 * @param p Parámetro que define la persona a agregar al ArrayList de personas
	 */
	public void añadirPersona(Persona p) {
		listaPersonas.add(p);
	}

	/**
	 * Método que permite eliminar una persona del ArrayList de personas
	 * 
	 * @param i Parámetro que define la posición a eliminar en el ArrayList de
	 *          personas
	 */
	public void eliminarPersona(int i) {
		if (i < listaPersonas.size())
			listaPersonas.remove(i);
	}

	/**
	 * Método que permite eliminar todos los elementos del ArrayList de personas
	 */
	public void borrarLista() {
		listaPersonas.removeAll(listaPersonas);
	}

} // clase
