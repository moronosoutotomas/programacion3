package Ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Asignatura implements Serializable {

	static String NOMBRE_FICHERO = "notas.dat";

	int codigo;
	String nombre;
	int creditos;

	Asignatura(int codigo, String nombre, int creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	void imprimir() {
		System.out.println("Codigo de la asignatura = " + codigo);
		System.out.println("Nombre de la asignatura = " + nombre);
		System.out.println("Cantidad de creditos = " + creditos);
	}

	/**
	 * Método que almacena la colección de asignaturas en un archivo.
	 * 
	 * @param conjunto
	 */
	public static void guardar(ArrayList<Asignatura> conjunto) {
		try {
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(conjunto);
			objectOut.close();
			System.out.println("Asignaturas guardadas en archivo correctamente.");

		} catch (IOException kagada) {
			System.out.println("Error al guardar en archivo: " + kagada.getMessage());
		}
	}

	public static ArrayList<Asignatura> cargar() {
		ArrayList<Asignatura> notas = new ArrayList<Asignatura>();
		try {
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			notas = (ArrayList<Asignatura>) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println("Asignaturas cargadas desde archivo correctamente");
		} catch (IOException | ClassNotFoundException kagada) {
			System.out.println("Error al guardar en archivo: " + kagada.getMessage());
		}
		return notas;
	}

	/**
	 * Método que crea un archivo y guarda los datos de un objeto Asignatura
	 * * @throws IOException Excepción que indica que no se pudo escribir en el
	 * archivo
	 */
	void escribirAsignatura() {
		try {
			// Define el archivo donde se guardarán los datos del objeto
			FileOutputStream archivo = new FileOutputStream("asignatura.dat");
			// Crea el objeto de flujo de salida para la escritura del objeto
			ObjectOutputStream salida = new ObjectOutputStream(archivo);
			salida.writeObject(this); // Escribe el objeto en el flujo de salida
			salida.close(); // Cierra el flujo de salida de datos
		} catch (IOException e) {
			System.out.println("No se pudo escribir en el archivo");
		}
	}

	/**
	 * Método que leer un archivo de datos, los asigna a los atributos de un objeto
	 * Asignatura y muestra su contenido en pantalla
	 * 
	 * @throws FileNotFoundException Excepción que indica que no se pudo leer el
	 *                               archivo
	 * @throws IOException           Excepción que indica que se presentó un error
	 *                               de entrada/salida
	 * @throws Exception             Excepción general
	 */
	void leerAsignatura() {
		try {
			// Define el archivo a leer
			FileInputStream archivo = new FileInputStream("asignatura.dat");
			// Crea el objeto de flujo de entrada para la lectura del objeto
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			// Lee el objeto en el flujo de entrada
			Asignatura asignatura = (Asignatura) entrada.readObject();
			// MUESTRA EL RESULTADO DE LA LECTURA
			asignatura.imprimir();
			entrada.close(); // Cierra el flujo de entrada de datos
		} catch (FileNotFoundException e) {
			// Captura una excepción en caso de no encontrar el archivo
			System.out.println("No se pudo leer el archivo");
		} catch (IOException e) {
			/* Captura una excepción en caso de ocurrir un error de entrada/salida */
			System.out.println("Error de entrada/salida");
		} catch (Exception e) { // Captura una excepción general
			System.out.println("Error al leer el archivo");
		}
	}

} // clase
