package SistemaPeaje;

import java.util.ArrayList;

public class Peaje {

	private String nombre;
	private String departamento;
	ArrayList<Vehiculo> vehiculos;
	private int totalPeaje = 0;
	private static int totalCamiones = 0;
	private static int totalMotos = 0;
	private static int totalCoches = 0;

	public Peaje(String nombre, String departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		vehiculos = new ArrayList<Vehiculo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public static int getTotalCamiones() {
		return totalCamiones;
	}

	public static void setTotalCamiones(int totalCamiones) {
		Peaje.totalCamiones = totalCamiones;
	}

	public static int getTotalMotos() {
		return totalMotos;
	}

	public static void setTotalMotos(int totalMotos) {
		Peaje.totalMotos = totalMotos;
	}

	public static int getTotalCoches() {
		return totalCoches;
	}

	public static void setTotalCoches(int totalCoches) {
		Peaje.totalCoches = totalCoches;
	}

	public int getTotalPeaje() {
		return totalPeaje;
	}

	public void setTotalPeaje(int totalPeaje) {
		this.totalPeaje = totalPeaje;
	}

	/**
	 * Método que incrementa el contador de vehículos del mismo tipo que el vehículo
	 * introducido.
	 * 
	 * @param vehiculo
	 */
	public void añadirVehiculo(Vehiculo vehiculo) {
//		if (vehiculo instanceof Coche) {
//			Peaje.totalCoches++;
//		}
//		if (vehiculo instanceof Moto) {
//			Peaje.totalMotos++;
//		}
//		if (vehiculo instanceof Camion) {
//			Peaje.totalCamiones++;
//		}

		vehiculos.add(vehiculo);
	}

	private void vehiculoNoValido() {
		System.out.println("Por favor introduce un vehículo válido.");
	}

	/**
	 * Método que calcula el total a pagar por un tipo de vehículo introducido.
	 * Tambien añade un vehículo a la colección y calcula el pago individual.
	 * 
	 * @param vehiculo
	 * @return int
	 */
	public int calcularPeaje(Vehiculo vehiculo) {
		if (vehiculo instanceof Coche || vehiculo instanceof Moto || vehiculo instanceof Camion) {
			añadirVehiculo(vehiculo);
		}

		if (vehiculo instanceof Coche) {
			totalPeaje = Peaje.totalCoches * ((Coche) vehiculo).pagoValorPeaje();
			totalCoches++;
			return totalPeaje;
		} else if (vehiculo instanceof Moto) {
			totalPeaje = Peaje.totalMotos * ((Moto) vehiculo).pagoValorPeaje();
			totalMotos++;
			return totalPeaje;
		} else if (vehiculo instanceof Camion) {
			totalPeaje = Peaje.totalCamiones * (Camion.valorPeajeEje * ((Camion) vehiculo).getNumeroEjes());
			totalCamiones++;
			return totalPeaje;
		} else {
			vehiculoNoValido();
		}
		return -1;

		// Variable para CADA vehículo.
//		int pago = 0;
//
//		if (vehiculo instanceof Coche) {
//			totalCoches++;
//			pago = ((Coche) vehiculo).pagoValorPeaje();
//			totalPeaje += pago;
////			return pago;
//		} else if (vehiculo instanceof Moto) {
//			totalMotos++;
//			pago = ((Moto) vehiculo).pagoValorPeaje();
//			totalPeaje += pago;
////			return pago;
//		} else if (vehiculo instanceof Camion) {
//			totalCamiones++;
//			Camion camion = (Camion) vehiculo;
//			pago = camion.getValorPeaje();
//			totalPeaje += pago;
////			return pago;
//		} else {
//			System.out.println("Es un avión");
//		}
	} // calcularPeaje

	/**
	 * Método que lista la colección de vehículos.
	 */
	public void listadoPeaje() {
		for (Vehiculo v : vehiculos) {
			System.out.println(v.toString());
		}
	}

	@Override
	public String toString() {
		return "Peaje [nombre=" + nombre + ", departamento=" + departamento + ", vehiculos=" + vehiculos + "]";
	}

} // clase
