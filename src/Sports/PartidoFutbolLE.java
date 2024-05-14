package Sports;

public class PartidoFutbolLE implements MatchDeportivo {

	public String equipoLocal;
	public String equipoVisitante;
	public int golesEquipoLocal;
	public int golesEquipoVisitante;

	public String getEquipoLocal() {
		return equipoLocal;
	}

//	De MatchDeportivo
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

//	De MatchDeportivo
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}

//	De PartidoFutbol
	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}

	public int getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}

//	De PartidoFutbol
	public void setGolesEquipoVisitante(int golesEquipoVisitante) {
		this.golesEquipoVisitante = golesEquipoVisitante;
	}

	@Override
	public String toString() {
		return "PartidoFutbolLE [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}

} // clase
