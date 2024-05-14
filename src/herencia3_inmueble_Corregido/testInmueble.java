package herencia3_inmueble_Corregido;

import java.util.HashMap;

import herencia3_inmueble_Corregido.Local.tipo;

public class testInmueble {

//	Generador de medidas de áreas aleatorias
	public static int generaArea() {
		return (int) (30 + Math.random() * 120);
	}

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
		CasaRural casaRuralcita = new CasaRural(4, 130, "Rúa Concordia 29", 3, 5, 1, 30, 2);
		monopoly.put(casaRuralcita.getIdInmobiliario(), casaRuralcita);
		CasaUrbana casaUrbanita = new CasaUrbana(5, 140, "Rúa Ourense 11", 3, 2, 1);
		monopoly.put(casaUrbanita.getIdInmobiliario(), casaUrbanita);
		Apartaestudio estudiiiito = new Apartaestudio(6, 150, "Rúa Casal Aboy 7", 3, 2);
		monopoly.put(estudiiiito.getIdInmobiliario(), estudiiiito);
		ApartamentoFamiliar AquiNoHayQuienViva = new ApartamentoFamiliar(7, 160, "Augusto Glez Besada 17", 5, 2, 9000);
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
		System.out.println("\nMONOPOLIO MOSTRADO CON FOREACH");
		for (HashMap.Entry<Integer, Inmueble> entry : monopoly.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

//		Calculamos el precio de cada inmueble
		double precio = 0;
		System.out.println();
		for (HashMap.Entry<Integer, Inmueble> entry : monopoly.entrySet()) {
			Inmueble inmueble = entry.getValue();
			// Llamar al método calculaPrecioVenta()
			precio = inmueble.calculaPrecioVenta();
			System.out.println("Precio de venta de " + inmueble.getDireccion() + ": " + precio);
		}

//		CORRECCIÓN PEPE:
//		Iterando con áreas aleatorias un ArrayList
//		for (Inmueble c : col) {
//			System.out.println(c.toString());
//			double p = c.calculaPrecioVenta();
//			System.out.println("precio: " + p);
//			precio += p;
//		}
//		System.out.println("precio: " + precio);
//		System.out.println("precio: " + 0.21 * precio);
//		System.out.println("precio: " + 1.21 * precio);

	} // main
} // clase
