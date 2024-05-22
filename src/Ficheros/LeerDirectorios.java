package Ficheros;

import java.io.File;

public class LeerDirectorios {

	public static void main(String[] args) {

		File directorio = new File("C:\\Users\\Primero DAM\\eclipse-workspace\\tercero\\src");

		String[] archivos = directorio.list();
		for (int i = 0; i < archivos.length; i++) {
			System.out.println("Archivo: " + archivos[i]);
		}

	} // main
} // clase
