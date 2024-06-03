package trimestre3_ej_1A;

public class ConversorStonesLibras {

	public static double stonesKg(double s) { // TODO: el filtrado si pasa de 13 stones
		double kg;
		kg = s * 6.35;
		return kg;
	}

	public static double librasKg(double l) {
		double kg;
		kg = l * 0.453;
		return kg;
	}

} // clase
