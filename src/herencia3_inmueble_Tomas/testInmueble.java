package herencia3_inmueble_Tomas;

import java.util.HashMap;
import java.util.Iterator;

import herencia3_inmueble_Tomas.Local.tipo;

public class testInmueble {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////	ESTRUCTURA JERÁRQUICA DEL PROGRAMA INMUEBLE	////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//																		Inmueble
//								Vivienda 									|| 				Local
//				Casa 				| 				Apartamento 			||		Comercial | Oficina
//	Rural 		| 		Urbana 		||		Apartaestudio | Familiar
//				Conjunto | Independiente

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {

//		Creamos una colección para meter inmuebles al estilo TheGrefg
		HashMap<Integer, Inmueble> monopoly = new HashMap<Integer, Inmueble>();

//		Y a medida que sacamos abuelitas ... añadimos suelo :D
		Inmueble inmueblecito = new Inmueble(1, 100, "Hispanidad nº 33");
		monopoly.put(inmueblecito.getIdInmobiliario(), inmueblecito);
		Vivienda viviendita = new Vivienda(2, 110, "Randufe Gateño 32", 7, 2);
		monopoly.put(viviendita.getIdInmobiliario(), viviendita);
		Local localcito = new Local(3, 120, "Gran Vía 16", tipo.CALLE);
		monopoly.put(localcito.getIdInmobiliario(), localcito);
		CasaRural casaRuralcita = new CasaRural(4, 130, "Rúa Concordia 29", 3, 5, 1, 30);
		monopoly.put(casaRuralcita.getIdInmobiliario(), casaRuralcita);
		CasaUrbana casaUrbanita = new CasaUrbana(5, 140, "Rúa Ourense 11", 3, 2, 1);
		monopoly.put(casaUrbanita.getIdInmobiliario(), casaUrbanita);
		Apartaestudio estudiiiito = new Apartaestudio(6, 150, "Rúa Casal Aboy 7", 3, 2, 90000.01);
		monopoly.put(estudiiiito.getIdInmobiliario(), estudiiiito);
		ApartamentoFamiliar AquiNoHayQuienViva = new ApartamentoFamiliar(7, 160, "Augusto Glez Besada 17", 5, 2,
				90000.02);
		monopoly.put(AquiNoHayQuienViva.getIdInmobiliario(), AquiNoHayQuienViva);
		ConjuntoCerrado urbanizacioncita = new ConjuntoCerrado(8, 170, "Pazos de Reis 21", 3, 2, 1, 90000.03, true,
				false);
		monopoly.put(urbanizacioncita.getIdInmobiliario(), urbanizacioncita);
		CasaIndependiente independizadita = new CasaIndependiente(9, 180, "Rúa Colón 39", 6, 3, 2);
		monopoly.put(independizadita.getIdInmobiliario(), independizadita);
		Comercial comerciiiito = new Comercial(10, 190, "Rúa Pizarro 72", tipo.CALLE);
		monopoly.put(comerciiiito.getIdInmobiliario(), comerciiiito);
		Oficina oficinita = new Oficina(11, 200, "Rúa Carabanchel 61", tipo.CALLE);
		monopoly.put(oficinita.getIdInmobiliario(), oficinita);

//		Iteración con foreach + entry
		System.out.println("MONOPOLIO MOSTRADO CON FOREACH");
		for (HashMap.Entry<Integer, Inmueble> entry : monopoly.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

//		Iteración con Iterator copy que flipas de StackOverflow, a ver que te pensabas jajajaj
		System.out.println("\nMONOPOLIO MOSTRADO CON ITERATOR");
		Iterator<HashMap.Entry<Integer, Inmueble>> entries = monopoly.entrySet().iterator();
		while (entries.hasNext()) {
			HashMap.Entry<Integer, Inmueble> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

//		Iteración con keys
//		for (Integer key : monopoly.keySet()) {
//			System.out.println("Key = " + key);
//		}

// 		Iteración con valores
//		for (Inmueble value : monopoly.values()) {
//			System.out.println("Value = " + value);
//		}

	} // main
} // clase
