package Ej_4A;

import java.util.ArrayList;

public class testInmueble {

//	Generador de medidas de áreas aleatorias
	public static int generaArea() {
		return (int) (30 + Math.random() * 120);
	}

	public static void main(String[] args) {

		ArrayList<Inmueble> casitas = new ArrayList<Inmueble>();

		CasaRural rural = new CasaRural(1, generaArea(), "aqui", 2, 1, 3, 4, 2000);
		ConjuntoCerrado conjCerrado = new ConjuntoCerrado(2, generaArea(), "porriño", 2, 3, 4, 5, true, false);
		CasaIndependiente indepen = new CasaIndependiente(3, generaArea(), "vigo", 3, 6, 5);
		Apartaestudio apEstudio = new Apartaestudio(4, generaArea(), "tui", 6, 2);

		casitas.add(rural);
		casitas.add(conjCerrado);
		casitas.add(indepen);
		casitas.add(apEstudio);

		double valorTotal = 0;
		double valorPromedio = 0;
		for (Inmueble c : casitas) {
			System.out
					.println("El precio del inmueble " + c.getIdInmobiliario() + " es " + c.calculaPrecioVenta() + "€");
			valorTotal += c.calculaPrecioVenta();
			valorPromedio = valorTotal / casitas.size();
		}

		System.out.println("El valor total de los inmuebles vendidos es: " + valorTotal + "€");
		System.out.println(
				"El valor promedio del valor por metro cuadrado del total de inmuebles vendidos es: " + valorPromedio);

	} // main
} // clase
