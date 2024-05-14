package herencia8_numerica;

public class testNumero {

	public static void main(String[] args) {

		Numero num1 = new Numero(1);
		Numero num2 = new Numero(2);

		// Instancio dos nuevos objetos para operar mas cómodamente con la segunda
		// fracción
		Numero num3 = new Numero(2);
		Numero num4 = new Numero(3);

//		Hay dos formas de resolver la papeleta
		Fraccion unMedio = new Fraccion(num1, num2); // así es clean code
		Fraccion dosTercios = new Fraccion(new Numero(2), new Numero(3)); // así evitaría instanciar dos objetos nuevos

//		SUMA
		unMedio.sumar(dosTercios);
//		System.out.println("La suma da: " + unMedio.toString()); // se debería sacar así tambien pero no me gustó ese toString manolín
		System.out.println("SUMA \t\t---> " + unMedio.getNumerador() + " / " + unMedio.getDenominador());

		// Reasigno los valores para la resta
		unMedio.setNumerador(num1);
		unMedio.setDenominador(num2);
		dosTercios.setNumerador(num3);
		dosTercios.setDenominador(num4);

//		RESTA
		unMedio.restar(dosTercios);
		System.out.println("RESTA \t\t---> " + unMedio.getNumerador() + " / " + unMedio.getDenominador());

		// Reasigno los valores para la multiplicación
		unMedio.setNumerador(num1);
		unMedio.setDenominador(num2);
		dosTercios.setNumerador(num3);
		dosTercios.setDenominador(num4);

//		MULTIPLICACIÓN
		unMedio.multiplicar(dosTercios);
		System.out.println("MULTIPLICACIÓN \t---> " + unMedio.getNumerador() + " / " + unMedio.getDenominador());

		// Reasigno los valores para la división
		unMedio.setNumerador(num1);
		unMedio.setDenominador(num2);
		dosTercios.setNumerador(num3);
		dosTercios.setDenominador(num4);

//		DIVISIÓN
		unMedio.dividir(dosTercios);
		System.out.println("DIVISIÓN \t---> " + unMedio.getNumerador() + " / " + unMedio.getDenominador());

	} // main
} // clase
