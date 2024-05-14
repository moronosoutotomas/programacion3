package herencia7_animales;

public class Gato extends Felino {

	protected String sonido = "maullido";
	protected String alimentos = "ratones";
	protected String habitat = "doméstico";
	protected String nombreCientifico = "Felis silvestris catus";

	public Gato() {
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
		return "Gato [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

} // clase
