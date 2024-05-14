package SistemaPeaje;

public class Camion extends Vehiculo {

	static int valorPeajeEje = 5000;
	int numeroEjes;

	public Camion(String matricula) {
		super(matricula);
	}

	public int pagoValorPeajeEje() {
		return valorPeajeEje;
	}

	public static void setValorPeajeEje(int valorPeajeEje) {
		Camion.valorPeajeEje = valorPeajeEje;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	/**
	 * Método que calcula el valor del peaje de un camión.
	 * 
	 * @Deprecated: Como cambiaste el calcularPeaje ahora este método es inútil.
	 * 
	 * @return
	 */
	public int getValorPeaje() {
		return numeroEjes * valorPeajeEje;
	}

	@Override
	public String toString() {
		return "Camion [pagoValorPeajeEje()=" + pagoValorPeajeEje() + ", toString()=" + super.toString() + "]";
	}

} // clase
