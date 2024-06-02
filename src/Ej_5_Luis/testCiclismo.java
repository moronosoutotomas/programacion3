package Ej_5_Luis;

import java.util.ArrayList;
import java.util.Collections;

public class testCiclismo {

	public static double randTiempo() {
		return (Math.random() * 100);
	}

	public static void main(String[] args) {

		ArrayList<Ciclista> clasi = new ArrayList<Ciclista>();
		ArrayList<Equipo> eqs = new ArrayList<Equipo>();

		Equipo equipito = new Equipo("Ciclados SA", "Es PAIN");
		Equipo equipito2 = new Equipo("Ciclados SA2", "Es Mucho PAIN");
		Equipo equipito3 = new Equipo("Ciclados SA2", "Es Gigantesco PAIN");
		Equipo equipito4 = new Equipo("Ciclados SA2", "Es Maximo PAIN");

		System.out.println("Equipo:\n");
		equipito.imprimir();
		System.out.println();

		Ciclista c1 = new Velocista(43, "Paco Vazquez", 56.98, 12.34);
		c1.setTiempoAcumulado(randTiempo());
		c1.imprimir();
		equipito.añadirCiclista(c1);
		equipito2.añadirCiclista(c1);
		equipito3.añadirCiclista(c1);
		equipito4.añadirCiclista(c1);
		System.out.println();
		Ciclista c2 = new Escalador(42, "Felipe contador", 34.89f, 35);
		c2.setTiempoAcumulado(randTiempo());
		c2.imprimir();
		equipito.añadirCiclista(c2);
		equipito2.añadirCiclista(c2);
		equipito3.añadirCiclista(c2);
		equipito4.añadirCiclista(c2);
		System.out.println();
		Ciclista c3 = new Contrarrelojista(44, "Armando Cadenas", 34);
		c3.setTiempoAcumulado(randTiempo());
		c3.imprimir();
		equipito.añadirCiclista(c3);
		equipito2.añadirCiclista(c3);
		equipito3.añadirCiclista(c3);
		equipito4.añadirCiclista(c3);
		Velocista c4 = new Velocista(45, "Paco Vazquez", 56.98, 12.34);

		System.out.println("Relleno el equipo y calculos tiempos");

		eqs.add(equipito);
		eqs.add(equipito2);
		eqs.add(equipito3);
		eqs.add(equipito4);

		for (int j = 1; j < 5; j++) {
			System.out.println("\n");
			System.out.println("Etapa " + j);

			for (Equipo equipo : eqs) {
				equipo.correrEtapa();
			}

			System.out.println("\nClasificacion individual: ");

			for (Equipo equipo : eqs) {
				clasi.addAll(equipo.listaCiclistas);
			}

			Collections.sort(clasi);
			for (Ciclista ciclista : clasi) {
				ciclista.imprimir();
			}
			clasi.clear();

			System.out.println("\nClasificacion por euipos: ");
			Collections.sort(eqs);
			for (Equipo equipo : eqs) {
				equipo.calcularTotalTiempo();
				System.out.println(equipo.getTotalTiempo());
			}

		}

	}

}
