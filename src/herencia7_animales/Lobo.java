package herencia7_animales;

public class Lobo extends Canido {

	protected String sonido = "aullido";
	protected String alimentos = "carnívoro";
	protected String habitat = "bosque";
	protected String nombreCientifico = "Canis Lupus";

	public Lobo() {
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
		return "Lobo [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

} // clase
