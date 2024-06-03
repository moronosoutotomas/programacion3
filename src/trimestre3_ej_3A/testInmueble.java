package trimestre3_ej_3A;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class testInmueble implements Serializable {

//	Generador de medidas de áreas aleatorias
	public static int generaArea() {
		return (int) (30 + Math.random() * 120);
	}

	public static void guardarInmuebles(ArrayList<Inmueble> conjunto) {
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"C:\\Users\\Primero DAM\\eclipse-workspace\\tercero\\src\\trimestre3_ej_3A\\inmobiliaria_tomas.dat");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(conjunto);
			objectOut.close();
			System.out.println("Colección de inmuebles guardados correctamente.");

		} catch (IOException kagada) {
			System.out.println("Error al guardar en archivo: " + kagada.getMessage());
		}
	}

	public static void main(String[] args) {

		ArrayList<Inmueble> casitas = new ArrayList<Inmueble>();

		CasaRural rural = new CasaRural(1, generaArea(), "A Guarda nº 12", 2, 1, 3, 4, 2000);
		ConjuntoCerrado conjCerrado = new ConjuntoCerrado(2, generaArea(), "Porriño nº 20", 2, 3, 4, 5, true, false);
		CasaIndependiente indepen = new CasaIndependiente(3, generaArea(), "Vigo nº 31", 3, 6, 5);
		Apartaestudio apEstudio = new Apartaestudio(4, generaArea(), "Tui nº 19", 6, 2);
		ApartamentoFamiliar apFamiliar = new ApartamentoFamiliar(6, generaArea(), "Ponteareas", 3, 2, 2500);
		Comercial comercial = new Comercial(7, generaArea(), "Vincios", null);
		Oficina ofi = new Oficina(5, generaArea(), "Redondela", null, true);

		casitas.add(rural);
		casitas.add(conjCerrado);
		casitas.add(indepen);
		casitas.add(apEstudio);
		casitas.add(ofi);
		casitas.add(apFamiliar);
		casitas.add(comercial);

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
			System.out.println("La comisión de " + c.getDireccion() + " es " + c.calcularImpuesto());
			totalComisiones += c.calcularImpuesto();
		}

		valorPromedio = valorTotal / valorTotalAreas;

		System.out.println("\n\tEl valor TOTAL de los inmuebles vendidos es: " + valorTotal + "€");
		System.out.println("\tEl valor PROMEDIO del valor por metro cuadrado del total de inmuebles vendidos es: "
				+ valorPromedio);
		System.out.println("\tEl TOTAL obtenido por las COMISIONES es: " + totalComisiones);

		guardarInmuebles(casitas); // TODO: que escriba correctamente

	} // main
} // clase
