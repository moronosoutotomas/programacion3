package Ej_2A;

public class Delantero extends Jugador {

	private int golesMetidos;
	private int penaltisFallados;

	public Delantero(int golesMetidos, int penaltisFallados) {
		super();
		this.golesMetidos = golesMetidos;
		this.penaltisFallados = penaltisFallados;
	}

	public Delantero(String n, String d, int p, int g, int a, int r, int golesMetidos, int penaltisFallados) {
		super(n, d, p, g, a, r);
		this.golesMetidos = golesMetidos;
		this.penaltisFallados = penaltisFallados;
	}

	public int getGolesMetidos() {
		return golesMetidos;
	}

	public void setGolesMetidos(int golesMetidos) {
		this.golesMetidos = golesMetidos;
	}

	public int getPenaltisFallados() {
		return penaltisFallados;
	}

	public void setPenaltisFallados(int penaltisFallados) {
		this.penaltisFallados = penaltisFallados;
	}

	@Override
	public String escribirEnFichero() {
		String cadena = "Nombre: " + nombre;
		cadena += "\nDemarcación: " + demarcacion;
		cadena += "\nPartidos Jugados: " + partidosJugados;
		cadena += "\nGoles Marcados: " + golesMarcados;
		cadena += "\nTarjetas amarillas:" + tarjetasAmarillas;
		cadena += "\nTarjetas Rojas: " + tarjetasRojas;
		cadena += "\nIdentificador: " + identificador;
		cadena += "\nGoles metidos: " + golesMetidos;
		cadena += "\nPenaltis fallados: " + penaltisFallados;
		return cadena;
	}

} // clase
