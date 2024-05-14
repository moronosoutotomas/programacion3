package SistemaPeaje;

public class Moto extends Vehiculo {

	static int valorPeaje = 5000;

	public Moto(String matricula) {
		super(matricula);
	}

	public int pagoValorPeaje() {
		return valorPeaje;
	}

	static void setValorPeaje(int valorPeaje) {
		Moto.valorPeaje = valorPeaje;
	}

	@Override
	public String toString() {
		return "Moto [valorPeaje=" + valorPeaje + "]";
	}

} // clase
