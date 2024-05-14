package Carro;

public class Chasis {

	tipoChasis tipo;

	public enum tipoChasis {
		INDEPENDIENTE, MONOCASCO
	}

	Chasis(tipoChasis tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Chasis [tipo=" + tipo + "]";
	}

} // clase
