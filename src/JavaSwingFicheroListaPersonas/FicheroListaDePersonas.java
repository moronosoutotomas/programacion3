package JavaSwingFicheroListaPersonas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicheroListaDePersonas {

	/**
	 * Método para guardar una lista de personas
	 * 
	 * @param lista
	 */
	public void guardarEnFichero(ListaPersonas lista) {

		FileWriter archivo = null;
		PrintWriter impresor = null;

		try {
			archivo = new FileWriter("C:\\Users\\Tomás\\eclipse-workspace\\tercero\\src\\JavaSwing\\ListaPersonas.txt");
			impresor = new PrintWriter(archivo);

			for (Persona p : lista.listaPersonas) {
				impresor.println(p.toString());
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
	} // método

	/**
	 * Método para cargar una lista de personas desde un fichero
	 * 
	 * @return
	 * @throws Exception
	 */
	public ListaPersonas cargarDesdeFichero() throws Exception {

		ListaPersonas lista2 = null;
		String nombreArchivo = "C:\\Users\\Tomás\\eclipse-workspace\\tercero\\src\\JavaSwing\\ListaPersonas.txt";
		FileInputStream archivo;
		InputStreamReader conversor;
		BufferedReader filtro;
		String linea;

		try {
			archivo = new FileInputStream(nombreArchivo);
			conversor = new InputStreamReader(archivo);
			filtro = new BufferedReader(conversor);
			linea = filtro.readLine();

			while (linea != null) {
				lista2.listaPersonas.añadirPersona((Persona) (linea));
				linea = filtro.readLine();
			}
			filtro.close();
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo.");
		}

		returns lista2;

	} // método

} // clase
