package Ej_5A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Carrera {

	private String nombre;
	private String pais;
	ArrayList<Equipo> listaEquipos; // Atributo que define un ArrayList de equipos que participan en la carrera
	ArrayList<Ciclista> clasificacionGeneral; // ArrayList con la clasificación GENERAL de la competición

	public Carrera(String nombreCompeticion, String pais) {
		this.nombre = nombreCompeticion;
		this.pais = pais;
		listaEquipos = new ArrayList<>();
		clasificacionGeneral = new ArrayList<>();
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

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public ArrayList<Ciclista> getClasificacionGeneral() {
		return clasificacionGeneral;
	}

	public void setClasificacionGeneral(ArrayList<Ciclista> clasificacionGeneral) {
		this.clasificacionGeneral = clasificacionGeneral;
	}

	/**
	 * Método que añade un equipo al ArrayList de equipos
	 */
	public void añadirEquipo(Equipo equipo) {
		listaEquipos.add(equipo);
	}

	/**
	 * Método que lista los equipos que participan en la carrera
	 */
	public void listarEquipos() {
		for (int i = 0; i < listaEquipos.size(); i++) {
			Equipo e = (Equipo) listaEquipos.get(i);
			e.imprimir();
		}
	}

	/**
	 * Método booleano que pregunta el nombre del equipo a buscar y devuelve true si
	 * lo encuentra o false si no lo encuentra
	 * 
	 * @return true or false
	 */
	public boolean buscarEquipo() {
		boolean esta = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual ese el nombre del equipo a buscar?");
		String nombre = sc.next();
		for (Equipo e : listaEquipos)
			if (e.getNombre().equals(nombre))
				esta = true;
		sc.close();
		return esta;
	}

	// TODO: esto no sirve para nada, no se ni de donde salió
	public void clasificacionEquipos() {
		for (int i = 0; i < listaEquipos.size(); i++) {
			Equipo e = listaEquipos.get(i);
			e.imprimir();
		}
		// Clasificacion ciclista

		ListIterator<Equipo> iter = listaEquipos.listIterator();
		// Mientras haya elementos en la siguiente posicion
		while (iter.hasNext()) {
			// Se obtiene el siguiente metodo y se establece su posicion
			// el nextindex es para pasar a la siguiente posicion
			iter.next().setPosicion(iter.nextIndex());
			// Avanzar al siguiente elemento de la lista
			iter.next().imprimir();
		}

	}

	/**
	 * Método que imprime la clasificación de la carrera
	 */
	public void imprimirClasificacion() {
		ListIterator<Ciclista> iter = clasificacionGeneral.listIterator();
		// Mientras haya siguiente puesto se imprime el equipo
		while (iter.hasNext()) {
			iter.next().imprimir();
			;
		}
	}

	/**
	 * Método que calcula y muestra los diversos tiempos de la carrera ciclista
	 */
	public void calculaYMuestraTiemposGenerales() {
		Ciclista c;

//		Calcula general
		for (int i = 0; i < clasificacionGeneral.size(); i++) {
			c = clasificacionGeneral.get(i);
			c.acumulaTiempoTotal();
		}

//		Ordena general
		Collections.sort(clasificacionGeneral,
				(o1, o2) -> (int) (o1.getTiempoAcumulado()) - (int) (o2.getTiempoAcumulado()));

//		Muestra la clasificación general
		System.out.println("\n========== CLASIFICACIÓN GENERAL ==========");
		for (Ciclista manolin : clasificacionGeneral) {
			manolin.imprimir();
		}

//		Calcula parcial
		for (int i = 0; i < clasificacionGeneral.size(); i++) {
			c = clasificacionGeneral.get(i);
			c.calculaTiempoParcial();
		}

//		Ordena parcial
		Collections.sort(clasificacionGeneral,
				(o1, o2) -> (int) (o1.getTiempoAcumulado()) - (int) (o2.getTiempoAcumulado()));

//		Muestra la clasificación parcial
		System.out.println("\n========== CLASIFICACIÓN PARCIAL ==========");
		for (Ciclista manolin : clasificacionGeneral) {
			manolin.imprimir();
		}

//		Calcula por equipos
		for (Equipo e : listaEquipos) {
			e.calcularTotalTiempo();
		}

//		Ordena por tiempos de equipo
		Collections.sort(listaEquipos, (o1, o2) -> (int) (o1.getTotalTiempo()) - (int) (o2.getTotalTiempo()));

//		Muestra la clasificación por equipos
		System.out.println("\n========== CLASIFICACIÓN POR EQUIPOS ==========");
		for (Equipo e : listaEquipos) {
			e.imprimir();
		}
	}

} // clase
