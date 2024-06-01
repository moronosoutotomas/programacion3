package Ej_2A;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		Delantero d1 = new Delantero("TOMAS", "punta", 6, 19, 1, 0, 19, 0);
		Delantero d2 = new Delantero("MARIO", "mediapunta", 37, 2, 3, 0, 2, 1);
		Delantero d3 = new Delantero("ENRIQUE", "yo que se", 21, 7, 14, 5, 7, 2);
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(d1);
		jugadores.add(d2);
		jugadores.add(d3);

		//////////////// MOSTRAR EN TERMINAL //////////////////
//		for (Jugador j : jugadores) {
//			if (j instanceof Delantero) {
//				System.out.println("\n====================");
//				j.imprimir();
//			}
//		}

		//////////////// ESCRIBIR EN ARCHIVO //////////////////
		try {
//			FileWriter archivo = new FileWriter(
//					"C:\\Users\\Tomás\\eclipse-workspace\\EXAMEN_TERCERA\\src\\Ej_2A\\delanteros.dat");
//			PrintWriter impresor = new PrintWriter(archivo);

//			QUEDA GUARDADO EN EL PAQUETE DE ESTE MISMO EJERCICIO
			PrintWriter impresor2 = new PrintWriter(
					new FileWriter("C:\\Users\\Tomás\\eclipse-workspace\\tercero\\src\\Ej_2A\\delanteros.dat"));

			for (Jugador j : jugadores) {
				if (j instanceof Delantero) {
					impresor2.println("\n====================");
					impresor2.println(j.escribirEnFichero());
				}
			}
			impresor2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main
} // clase
