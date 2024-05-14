package herencia4_tiendamascotas;

import java.util.ArrayList;

import herencia4_tiendamascotas.GatoPelado.tipoPelado;
import herencia4_tiendamascotas.GatoPeloCorto.tipoPeloCorto;
import herencia4_tiendamascotas.GatoPeloLargo.tipoPeloLargo;
import herencia4_tiendamascotas.Mascota.colores;
import herencia4_tiendamascotas.PerroGrande.tipoRazaGrande;
import herencia4_tiendamascotas.PerroMediano.tipoRazaMediana;
import herencia4_tiendamascotas.PerroPequeño.tipoRazaPequeña;

public class testMascotasCalculoImpuestos {

//	Ejercicio Pepe		
//	- calcule impuestos municipales que ha de pagar una protectora sabiendo que tiene:
//	2 grandes
//	1 mediano
//	3 pequeños
//	2 pelolargo
//	3 pelocorto
//	1 pelado

	public static void main(String[] args) {

		ArrayList<Mascota> animalia = new ArrayList<Mascota>();

//		Jatos
		GatoPeloLargo peludo = new GatoPeloLargo("kakashi", 10, colores.TUNNING, 10, 20, tipoPeloLargo.BALINES);
		animalia.add(peludo);
		GatoPeloLargo pelongo = new GatoPeloLargo("itachi", 11, colores.ACERO, 10, 20, tipoPeloLargo.ANGORA);
		animalia.add(pelongo);

		GatoPeloCorto nanachi = new GatoPeloCorto("mishi1", 18, colores.BEIGE, 2, 4, tipoPeloCorto.DEVON_REX);
		animalia.add(nanachi);
		GatoPeloCorto komuki = new GatoPeloCorto("mishi2", 18, colores.ACERO, 2, 4, tipoPeloCorto.AZUL_RUSO);
		animalia.add(komuki);
		GatoPeloCorto meinya = new GatoPeloCorto("mishi3", 18, colores.ATIGRADO, 2, 4, tipoPeloCorto.BRITANICO);
		animalia.add(meinya);

		GatoPelado rubiales = new GatoPelado("rubi", 90, colores.BLANCO, 1290, 2000, tipoPelado.ELFO);
		animalia.add(rubiales);

//		Cans
		PerroGrande luca = new PerroGrande("lukita", 8, colores.NEGRO, 25, false, tipoRazaGrande.ROTWEILLER);
		animalia.add(luca);
		PerroGrande niro = new PerroGrande("niro", 14, colores.ATIGRADO, 20, false, tipoRazaGrande.DOBERMAN);
		animalia.add(niro);

		PerroMediano boli = new PerroMediano("bolingas", 12, colores.BEIGE, 10, false, tipoRazaMediana.SABUESO);
		animalia.add(boli);

		PerroPequeño chichi = new PerroPequeño("chichita", 9, colores.BEIGE, 10, true, tipoRazaPequeña.CHIHUAHUA);
		animalia.add(chichi);
		PerroPequeño charlie = new PerroPequeño("charlie", 4, colores.NARANJA, 12, true, tipoRazaPequeña.CANICHE);
		animalia.add(charlie);
		PerroPequeño troski = new PerroPequeño("troski", 9, colores.ACERO, 9, true, tipoRazaPequeña.YORKSHIRE_TERRIER);
		animalia.add(troski);

		int cuantiaTotal = 0;

		for (Mascota m : animalia) {
			cuantiaTotal += m.calculaImpuestos();

			if (m instanceof Gato) { // esto es DOWN CASTING
				((Gato) m).maulla();
			} else if (m instanceof Perro) {
				((Perro) m).ladra();
			} else {
				System.out.println("El animal es mudo");
			}

//			System.out.println(m.toString());
			System.out.println("El precio de " + m.nombre + ": " + m.calculaImpuestos());
//			System.out.println("La cuantía total es: " + cuantiaTotal);
		}

		System.out.println("TOTAL: " + cuantiaTotal);

	} // main
} // clase
