package Geografia;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		Municipio m1 = new Municipio("Manizales", 400000, 17, 2200);
		Municipio m2 = new Municipio("La Dorada", 98000, 28, 1000);
		Municipio m3 = new Municipio("Neira", 30000, 20, 1969);

		ArrayList<Municipio> municipios = new ArrayList<Municipio>();
		municipios.add(m1);
		municipios.add(m2);
		municipios.add(m3);
		Departamento d1 = new Departamento("Caldas", municipios);

		System.out.println(d1.getNombre() + " tiene una población de: " + d1.calcularCensoPoblacionDepartamento()
				+ " habitantes.");

		System.out.println("Municipios con población mayor a 50.000");
		d1.buscarMunicipioConPoblacionMayor(50000);

		System.out.println("Búsqueda del municipio de Manizales");
		d1.buscarMunicipio("Manizales");

		Municipio m4 = new Municipio("Hispanity", 300, 16, 48);
		d1.agregarMunicipio(m4);

		d1.listarMunicipios();

	} // main
} // clase
