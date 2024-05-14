package Carro;

public class testCarro {

	public static void main(String[] args) {

		Carro carro = new Carro(2, Chasis.tipoChasis.INDEPENDIENTE, "Negro", Carroceria.tipoCarroceria.INDEPENDIENTE,
				"Honda", 17, 24, 25);
		System.out.println(carro.toString());

	} // clase
} // clase
