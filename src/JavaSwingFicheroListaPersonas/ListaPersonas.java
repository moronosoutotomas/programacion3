package JavaSwingFicheroListaPersonas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

	/**
	 * Método que guarda la lista de personas en un fichero dado
	 * @param namefichero
	 * @return
	 */
	public String guardarEnArchivo(String namefichero) {
		ArrayList<Persona> asig = this.listaPersonas;
		String mensaje = "Error";
		try {

			FileOutputStream fileOut = new FileOutputStream(namefichero);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			objectOut.writeObject(asig);

			objectOut.close();
			fileOut.close();
			mensaje = "Guardados en archivo correctamente.";

		} catch (IOException e) {
			mensaje = "Error al guardar en archivo: " + e.getMessage();

		}
		return mensaje;
	}

	/**
	 * Método que carga la lista de personas de un fichero dado
	 * @param namefichero
	 * @return
	 */
	public ArrayList<Persona> cargarDesdeArchivo(String namefichero) {

		try {
			FileInputStream fileIn = new FileInputStream(namefichero);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			// System.out.println("aqui llego");
			this.listaPersonas = (ArrayList<Persona>) objectIn.readObject();

			objectIn.close();
			fileIn.close();
			System.out.println("Cargados desde archivo correctamente.");
			;

		} catch (IOException | ClassNotFoundException cagada) {
			System.out.println("Error al cargar desde archivo: " + cagada.getMessage());

		}

		return this.listaPersonas;
	}

} // clase
