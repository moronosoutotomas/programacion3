package herencia7_animales;

public class Leon extends Felino {

	protected String sonido = "rugido";
	protected String alimentos = "carnívoro";
	protected String habitat = "pradera";
	protected String nombreCientifico = "Panthera leo";

	public Leon() {
	}

	public String getSonido() {
		return sonido;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public String getHabitat() {
		return habitat;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	@Override
	public String toString() {
		return "Leon [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

} // clase
