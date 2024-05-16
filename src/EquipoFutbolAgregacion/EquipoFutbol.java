package EquipoFutbolAgregacion;

import java.util.ArrayList;

public class EquipoFutbol {

	private String nombre;
	private String pais;
	ArrayList<Defensa> defensas;
	ArrayList<Mediocampo> mediocampos;
	ArrayList<Delantero> delanteros;

	private Tecnico tecnico;
	private Portero portero;

//	Defensa[] defensas = new Defensa[4];
//	Mediocampo[] mediocampos = new Mediocampo[4];
//	Delantero[] delanteros = new Delantero[2];

	public EquipoFutbol(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public EquipoFutbol(String nombre, String pais, Portero portero, Tecnico tecnico, ArrayList<Defensa> defensas,
			ArrayList<Mediocampo> mediocampos, ArrayList<Delantero> delanteros) {
		this(nombre, pais);
		this.portero = portero;
		this.tecnico = tecnico;
		this.defensas = defensas;
		this.mediocampos = mediocampos;
		this.delanteros = delanteros;
	}

	@Override
	public String toString() {
		return "EquipoFutbol [nombre=" + nombre + ", pais=" + pais + ", defensas=" + defensas + ", mediocampos="
				+ mediocampos + ", delanteros=" + delanteros + ", tecnico=" + tecnico + ", portero=" + portero + "]";
	}

} // clase
