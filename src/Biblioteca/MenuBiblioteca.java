package Biblioteca;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

public class MenuBiblioteca {

	public static void main(String[] args) {

		int opcion;
		String titulo = "", autor = "", editorial = "", isbn = "";
		int indice, añoPublicacion;
		LocalDate fechaActual = LocalDate.now();
		int añoActual = fechaActual.getYear();

		Scanner sc = new Scanner(System.in);

		do {
//			Usuarios normales
			System.out.println("\nCOLECCIÓN DE LIBROS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo libro");
			System.out.println("3. Modificar SOLO los datos");
			System.out.println("4. Cambiar SOLO el código");
			System.out.println("5. Borrar");

//			Socios
			System.out.println("\nSOLO PARA SOCIOS");
			System.out.println("6. Guardar libros a FICHERO");
			System.out.println("7. Cargar libros desde FICHERO");

//			Salir del programa
			System.out.println("8. Salir");

			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO DE LIBROS");
				System.out.println("=======");
//				TODO: por algún motivo falla la ordenación.
//				Collections.sort(Biblioteca.coleccionDeLibros);

//				Manipulación del caso en que el usuario lista la colección de discos vacía.
				try {
					for (Libro l : Biblioteca.coleccionDeLibros) {
						System.out.println(l);
					}
				} catch (Exception NullPointerException) {
					System.out.println(
							"\n*** Oops! Colección vacía, añada algún libro o cargue alguna colección por favor ***");
				}

				break;

			case 2:
				System.out.println("\nNUEVO LIBRO");
				System.out.println("===========");

				System.out.println("Introduzca el código del libro NUEVO:");
				isbn = sc.nextLine();
				indice = Biblioteca.dimeIndiceDeCodigo(isbn);

				if (indice == -1) {

					System.out.println("Por favor, introduzca los datos del libro:");
//					System.out.println("Código (de 4 letras mayúsculas + 2 enteros): ");
//					codigoIntro = sc.nextLine();
					System.out.println("Autor: ");
					autor = sc.nextLine();
					System.out.println("Título: ");
					titulo = sc.nextLine();
					System.out.println("Año de publicación: ");
					añoPublicacion = sc.nextInt();

					Biblioteca.coleccionDeLibros.add(new Libro(titulo, autor, añoPublicacion, editorial, isbn));
					System.out.println("Libro añadido con código: " + isbn);
				} else {
					System.out.println("Código no disponible");
				}

				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				System.out.println("Introduzca el código del libro a MODIFICAR:");
				isbn = sc.nextLine();
				indice = Biblioteca.dimeIndiceDeCodigo(isbn);

				try {
					if (indice != -1) {
//					Si encontró el código lo meto en un entero y guardo los datos del disco
//					en concreto en "mod".
						Libro mod = Biblioteca.coleccionDeLibros.get(indice);
						System.out.println("Introduzca los nuevos datos del libro o INTRO para dejarlos igual.");

						// No deberíamos permitir tocar el código
//					System.out.println("Código: " + discos[i].getCodigo());
//					System.out.print("Nuevo código: ");
//					codigoIntro = sc.nextLine();
//					if (!codigoIntro.equals("")) {
//						discos[i].setCodigo(codigoIntro);
//					}

						System.out.println("Autor: " + mod.getAutor());
						System.out.print("Nuevo autor: ");
						autor = sc.nextLine();
						if (!autor.equals("")) {
							mod.setTitulo(autor);
						}

						System.out.println("Título: " + mod.getTitulo());
						System.out.print("Nuevo título: ");
						titulo = sc.nextLine();
						if (!titulo.equals("")) {
							mod.setTitulo(titulo);
						}

						System.out.println("Año de publicación: " + mod.getAñoPublicacion());
						System.out.print("Nuevo año de publicación: ");
						añoPublicacion = sc.nextInt();

//					He obviado que es un LIBRO no un MANUSCRITO asique directamente no tengo en
//					cuenta que sea anterior al siglo IV. Es una aproximación que podríamos discutir
//					si no me viniese importando un bledo que libro meta aqui el usuario.
						if (añoPublicacion > 300 && añoPublicacion <= añoActual) {
							mod.setAñoPublicacion(añoPublicacion);
						}

						Biblioteca.coleccionDeLibros.set(indice, mod);
						System.out.println("Album MODIFICADO con código: " + isbn);
					}

				} catch (Exception NullPointerException) {
					System.out.println("Lo sentimos mucho, el código introducido no existe.");
				}

				break;

			case 4:
				System.out.println("\nCAMBIO de CÓDIGO");
				System.out.println("======");

				System.out.println("Por favor, introduzca el código del disco que desea CAMBIAR:");
				isbn = sc.nextLine();
				indice = Biblioteca.dimeIndiceDeCodigo(isbn);

				if (indice != -1) {
//					Código encontrado
					Libro mod = Biblioteca.coleccionDeLibros.get(indice);
					System.out.println("Código: " + mod.getISBN());
					System.out.print("Nuevo código: ");
					isbn = sc.nextLine();
					if (!isbn.equals("")) {
						mod.setISBN(isbn);
					}

				} else {
					System.out.println("Código no encontrado");
				}

				break;

			case 5:
				System.out.println("\nBORRAR");
				System.out.println("======");

				System.out.println("Introduzca el código del disco que desea eliminar:");
				isbn = sc.nextLine();
				indice = Biblioteca.dimeIndiceDeCodigo(isbn);

				try {
					if (indice != -1) {
						Biblioteca.coleccionDeLibros.remove(indice);
						System.out.println("Album borrado");
					}
				} catch (Exception NullPointerException) {
					System.out.println("Lo sentimos mucho, el código introducido no existe.");
				}

				break;

			case 6:

				System.out.println("\nGUARDADO en FICHERO externo");
				System.out.println("======");

				Biblioteca.guardarColeccionDeLibrosEnArchivo();

				break;

			case 7:

				System.out.println("\nCARGADO desde FICHERO externo");
				System.out.println("======");

				Biblioteca.cargarColeccionDeLibrosEnArchivo();

				break;

			default:

			} // switch
		} while (opcion != 8);

		sc.close();
	} // main
} // clase
