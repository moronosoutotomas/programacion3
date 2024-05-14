package herencia9_carrera_ciclista;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

	private String nombre; // Atributo que define el nombre del equipo de ciclismo
	private static double totalTiempo; // Atributo que define el tiempo total obtenido por el equipo
	private String pais; // Atributo que define el país al que pertenece el equipo
	private int posicion;
	ArrayList<Ciclista> listaCiclistas; // Atributo que define un ArrayList de ciclistas

	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
		listaCiclistas = new ArrayList<>(); // Se crea el ArrayList de ciclistas que conforma el equipo
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTotalTiempo() {
		return totalTiempo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * Método que añade un ciclista al ArrayList de ciclistas de un equipo
	 */
	void añadirCiclista(Ciclista ciclista) {
		listaCiclistas.add(ciclista); // Se agrega el ciclista al ArrayList de ciclistas
	}

	/**
	 * Método que muestra en pantalla los nombres de los ciclistas que conforman un
	 * equipo
	 */
	void listarEquipo() {
		/*
		 * Se recorre el ArrayList de ciclistas y para cada elemento se imprime el
		 * nombre del ciclista
		 */
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ciclista c = (Ciclista) listaCiclistas.get(i); // Se aplica casting para extraer el elemento
			System.out.println(c.getNombre());
		}
	}

	/**
	 * Método que busca un ciclista ingresado por teclado
	 */
	void buscarCiclista() {
		System.out.println("Dame nombre:");
		Scanner sc = new Scanner(System.in); // Se solicita texto ingresado por teclado
		boolean existe = false;
		String nombreCiclista = sc.nextLine();
		for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el ArrayList de ciclistas
			Ciclista c = (Ciclista) listaCiclistas.get(i); // Se obtiene un elemento del ArrayList
			if (c.getNombre().equals(nombreCiclista)) { // Si el nombre ingresado se encuentra
				c.imprimir();
				existe = true;
			}
		} // for

		if (!existe) {
			System.out.println("Lo siento, no se ha encontrado ningún ciclista con ese ID.");
		}
		sc.close();
	}

	/**
	 * Método que busca un ciclista buscado por su ID
	 */
	void buscarCiclistaPorID() {
		Scanner sc = new Scanner(System.in); // Se solicita ID ingresado por teclado
		int idCiclista = 0;
		boolean existe = false; // Variable auxiliar para mostrar un mensaje en caso de no existir el ciclista
		boolean encuentraAlCiclista = false;

		do {
			System.out.println("Por favor, a continuación introduce el ID a buscar:");
			idCiclista = sc.nextInt();

			if (idCiclista > listaCiclistas.size()) {
				System.out.println(
						"Lo siento, solamente tenemos " + listaCiclistas.size() + " ciclistas en nuestro equipo.");
			} else {
				for (Ciclista c : listaCiclistas) {
					if (c.getIdentificador() == idCiclista) {
						c.imprimir();
						existe = true;
						encuentraAlCiclista = true;
					}
				} // for-each

				if (!existe) {
					System.out.println("Lo siento, no se ha encontrado ningún ciclista con ese ID.");
				}
			} // if-else

		} while (!encuentraAlCiclista);

		sc.close();
	} // buscarCiclistaPorID

	/**
	 * Método que calcula el tiempo total de un equipo acumulando el tiempo obtenido
	 * por cada uno de sus ciclistas
	 */
	void calcularTotalTiempo() {
		for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el ArrayList
			Ciclista c = (Ciclista) listaCiclistas.get(i); // Se obtiene un elemento del ArrayList
			// Se acumula el tiempo del ciclista en el tiempo del equipo
			totalTiempo += c.getTiempoAcumulado();
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

} // clase
