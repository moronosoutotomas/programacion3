package herencia8_numerica;

import java.util.Objects;

public class Numero {

	protected double valor;

	public Numero(double valor) {
		this.valor = valor;
	}

	public Numero() {
		this.valor = 0;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return valor == other.valor;
	}

// 	metodos propios
//	Sin retorno
	public void sumar(Numero num) { // retorna la suma de dos numeros
		this.setValor(this.getValor() + num.getValor());
	}

//	Con retorno de tipo Numero
//	public Numero sumar(Numero num) { // retorna la suma de dos numeros
//		this.setValor(this.getValor() + num.getValor());
//		return this;
//	}

	public void restar(Numero num) { // retorna la resta de dos numeros
		this.setValor(this.getValor() - num.getValor());
	}

	public void multiplicar(Numero num) { // retorna la multiplicar de dos numeros
		this.setValor(this.getValor() * num.getValor());
	}

	public void dividir(Numero num) { // retorna la division de dos numeros
		if (num.getValor() != 0)
			this.setValor(this.getValor() / num.getValor());
		else
			System.out.println("Entre cero? Eres tonto?");
	}

} // clase
