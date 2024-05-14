package Human;

public class Cuerpo {

	Cabeza cabeza;
	Tronco tronco;
	Brazo brazoIzq, brazoDer;
	Pierna piernaIzq, piernaDer;

	Cuerpo() {
		System.out.println("creando un cuerpo...");
		this.tronco = new Tronco();
		this.cabeza = new Cabeza();
		this.brazoIzq = new Brazo();
		this.brazoDer = new Brazo();
		this.piernaIzq = new Pierna();
		this.piernaDer = new Pierna();
	}

	@Override
	public String toString() {
		return "Cuerpo [\ncabeza=" + cabeza + ",\n tronco=" + tronco + ",\n brazoIzq=" + brazoIzq + ",\n brazoDer=" + brazoDer
				+ ",\n piernaIzq=" + piernaIzq + ",\n piernaDer=" + piernaDer + "\n]";
	}

} // clase
