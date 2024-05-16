package EquipoFutbolAgregacion;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EquipoFutbol {

	private String nombre;
	private String pais;
	ArrayList<Defensa> defensas;
	ArrayList<Mediocampo> mediocampos;
	ArrayList<Delantero> delanteros;

	private Tecnico tecnico;
	private Portero portero;

//	Estos Arrays están a modo aclaratorio ya que el ejercicio según el libro
//	contenía estos límites, usando una táctica concreta de fútbol 11: 4-4-2
//	Defensa[] defensas = new Defensa[4];
//	Mediocampo[] mediocampos = new Mediocampo[4];
//	Delantero[] delanteros = new Delantero[2];

	public EquipoFutbol(String nombre, String pais) {
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Portero getPortero() {
		return portero;
	}

	public void setPortero(Portero portero) {
		this.portero = portero;
	}

	@Override
	public String toString() {
		return "EquipoFutbol [nombre=" + nombre + ", pais=" + pais + ", defensas=" + defensas + ", mediocampos="
				+ mediocampos + ", delanteros=" + delanteros + ", tecnico=" + tecnico + ", portero=" + portero + "]";
	}

//	Currando un poquito salen cosas
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Equipo de Fútbol:\n");
		sb.append("- Nombre: ").append(this.getNombre()).append("\n");
		sb.append("- País: ").append(this.getPais()).append("\n");
		sb.append("- Cuerpo Técnico:\n");
		sb.append("  · Técnico: ").append(this.tecnico.getNombre()).append("\n");
		sb.append("  · Portero: ").append(this.portero.getNombre()).append("\n");

		sb.append("- Defensas:\n");
		for (Jugador defensa : defensas) {
			sb.append("  · ").append(defensa.getNombre()).append("\n");
		}

		sb.append("- Mediocampistas:\n");
		for (Jugador mediocampista : mediocampos) {
			sb.append("  · ").append(mediocampista.getNombre()).append("\n");
		}

		sb.append("- Delanteros:\n");
		for (Jugador delantero : delanteros) {
			sb.append("  · ").append(delantero.getNombre()).append("\n");
		}

		return sb.toString();
	}

//	#Perplexity says:
	public String imprimirStream() {
		return "Equipo de Fútbol:\n" + "- Nombre: " + nombre + "\n" + "- País: " + pais + "\n" + "- Cuerpo Técnico:\n"
				+ "  - Técnico: " + tecnico + "\n" + "- Portero: " + portero + "\n" + "- Defensas:\n"
				+ defensas.stream().map(jugador -> "  - " + jugador.getNombre()).collect(Collectors.joining("\n"))
				+ "\n" + "- Mediocampistas:\n"
				+ mediocampos.stream().map(jugador -> "  - " + jugador.getNombre()).collect(Collectors.joining("\n"))
				+ "\n" + "- Delanteros:\n"
				+ delanteros.stream().map(jugador -> "  - " + jugador.getNombre()).collect(Collectors.joining("\n"));
	}

} // clase
