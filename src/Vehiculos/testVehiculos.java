package Vehiculos;

import java.util.ArrayList;

public class testVehiculos {

	public static void main(String[] args) {

		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		Vehiculo terrestre = new Terrestre(70, 120);
		Vehiculo acuatico = new Acuatico(10, 50);
		Vehiculo aereo = new Aereo(500, 750);

		vehiculos.add(terrestre);
		vehiculos.add(acuatico);
		vehiculos.add(aereo);

		for (Vehiculo v : vehiculos) {
			System.out.println(v);
			v.acelerar(20);
			v.frenar(10);

			if (v instanceof Terrestre) {
				System.out.println(((Terrestre) v).calcularRevolucionesMotor(30, 10));
			}

			if (v instanceof Acuatico) {
				System.out.println(((Acuatico) v).calcularRevolucionesMotor(40, 15));
				((Acuatico) v).recomendarVelocidad(20);
			}

			if (v instanceof Aereo) {
				((Aereo) v).despegar();
				((Aereo) v).aterrizar();
				((Aereo) v).volar();
				((Aereo) v).soltarTren();
				((Aereo) v).subirTren();
				((Aereo) v).encenderReactor();
				((Aereo) v).apagarReactor();
			}

		} // foreach

	} // main
} // clase
