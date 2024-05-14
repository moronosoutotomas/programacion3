package herencia4_tiendamascotas;

import java.util.ArrayList;

import herencia4_tiendamascotas.GatoPelado.tipoPelado;
import herencia4_tiendamascotas.GatoPeloCorto.tipoPeloCorto;
import herencia4_tiendamascotas.GatoPeloLargo.tipoPeloLargo;
import herencia4_tiendamascotas.Mascota.colores;
import herencia4_tiendamascotas.PerroGrande.tipoRazaGrande;
import herencia4_tiendamascotas.PerroMediano.tipoRazaMediana;
import herencia4_tiendamascotas.PerroPequeño.tipoRazaPequeña;

public class testMascotas {

	public static void main(String[] args) {

		ArrayList<Mascota> animalia = new ArrayList<Mascota>();

//		Jatos.
		GatoPelado rubiales = new GatoPelado("Rubiales", 45, colores.BLANCO, 10, 25, tipoPelado.ESFINGE);
		animalia.add(rubiales);
		GatoPeloCorto tomasito = new GatoPeloCorto("Ochoa", 12, colores.NARANJA, 1, 2, tipoPeloCorto.MANX);
		animalia.add(tomasito);
		GatoPeloLargo quique = new GatoPeloLargo("O Sogro", 26, colores.TUNNING, 2, 2, tipoPeloLargo.BALINES);
		animalia.add(quique);

//		Cans.
		PerroPequeño nico = new PerroPequeño("Nicolás", 18, colores.BEIGE, 4, true, tipoRazaPequeña.CANICHE);
		animalia.add(nico);
		PerroMediano marito = new PerroMediano("Mario", 21, colores.ATIGRADO, 15, false, tipoRazaMediana.DALMATA);
		animalia.add(marito);
		PerroGrande guadiana = new PerroGrande("Jacobito", 20, colores.ACERO, 30, false, tipoRazaGrande.ROTWEILLER);
		animalia.add(guadiana);

//		Mostramos el ArrayList.
		System.out.println("\n--- Casa de acogida CEBEM ---");
		for (Mascota m : animalia) {
			System.out.println(m.toString());
		}

//		Métodos para probar que maullamos y ladramos.
		System.out.println();
		tomasito.maulla();
		marito.ladra();

	} // main
} // clase
