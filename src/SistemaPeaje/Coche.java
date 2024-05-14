package SistemaPeaje;

public class Coche extends Vehiculo {

	static int valorPeaje = 10000;

	public Coche(String matricula) {
		super(matricula);
	}

	public int pagoValorPeaje() {
		return valorPeaje;
	}

	static void setValorPeaje(int valorPeaje) {
		Coche.valorPeaje = valorPeaje;
	}

	@Override
	public String toString() {
		return "Coche [valorPeaje=" + valorPeaje + "]";
	}

} // clase
