package Sports;

public class PartidoBaloncestoLE implements MatchDeportivo {

	public String equipoLocal;
	public String equipoVisitante;
	public int cestasEquipoLocal;
	public int cestasEquipoVisitante;

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

	public int getCestasEquipoLocal() {
		return cestasEquipoLocal;
	}

//	De PartidoFutbol
	public void setCestasEquipoLocal(int cestasEquipoLocal) {
		this.cestasEquipoLocal = cestasEquipoLocal;
	}

	public int getCestasEquipoVisitante() {
		return cestasEquipoVisitante;
	}

//	De PartidoFutbol
	public void setCestasEquipoVisitante(int cestasEquipoVisitante) {
		this.cestasEquipoVisitante = cestasEquipoVisitante;
	}

	@Override
	public String toString() {
		return "PartidoFutbolLE [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", cestasEquipoLocal=" + cestasEquipoLocal + ", cestasEquipoVisitante=" + cestasEquipoVisitante + "]";
	}

} // clase
