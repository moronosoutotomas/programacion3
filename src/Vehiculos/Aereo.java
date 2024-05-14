package Vehiculos;

public class Aereo extends Vehiculo implements Reactor, trenAterrizaje {

	public Aereo(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	public void despegar() {
		System.out.println("estoy despegando...");
	}

	public void aterrizar() {
		System.out.println("estoy aterrizando suavemente...");
	}

	public void volar() {
		System.out.println("volando voy, volando vengo...");
	}

	@Override
	public void soltarTren() {
		System.out.println("El avión suelta el tren de aterrizaje");
	}

	@Override
	public void subirTren() {
		System.out.println("El avión suelta el tren de aterrizaje");
	}

	@Override
	public void encenderReactor() {
		System.out.println("El reactor está encendido");
	}

	@Override
	public void apagarReactor() {
		System.out.println("El reactor está apagado");
	}

} // clase
