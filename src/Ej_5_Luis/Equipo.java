package Ej_5_Luis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Equipo implements Comparable<Equipo> {

	public static int scanyInt(String texto) {
		boolean error;
		int res = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res = sc.nextInt();
				error = false;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, dame un entero.");
				error = true;
			}

		} while (error);

		return res;

	}

	public static String scanyStringLine(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		return sc.nextLine();

	}

	private int posicion;

	private String nombre; /* Atributo que define el nombre del equipo de ciclismo */

	private static double totalTiempo; /* Atributo que define el tiempo total obtenido por el equipo */

	private String pais; /* Atributo que define el país al que pertenece el equipo */

	protected ArrayList<Ciclista> listaCiclistas; // Atributo que define un vector de objetos ciclista

	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
		listaCiclistas = new ArrayList<>(); /* Se crea el vector de ciclistas que conforma el equipo */
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Método que añade un ciclista al vector de ciclistas de un equipo
	 */
	void añadirCiclista(Ciclista ciclista) {
		listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
	}

	/**
	 * Método que muestra en pantalla los nombres de los ciclistas que conforman un
	 * equipo
	 */
	void listarEquipo() {
		/*
		 * Se recorre el vector de ciclistas y para cada elemento se imprime el nombre
		 * del ciclista
		 */
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se aplica casting para extraer el elemento */
			System.out.println(c.getNombre());
		}
	}

	void correrEtapa() {
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se aplica casting para extraer el elemento */
			c.calculaTiempoParcial();
			listaCiclistas.set(i, c);
		}
	}

	/**
	 * Método que busca un ciclista ingresado por teclado
	 */
	void buscarCiclista() {
		/* Se solicita texto ingresado por teclado */
		String nombreCiclista = scanyStringLine("Dame el nombre del ciclista:");
		boolean presente = false;
		for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector de ciclistas */
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se obtiene un elemento del vector */
			if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre ingresado se encuentra */
				presente = true;
				System.out.println(c.getNombre());
			}
		}
		if (!presente) {
			System.out.println("No existe en el equipo nadie con el nombre " + nombreCiclista);
		}
	}

	void buscarCiclista2() {
		/* Se solicita texto ingresado por teclado */
		int id = scanyInt("Dame el id del ciclista:");
		boolean presente = false;
		for (Ciclista c : listaCiclistas) {
			if (c.getIdentificador() == id) {
				presente = true;
				System.out.println("Esta en el equipo, sus datos son: \n" + c.toString());
			}
		}
		if (!presente) {
			System.out.println("No existe en el equipo nadie con la id " + id);
		}
	}

	/**
	 * Método que calcula el tiempo total de un equipo acumulando el tiempo obtenido
	 * por cada uno de sus ciclistas
	 */
	void calcularTotalTiempo() {
		for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se obtiene un elemento del vector */
			// Se acumula el tiempo del ciclista en el tiempo del equipo
			totalTiempo += c.getTiempoAcumulado();
		}
	}

	void reseteartiempos() {
		for (int i = 0; i < this.listaCiclistas.size(); i++) {
			Ciclista c = this.listaCiclistas.get(i);
			c.reseteaTiempoAcumulado();
			this.listaCiclistas.set(i, c);

		}

	}

	/**
	 * Método que muestra en pantalla los datos de un equipo
	 */
	void imprimir() {
		System.out.println("Nombre del equipo = " + nombre);
		System.out.println("Pais = " + pais);
		System.out.println("Total tiempo del equipo = " + totalTiempo);
	}

	@Override
	public String toString() {
		return "Equipo [posicion=" + posicion + ", nombre=" + nombre + ", pais=" + pais + ", listaCiclistas="
				+ listaCiclistas + "]";
	}

	@Override
	public int compareTo(Equipo o) {
		// TODO Auto-generated method stub
		double dif = this.totalTiempo - o.totalTiempo;
		int res;
		if (dif > 0) {
			res = 1;

		} else if (dif == 0) {
			res = 0;
		} else {
			res = -1;
		}
		return res;
	}

	/**
	 * @return the totalTiempo
	 */
	public static double getTotalTiempo() {
		return totalTiempo;
	}

	/**
	 * @param totalTiempo the totalTiempo to set
	 */
	public static void setTotalTiempo(double totalTiempo) {
		Equipo.totalTiempo = totalTiempo;
	}

}
