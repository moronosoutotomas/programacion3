package herencia6_universidad;

import java.util.ArrayList;

public class testUniversidad {

	public static void main(String[] args) {

		ArrayList<Persona> cebem = new ArrayList<Persona>();

		Persona mamen = new Persona("Mamen", "Gran Via 87");
		cebem.add(mamen);
		Alumno mario = new Alumno("Mario", "Noia", "Ing.Informática", 2);
		cebem.add(mario);
		Profesor pedro = new Profesor("Pedro", "Principe 32", "Dep.Informática", "Profesor");
		cebem.add(pedro);

		System.out.println("Integrantes de CEBEM:");
		for (Persona p : cebem) {
			System.out.print("\n" + p.getNombre() + "\n");
			p.respira();
			p.asisteAlCentro();

			if (p instanceof Profesor) {
				((Profesor) p).evalua();
				((Profesor) p).castiga();

			} else if (p instanceof Alumno) {
				((Alumno) p).estudia();
				((Alumno) p).suspende();

			} else {
				System.out.println("Este no curra");
			}
		} // foreach

	} // main

} // clase
