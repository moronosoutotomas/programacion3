package herencia9_carrera_ciclista;

public class testCarreraCiclista {

	public static void main(String[] args) {

		Equipo movistarTeam = new Equipo("Movistar Team", "España");

		Velocista velocista = new Velocista(1, "Alex Aranburu", 200, 62);
		movistarTeam.añadirCiclista(velocista);
		velocista.setTiempoAcumulado(342);

		Escalador escalador = new Escalador(2, "Jorge Arcas", 3, 28);
		movistarTeam.añadirCiclista(escalador);
		escalador.setTiempoAcumulado(442);

		Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Oier Lazkano", 59);
		movistarTeam.añadirCiclista(contrarrelojista);
		contrarrelojista.setTiempoAcumulado(642);

		System.out.println("--- TOTAL TIEMPOS ---");
		movistarTeam.calcularTotalTiempo();
		System.out.println(movistarTeam.getTotalTiempo() + " minutos");

		System.out.println("\n--- CICLISTAS DEL EQUIPO ---");
		for (Ciclista c : movistarTeam.listaCiclistas) {
			System.out.println("El nombre del ciclista es: " + c.getNombre() + ". " + c.imprimirTipo());
		}

//		System.out.println("\n--- DATOS DEL CICLISTA POR ID ---");
//		equipo.buscarCiclistaPorID();

//		System.out.println("\n--- DATOS DEL CICLISTA POR NOMBRE ---");
//		equipo.buscarCiclista();

		Carrera elTour = new Carrera("El Tour de Francia", "Francia");
//		Etapa nizaEtapa = new Etapa(elTour.getNombreCompeticion(), 1, 208, "montaña");
//		elTour.añadirEtapa(nizaEtapa);
//		Etapa parisEtapa = new Etapa(elTour.getNombreCompeticion(), 2, 173, "llano");
//		elTour.añadirEtapa(parisEtapa);
//
//		System.out.println("\n--- INFO DE CADA ETAPA ---");
//		for (Etapa e : elTour.listaEtapas) {
//			System.out.println("Las etapa " + e.getNumEtapa() + " del Tour es de tipo: " + e.getTipoEtapa());
//		}

//		Añadimos el equipo existente y creamos uno nuevo para testear que imprime con el formateo que quiero
		elTour.añadirEquipo(movistarTeam);
		Equipo uaeTeam = new Equipo("UAE Team Emirates", "UAE");
		elTour.añadirEquipo(uaeTeam);

		System.out.println("\n--- INFO DE CADA EQUIPO ---");
		for (Equipo e : elTour.listaEquipos) {
			e.imprimir();
			System.out.println();
		}

//		testeo Pepe 24/04	///////////////////////////////////////////////////////
//		System.out.println("\n--- TESTEO PEPE ---");
//		Carrera facil = new Carrera("facil");
//		facil.clasificacionGeneral.add(contrarrelojista);
//		facil.clasificacionGeneral.add(velocista);
//		facil.clasificacionGeneral.add(escalador);
//		facil.calculaYMuestraTiemposGenerales();

//		testeo Tomás 24/04	///////////////////////////////////////////////////////
		System.out.println("\n--- TESTEO TOMÁS ---\n");
		Carrera dificil = new Carrera("difícil", "Italia");
		Equipo ineosTeam = new Equipo("INEOS Grenadiers", "UK");
		dificil.añadirEquipo(movistarTeam);
		dificil.añadirEquipo(ineosTeam);

		Velocista egan = new Velocista(7, "Egan Bernal", 360, 62);
		ineosTeam.añadirCiclista(egan);
		dificil.clasificacionGeneral.add(egan);

		Velocista geraint = new Velocista(8, "Geraint Thomas", 310, 62);
		ineosTeam.añadirCiclista(geraint);
		dificil.clasificacionGeneral.add(geraint);

		Contrarrelojista filippo = new Contrarrelojista(9, "Filippo Ganna", 62);
		ineosTeam.añadirCiclista(filippo);
		dificil.clasificacionGeneral.add(filippo);

		dificil.calculaYMuestraTiemposGenerales();

	} // main
} // clase
