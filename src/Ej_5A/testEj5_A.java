package Ej_5A;

public class testEj5_A {

	public static void main(String[] args) {

//		La carrera
		Carrera carrera = new Carrera("carrera", "Españita");

//		Equipo 1
		Equipo equipo1 = new Equipo("Equipo UNO", "A Guarda");
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
		Equipo equipo4 = new Equipo("Equipo CUATRO", "Tui");
//		ciclistas
		Velocista vel4 = new Velocista(11, "Velocista equipo1", 34, 44);
		Escalador esc4 = new Escalador(12, "Escalador equipo1", 14, 14);
		Contrarrelojista con4 = new Contrarrelojista(14, "Contrarrelojista equipo1", 74);
//		añadidos al equipo
		equipo4.añadirCiclista(vel4);
		equipo4.añadirCiclista(esc4);
		equipo4.añadirCiclista(con4);

//		equipos añadidos a la clasificación
		carrera.añadirEquipo(equipo1);
		carrera.añadirEquipo(equipo2);
		carrera.añadirEquipo(equipo3);
		carrera.añadirEquipo(equipo4);

//		ETAPA 1
		System.out.println("·········· ETAPA 1 ··········");
		for (Equipo e : carrera.listaEquipos) {
			for (Ciclista c : e.listaCiclistas) {
				c.calculaTiempoParcial();
				c.acumulaTiempoTotal();
//		ciclistas añadidos a la clasificación
				carrera.clasificacionGeneral.add(c);
			}
		}
		carrera.calculaYMuestraTiemposGenerales();

//		ETAPA 2
		System.out.println("·········· ETAPA 2 ··········");
		for (Equipo e : carrera.listaEquipos) {
			for (Ciclista c : e.listaCiclistas) {
				c.calculaTiempoParcial();
				c.acumulaTiempoTotal();
				carrera.clasificacionGeneral.add(c);
			}
		}
		carrera.calculaYMuestraTiemposGenerales();

//		ETAPA 3
		System.out.println("·········· ETAPA 3 ··········");
		for (Equipo e : carrera.listaEquipos) {
			for (Ciclista c : e.listaCiclistas) {
				c.calculaTiempoParcial();
				c.acumulaTiempoTotal();
				carrera.clasificacionGeneral.add(c);
			}
		}
		carrera.calculaYMuestraTiemposGenerales();

//		ETAPA 4
		System.out.println("·········· ETAPA 4 ··········");
		for (Equipo e : carrera.listaEquipos) {
			for (Ciclista c : e.listaCiclistas) {
				c.calculaTiempoParcial();
				c.acumulaTiempoTotal();
				carrera.clasificacionGeneral.add(c);
			}
		}
		carrera.calculaYMuestraTiemposGenerales();

	} // main
} // clase
