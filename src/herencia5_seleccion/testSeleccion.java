package herencia5_seleccion;

import java.util.ArrayList;

public class testSeleccion {

	public static void main(String[] args) {

//		Independientemente de la clase hija a la que pertenezca el objeto
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

//		CONCENTRACIÓN
		System.out.println(
				"Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método HEREDADO)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.toString() + " ---> ");
			integrante.concentrarse();
		}

//		VIAJE
		System.out.println(
				"\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método HEREDADO)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " ---> ");
			integrante.viajar();
		}

//		Recorre el ArrayList ejecutando los métodos específicos o propios de cada objeto
		for (SeleccionFutbol i : integrantes) {
			if (i instanceof Entrenador) {
				((Entrenador) i).viajar();
			} else if (i instanceof Futbolista) {
				((Futbolista) i).viajar();
			} else if (i instanceof Masajista) {
				((Masajista) i).viajar();
			} else {
				System.out.println("Este no viaja");
			}
		} // for

	} // main
} // clase
