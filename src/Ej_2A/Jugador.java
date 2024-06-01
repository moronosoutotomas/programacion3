package Ej_2A;

public class Jugador {

	// He tenido que cambiarles la visibilidad para poder cumplir el enunciado
	protected String nombre;
	protected String demarcacion;
	protected int partidosJugados;
	protected int golesMarcados;
	protected int tarjetasAmarillas;
	protected int tarjetasRojas;
	protected static int identificador;

	public Jugador(String n, String d, int p, int g, int a, int r) {
		nombre = n;
		demarcacion = d;
		partidosJugados = p;
		golesMarcados = g;
		tarjetasAmarillas = a;
		tarjetasRojas = r;
		identificador++;
	}

	public Jugador() {
		this("sin nombre", "sin demarcacion", 0, 0, 0, 0);
	}

	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Demarcación: " + demarcacion);
		System.out.println("Partidos Jugados: " + partidosJugados);
		System.out.println("Goles Marcados: " + golesMarcados);
		System.out.println("Tarjetas amarillas:" + tarjetasAmarillas);
		System.out.println("Tarjetas Rojas: " + tarjetasRojas);
		System.out.println("Identificador: " + identificador);
	}

	public String escribirEnFichero() {
		String cadena = "Nombre: " + nombre;
		cadena += "\nDemarcación: " + demarcacion;
		cadena += "\nPartidos Jugados: " + partidosJugados;
		cadena += "\nGoles Marcados: " + golesMarcados;
		cadena += "\nTarjetas amarillas:" + tarjetasAmarillas;
		cadena += "\nTarjetas Rojas: " + tarjetasRojas;
		cadena += "\nIdentificador: " + identificador;
		return cadena;
	}

} // clase