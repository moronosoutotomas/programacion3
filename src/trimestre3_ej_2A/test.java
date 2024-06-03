package trimestre3_ej_2A;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import trimestre3_ej_3A.Inmueble;

public class test {

	public static float generaPrecio() {
		return (float) (1 + Math.random() * 199);
		// Si pongo 200, al ser float se pasarían por encima los decimales
	}

	public static int generaCantidad() {
		return (int) (1 + Math.random() * 6);
	}

	public static void guardarProductos(Orden orden) {
		FileWriter archivo = null;

//		Esto es una chapuza pero funciona jajaja
		PrintWriter impresor = null;
		ArrayList<Orden> ordenes = new ArrayList<Orden>();

		ordenes.add(orden);
		try {
			archivo = new FileWriter(
					"C:\\Users\\Primero DAM\\eclipse-workspace\\tercero\\src\\trimestre3_ej_2A\\papeleria_tomas.txt");
			impresor = new PrintWriter(archivo);

			for (Orden o : ordenes) {
				impresor.println(o.imprimirOrden());
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
	} // guardar

	public static void main(String[] args) {

		Orden orden1 = new Orden(1);

		Producto carpeta = new Producto(1, "Carpeta", "carpeta anillada metálica", generaPrecio());
		Producto tinta = new Producto(2, "Tinta", "tinta china de color negro", generaPrecio());
		Producto cinta = new Producto(3, "Cinta Adhesiva", "cinta adhesiva", generaPrecio());
		Producto cartulina = new Producto(4, "Cartulina", "pliego de cartulina 60x40", generaPrecio());
		Producto pegamento = new Producto(5, "Pegamento", "pegamento medio de barra", generaPrecio());
		Producto lapiz = new Producto(6, "Lapiz", "staedler H2, un clásico", generaPrecio());

		orden1.addItem(1, generaCantidad(), carpeta);
		orden1.addItem(2, generaCantidad(), tinta);
		orden1.addItem(3, generaCantidad(), cinta);
		orden1.addItem(4, generaCantidad(), cartulina);
		orden1.addItem(5, generaCantidad(), pegamento);
		orden1.addItem(6, generaCantidad(), lapiz);
		System.out.println(orden1.imprimirOrden());
		guardarProductos(orden1);

	} // main
} // clase
