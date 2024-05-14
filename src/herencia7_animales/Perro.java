package herencia7_animales;

public class Perro extends Canido {

	protected String sonido = "ladrido";
	protected String alimentos = "carnívoro";
	protected String habitat = "doméstico";
	protected String nombreCientifico = "Canis Lupus Familiaris";

	public Perro() {
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
		return "Perro [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

} // clase
