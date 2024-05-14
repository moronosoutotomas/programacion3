package Vehiculos;

public class Terrestre extends Vehiculo implements Motor {

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return fuerza * radio;
	}

} // clase
