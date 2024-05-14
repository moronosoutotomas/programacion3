package SistemaPeaje;

public class testPeaje {

	public static void main(String[] args) {

		Peaje peaje = new Peaje("AP-9", "Audasa: transportes y demás vicios");

//		Ejemplo con mas de 1 vehículo de cada
		Coche coche = new Coche("1234AAA");
		Moto moto = new Moto("5678BBB");
		Camion camion = new Camion("9012CCC");
		camion.setNumeroEjes(6);

		peaje.añadirVehiculo(coche);
		peaje.añadirVehiculo(moto);
		peaje.añadirVehiculo(camion);

		System.out.println("--- COSTE DE 1 VIAJE POR LA AP-9 ---");
		System.out.println("El peaje del coche son: " + peaje.calcularPeaje(coche) + "€");
		System.out.println("El peaje del moto son: " + peaje.calcularPeaje(moto) + "€");
		System.out.println("El peaje del camion son: " + peaje.calcularPeaje(camion) + "€");

//		Ejemplo con mas de 1 vehículo de cada
		Coche coche2 = new Coche("1234AAA");
		Coche coche3 = new Coche("1234AAA");
		Coche coche4 = new Coche("1234AAA");
		Moto moto2 = new Moto("5678BBB");
		Moto moto3 = new Moto("5678BBB");
		Moto moto4 = new Moto("5678BBB");
		Camion camion2 = new Camion("9012CCC");
		camion2.setNumeroEjes(8);
		Camion camion3 = new Camion("9012CCC");
		camion3.setNumeroEjes(6);
		Camion camion4 = new Camion("9012CCC");
		camion4.setNumeroEjes(12);

		peaje.añadirVehiculo(coche2);
		peaje.añadirVehiculo(coche3);
		peaje.añadirVehiculo(coche4);
		peaje.añadirVehiculo(moto2);
		peaje.añadirVehiculo(moto3);
		peaje.añadirVehiculo(moto4);
		peaje.añadirVehiculo(camion2);
		peaje.añadirVehiculo(camion3);
		peaje.añadirVehiculo(camion4);

		System.out.println("--- COSTE DE 4 VIAJES POR LA AP-9 ---");
		System.out.println("El peaje del coche son: " + peaje.calcularPeaje(coche) + "€");
		System.out.println("El peaje del moto son: " + peaje.calcularPeaje(moto) + "€");
		System.out.println("El peaje del camion son: " + peaje.calcularPeaje(camion) + "€");

	} // main
} // clase
