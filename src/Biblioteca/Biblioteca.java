package Biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Biblioteca {

	private String nombre;
	static ArrayList<Libro> coleccionDeLibros;
	public static final String NOMBRE_FICHERO = "MisLibros.obj";

//	Se podría sobrecargar constructor, haciendo uno con un ArrayList dado y el
//	otro usando la colección por defecto. En este caso solo habrá 1 colección.
	public Biblioteca(String nombre, ArrayList<Libro> libros) {
		this.nombre = nombre;
		Biblioteca.coleccionDeLibros = libros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que añade un libro a la colección "biblioteca".
	 * 
	 * @param libro
	 */
	public void añadirLibro(Libro libro) {
		Biblioteca.coleccionDeLibros.add(libro);
	}

	/**
	 * Método que elimina un libro a la colección "biblioteca".
	 * 
	 * @param libro
	 */
	public void eliminarLibro(Libro libro) {
		Biblioteca.coleccionDeLibros.remove(libro);
	}

	/**
	 * Método que lista los libros de la colección "biblioteca".
	 */
	public void listarLibros() {
		for (Libro l : coleccionDeLibros) {
			l.toString();
		}
	}

	/**
	 * Método que comprueba si el código del libro existe en la colección.
	 * 
	 * @param codigo
	 * @return
	 */
	public static int dimeIndiceDeCodigo(String codigo) {
//		TODO: problema de diseño con el código y el ISBN, no son compatibles por su tipo.
//		Habría que revisar e igualar ambos tipos y modificar las partes del programa para
//		su correcta implementación.
		int index = -1;

		try {
			for (int i = 0; i < Biblioteca.coleccionDeLibros.size(); i++) {
				if (Biblioteca.coleccionDeLibros.get(i).getISBN().equals(codigo))
					index = i;
			}
		} catch (Exception NullPointerException) {
			System.out.println("El código introducido no existe.");
		}

		return index;
	}

	/**
	 * Método que que sirve para guardar el output a un archivo.
	 */
	public static void guardarColeccionDeLibrosEnArchivo() {
		try {
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

//			Escribimos objetos en el flujo de salida
			objectOut.writeObject(Biblioteca.coleccionDeLibros);

			objectOut.close();
			fileOut.close();
			System.out.println("Discos guardados en archivo correctamente.");
		} catch (IOException e) {
			System.out.println("Error al guardar en archivo: " + e.getMessage());
		}
	}

	/**
	 * Método que sirve para cargar una colección de libros desde un archivo.
	 */
	@SuppressWarnings("unchecked")
	public static void cargarColeccionDeLibrosEnArchivo() {
//		TODO: Podría mejorarse este método pudiendo pasarle un archivo como parámetro para
//		cargarlo en lugar de trabajar siempre con el mismo nombre.
		try {
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//			Casteamos la ccolección a obtener
			Biblioteca.coleccionDeLibros = (ArrayList<Libro>) objectIn.readObject();

			objectIn.close();
			fileIn.close();
			System.out.println("Discos cargados desde archivo correctamente.");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error al cargar desde archivo: " + e.getMessage());
		}
	}

} // clase
