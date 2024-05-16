package EquipoFutbolAgregacion;

public class Portero extends Jugador {

	private int golesRecibidos;

	public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
		super(nombre, apellidos, edad, esTitular);
		this.golesRecibidos = golesRecibidos;
	}

	public int getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	@Override
	public String toString() {
		return "Portero [golesRecibidos=" + golesRecibidos + "]";
	}

} // clase
