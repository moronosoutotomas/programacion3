package herencia10_medicina;

import java.util.ArrayList;

public class testmedico {

	public static void main(String[] args) {

		ArrayList<Medico> povisa = new ArrayList<Medico>();

		Ortopedista josecarlos = new Ortopedista("Jose Carlos", tipologiaO.MAXILOFACIAL);
		Pediatra mariluz = new Pediatra("Mariluz", tipologiaP.PSICOLOGO);
		Medico javier = new Medico("Javier");

		povisa.add(josecarlos);
		povisa.add(mariluz);
		povisa.add(javier);

		for (int i = 0; i < povisa.size(); i++) {
			Medico a = (Medico) povisa.get(i);

			if (a instanceof Ortopedista) {
				System.out.println("El objeto en el indice " + i + " es de la clase " + a.getClass().getSimpleName());
				((Ortopedista) a).revisaProtesis();
			} else if (a instanceof Pediatra) {
				System.out.println("El objeto en el indice " + i + " es de la clase " + a.getClass().getSimpleName());
				((Pediatra) a).poneInyeccion();
				;
			} else if (a instanceof Medico) {
				System.out.println("El objeto en el indice " + i + " es de la clase " + a.getClass().getSimpleName());
				a.tomaTension();
				a.verVideos();
				a.escucharPodcasts();
				;
			} else {
				System.out.println("El objeto en el indice " + i + " no es de ninguna clase");
			}
		} // for

		Alumno al = new Alumno("Max", "uno");
		Fontanero fon = new Fontanero("pako", 23);

		System.out.println(al.toString());
		al.verVideos();
		al.escucharPodcasts();
		fon.verVideos();
		fon.escucharPodcasts();

	} // main
}
// clase
