package EquipoFutbolAgregacion;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		Portero portero = new Portero("Marito", "Cruz", 21, true, 10);
		Tecnico tecnico = new Tecnico("Pepe", "Domínguez", 57, 25, true);

		Defensa def1 = new Defensa("Yerry", "Mina", 24, true, 2);
		Defensa def2 = new Defensa("Davison", "Sánchez", 23, true, 2);
		Defensa def3 = new Defensa("William", "Tesillo", 29, true, 0);
		Defensa def4 = new Defensa("Stefan", "Medina", 29, true, 0);

		ArrayList<Defensa> defensas = new ArrayList<>();
		defensas.add(def1);
		defensas.add(def2);
		defensas.add(def3);
		defensas.add(def4);

		Mediocampo mc1 = new Mediocampo("Mateus", "Uribe", 28, true, 12);
		Mediocampo mc2 = new Mediocampo("Wilmar", "Sánchez", 25, true, 12);
		Mediocampo mc3 = new Mediocampo("Juan", "Tesillo", 31, true, 10);
		Mediocampo mc4 = new Mediocampo("James", "Medina", 28, true, 32);

		ArrayList<Mediocampo> mediocampos = new ArrayList<>();
		mediocampos.add(mc1);
		mediocampos.add(mc2);
		mediocampos.add(mc3);
		mediocampos.add(mc4);

		Delantero del1 = new Delantero("Radamel", "Falcao", 33, true, 15);
		Delantero del2 = new Delantero("Duván", "Zapata", 28, true, 12);

		ArrayList<Delantero> delanteros = new ArrayList<>();
		delanteros.add(del1);
		delanteros.add(del2);

		EquipoFutbol selecColombia = new EquipoFutbol("Selección de Colombia", "Colombia", portero, tecnico, defensas,
				mediocampos, delanteros);

		System.out.println(selecColombia.imprimir());

	} // main
} // clase
