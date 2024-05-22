package Ficheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LecturaYEscrituraFicherosTexto {

	/**
	 * Método que evalúa si un caracter dado es una vocal.
	 * @param c
	 * @return
	 */
	public static boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) throws Exception {
		String archivoOriginal = "original.txt";
		FileInputStream archivo;
		InputStreamReader conversor;
		BufferedReader filtro;
		String linea;

		try {
			archivo = new FileInputStream(archivoOriginal);
			conversor = new InputStreamReader(archivo);
			filtro = new BufferedReader(conversor);
			linea = filtro.readLine();

			FileWriter archivoReceptor = null;
			PrintWriter impresor = null;

			try {
				archivoReceptor = new FileWriter("final.txt");
				impresor = new PrintWriter(archivoReceptor);

				while (linea != null) {
					char[] array = linea.toCharArray();

					for (int i = 0; i < array.length; i++) {
						if (esVocal(array[i])) {
							array[i] = Character.toUpperCase(array[i]);
						}
					}

					impresor.write(new String(array));
					linea = filtro.readLine();
				}

				System.out.println("Escritura finalizada correctamente.");
				filtro.close();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (archivoReceptor != null)
						archivoReceptor.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo.");
		}

	} // main
} // clase
