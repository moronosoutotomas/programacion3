package herencia2;

import java.util.ArrayList;

import herencia2.Novela.genero;

public class testLibros {

//	Créame una colección de libros consistente en:
//	- 1 libro normal
//	- 2 libros de texto
//	- 2 libros de unc
//	- 3 novelas
//	Todos los libros tendrán un precio aleatorio entre 0-10€
//	Calcule el precio total de venta incluyendo un descuento
//	que se le pedirá al usuario.

	public static void main(String[] args) {

		float precioLibros = 0;
		ArrayList<Libro> libritos = new ArrayList<Libro>();

//		Libros normales
		Libro libroNormal = new Libro("El Quijote", "Cervantes");
		libritos.add(libroNormal);

//		Libros de texto
		LibroTexto libroTexto1 = new LibroTexto("El Quijote", "Miguel de Cervantes", "Primero A");
		LibroTexto libroTexto2 = new LibroTexto("Historias de la historia", "Nieves Concostrina", "Segundo B");
		libritos.add(libroTexto1);
		libritos.add(libroTexto2);

//		Libros de UNC
		LibrosDeTextoUNC libroTextoUNC1 = new LibrosDeTextoUNC("libro unc1", "Miguelito", "Primero A", "UNC");
		LibrosDeTextoUNC libroTextoUNC2 = new LibrosDeTextoUNC("libro unc2", "Nievecitas", "Segundo B", "UNC");
		libritos.add(libroTextoUNC1);
		libritos.add(libroTextoUNC2);

//		Novelas
		Novela novela1 = new Novela("novela1", "Anita", genero.HISTORICA);
		Novela novela2 = new Novela("novela2", "Maria", genero.AVENTURAS);
		Novela novela3 = new Novela("novela3", "Carmen", genero.FICCION);
		libritos.add(novela1);
		libritos.add(novela2);
		libritos.add(novela3);

		System.out.println("SU TICKET DE LA UNC\n");
		for (Libro l : libritos) {
			l.setPrecio((float) (1 + Math.random() * 10));
			precioLibros += l.getPrecio();
			System.out.println(" · " + l.getTitulo() + " cuesta " + l.getPrecio() + "€");
		}
		System.out.println("\nPrecio total libros: " + precioLibros + "€");

	} // main
} // clase
