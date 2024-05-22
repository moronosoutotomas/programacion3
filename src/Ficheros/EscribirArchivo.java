package Ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

// TODO - Enunciado de examen: coge de un archivo un texto pon las vocales en
// mayúsculas y escríbelo en otro fichero.

public class EscribirArchivo {

	public static void main(String[] args) {

		FileWriter archivo = null;
		PrintWriter impresor = null;

		try {

			archivo = new FileWriter("escritura.txt");
			impresor = new PrintWriter(archivo);
			System.out.println("Comenzando escritura (tienes 10 líneas disponibles)");

			for (int i = 0; i < 10; i++) {
				impresor.println("Linea " + i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (archivo != null)
					archivo.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("Fin escritura");
	} // main
} // clase
