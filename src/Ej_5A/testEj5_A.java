package Ej_5A;

import java.util.ArrayList;
import java.util.Collections;

public class testEj5_A {

	public static void main(String[] args) {

//		Conjunto de equipos para consultar las diveraas clasificaciones
		ArrayList<Equipo> clasificacion = new ArrayList<Equipo>();

//		Equipo 1
		Equipo equipo1 = new Equipo("Equipo UNO", "Tui");
//		ciclistas
		Velocista vel1 = new Velocista(1, "Velocista equipo1", 31, 41);
		Escalador esc1 = new Escalador(2, "Escalador equipo1", 11, 11);
		Contrarrelojista con1 = new Contrarrelojista(3, "Contrarrelojista equipo1", 71);
//		añadidos al equipo
		equipo1.añadirCiclista(vel1);
		equipo1.añadirCiclista(esc1);
		equipo1.añadirCiclista(con1);

//		Equipo 2
		Equipo equipo2 = new Equipo("Equipo DOS", "Porriño");
//		ciclistas
		Velocista vel2 = new Velocista(4, "Velocista equipo2", 32, 42);
		Escalador esc2 = new Escalador(5, "Escalador equipo2", 12, 12);
		Contrarrelojista con2 = new Contrarrelojista(6, "Contrarrelojista equipo2", 72);
//		añadidos al equipo
		equipo2.añadirCiclista(vel2);
		equipo2.añadirCiclista(esc2);
		equipo2.añadirCiclista(con2);

//		Equipo 3
		Equipo equipo3 = new Equipo("Equipo TRES", "Vigo");
//		ciclistas
		Velocista vel3 = new Velocista(7, "Velocista equipo3", 33, 43);
		Escalador esc3 = new Escalador(8, "Escalador equipo3", 13, 13);
		Contrarrelojista con3 = new Contrarrelojista(9, "Contrarrelojista equipo3", 73);
//		añadidos al equipo
		equipo3.añadirCiclista(vel3);
		equipo3.añadirCiclista(esc3);
		equipo3.añadirCiclista(con3);

//		Equipo 4
		Equipo equipo4 = new Equipo("Equipo CUATRO", "A Guarda");
//		ciclistas
		Velocista vel4 = new Velocista(11, "Velocista equipo1", 34, 44);
		Escalador esc4 = new Escalador(12, "Escalador equipo1", 14, 14);
		Contrarrelojista con4 = new Contrarrelojista(14, "Contrarrelojista equipo1", 74);
//		añadidos al equipo
		equipo4.añadirCiclista(vel4);
		equipo4.añadirCiclista(esc4);
		equipo4.añadirCiclista(con4);

//		equipos añadidos a la clasificación
		clasificacion.add(equipo1);
		clasificacion.add(equipo2);
		clasificacion.add(equipo3);
		clasificacion.add(equipo4);

//////	ETAPA 1		
		System.out.println("\nCLASIFICACIÓN POR EQUIPOS");

		for (Equipo e : clasificacion) {
//		Preparación de la etapa: todos corren la etapa.
			for (Ciclista c : e.listaCiclistas) {
				c.calculaTiempoParcial();
				c.acumulaTiempoTotal();
				System.out.println(c.getNombre() + " hizo " + c.getTiempoParcial() + " en la primera etapa");
			}

// 			Calculamos el total del tiempo por equipo
			e.calcularTotalTiempo();
//			Ordenamos la clasificación
			Collections.sort(clasificacion);
			System.out.println("Tiempo total del " + e.getNombre() + ": " + e.getTotalTiempo());
		}

	} // main
} // clase
