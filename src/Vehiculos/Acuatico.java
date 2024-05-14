package Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return fuerza * radio;
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		this.velocidadMaxima = velocidadViento / 2;
	}

} // clase
