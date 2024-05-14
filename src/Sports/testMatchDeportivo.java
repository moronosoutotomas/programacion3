package Sports;

public class testMatchDeportivo {

	public static void main(String[] args) {

		PartidoFutbolLE partidoFutbol = new PartidoFutbolLE();
		partidoFutbol.setEquipoLocal("Celta");
		partidoFutbol.setEquipoVisitante("Barça");
		partidoFutbol.setGolesEquipoLocal(4);
		partidoFutbol.setGolesEquipoVisitante(1);

		System.out.println("\n--- PARTIDO DE FUTBOL ---");
		System.out.println(partidoFutbol.toString());

		PartidoBaloncestoLE partidoBasket = new PartidoBaloncestoLE();
		partidoBasket.setEquipoLocal("Madrid");
		partidoBasket.setEquipoVisitante("Unicaja");
		partidoBasket.setCestasEquipoLocal(52);
		partidoBasket.setCestasEquipoVisitante(67);

		System.out.println("\n--- PARTIDO DE BASKET ---");
		System.out.println(partidoBasket.toString());

	} // main
} // clase
