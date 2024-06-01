package Ej_1B;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
	public static Scanner sc = new Scanner(System.in);
	private static ArrayList<Sala> salas = new ArrayList<Sala>();

	public static void main(String[] args) {
		int menu = 0;
		do {
			menu = menu();
			if (menu == 1)
				crearSala();
			if (menu == 2)
				introducirPersona();
			if (menu == 3)
				borrarPersona();
			if (menu == 4)
				listarCine();

		} while (menu != 5);

	}

	private static int menu() {
		System.out.println("Que quieres hacer:");
		System.out.println("1.Crear sala");
		System.out.println("2.Introducir persona");
		System.out.println("3.Quitar persona");
		System.out.println("4.Listar cine");
		System.out.println("5.Salir");
		return sc.nextInt();
	}

	private static void listarCine() {
		for (Sala s : salas) {
			s.imprimirSala();
			;
		}
	}

	private static void crearSala() {
		System.out.println("Dime capacidad de la sala");
		int capacidad = sc.nextInt();
		System.out.println("Dime numero de personas en la sala");
		int nPersonas = sc.nextInt();
		salas.add(new Sala(capacidad, nPersonas));
	}

	private static void introducirPersona() {
		for (Sala s : salas) {
			if (!s.isFull()) {
				s.añadirPersona();
				return;
			}
		}
	}

	private static void borrarPersona() {
		for (Sala s : salas) {
			if (!s.isEmpty()) {
				s.borrarPersona();
				return;
			}
		}
	}
}
