package Pedido;

public class test {

	public static void main(String[] args) {

		Producto carpeta = new Producto(1, "Carpeta", "carpeta anillada metálica", 1000);
		Producto tinta = new Producto(2, "Tinta", "tinta china de color negro", 3000);
		Producto cinta = new Producto(3, "Cinta Adhesiva", "cinta adhesiva", 800);
		Producto cartulina = new Producto(4, "Cartulina", "pliego de cartulina 60x40", 600);

		Orden orden1 = new Orden(1);
		System.out.println(orden1.toString());
		System.out.println();

		orden1.addItem(1, 5, carpeta);
		orden1.addItem(2, 3, tinta);
		orden1.addItem(3, 2, cinta);
		orden1.addItem(4, 4, cartulina);
		System.out.println(orden1.imprimirOrden());

	} // main
} // clase
