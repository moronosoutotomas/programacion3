package Ej_4A;

import java.util.ArrayList;

public class testInmueble {

//	Generador de medidas de áreas aleatorias
	public static int generaArea() {
		return (int) (30 + Math.random() * 120);
	}

	public static void main(String[] args) {

		ArrayList<Inmueble> casitas = new ArrayList<Inmueble>();

		CasaRural rural = new CasaRural(1, generaArea(), "A Guarda nº 12", 2, 1, 3, 4, 2000);
		ConjuntoCerrado conjCerrado = new ConjuntoCerrado(2, generaArea(), "Porriño nº 20", 2, 3, 4, 5, true, false);
		CasaIndependiente indepen = new CasaIndependiente(3, generaArea(), "Vigo nº 31", 3, 6, 5);
		Apartaestudio apEstudio = new Apartaestudio(4, generaArea(), "Tui nº 19", 6, 2);
		Oficina ofi = new Oficina(5, generaArea(), "redondela", null, true);

		casitas.add(rural);
		casitas.add(conjCerrado);
		casitas.add(indepen);
		casitas.add(apEstudio);
		casitas.add(ofi);

		double valorTotal = 0;
		double valorPromedio = 0;
		double valorTotalAreas = 0;
		double totalComisiones = 0;

		System.out.println("========== INFORMACIÓN INMUEBLES ==========");
		for (Inmueble c : casitas) {
			System.out.println(
					"\nEl precio del inmueble " + c.getIdInmobiliario() + " es " + c.calculaPrecioVenta() + "€");
			valorTotal += c.calculaPrecioVenta();
			valorTotalAreas += c.getArea();
			System.out.println("La comisión de " + c.getDireccion() + " es " + c.calcularComision());
			totalComisiones += c.calcularComision();
		}

		valorPromedio = valorTotal / valorTotalAreas;

		System.out.println("\n\tEl valor TOTAL de los inmuebles vendidos es: " + valorTotal + "€");
		System.out.println("\tEl valor PROMEDIO del valor por metro cuadrado del total de inmuebles vendidos es: "
				+ valorPromedio);
		System.out.println("\tEl TOTAL obtenido por las COMISIONES es: " + totalComisiones);

	} // main
} // clase
