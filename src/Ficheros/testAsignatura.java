package Ficheros;

import java.util.ArrayList;

public class testAsignatura {

	public static void main(String[] args) {

		Asignatura asignatura = new Asignatura(410216, "Programación Orientada a Objetos", 4);
		asignatura.escribirAsignatura();
		asignatura.leerAsignatura();

		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		Asignatura asignatura2 = new Asignatura(2, "Control de versiones", 3);
		Asignatura asignatura3 = new Asignatura(3, "Markdown", 3);
		asignaturas.add(asignatura2);
		asignaturas.add(asignatura3);

		Asignatura.guardar(asignaturas);

		ArrayList<Asignatura> extra = new ArrayList<Asignatura>();

		extra = Asignatura.cargar();

		for (Asignatura a : extra) {
			a.imprimir();
		}

	} // main
} // clase
