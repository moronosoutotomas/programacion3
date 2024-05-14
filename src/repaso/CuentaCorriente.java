package repaso;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	private float sobregiro = 0;

	@Override
	public void retirar(float cantidad) {
		if (cantidad < this.getSaldo()) {
//			Queda en descubierto (sobregiro)
			sobregiro += cantidad - this.getSaldo();
			super.retirar(getSaldo());
		} else {
			super.retirar(cantidad);
		}
	} // retirar

	@Override
	public void consignar(float cantidad) {
		if (sobregiro > 0) {
			if (cantidad > sobregiro) {
//				Hago un ingreso restando lo que debo
				super.consignar(cantidad - sobregiro);
				sobregiro = 0;
			} else {
				sobregiro -= cantidad;
				// La idea de Breixo
				this.setNumeroConsignaciones(getNumeroConsignaciones() + 1);
				// La idea de Luis
				super.consignar(0);
			}
		} else {
//			No debo nada y por tanto ingreso y punto
			super.consignar(cantidad);
		}
	} // consignar

	@Override
	public String toString() {
		return "CuentaCorriente [sobregiro=" + sobregiro + ", comisionMensual=" + comisionMensual + ", getSaldo()="
				+ getSaldo() + ", Transacciones realizadas=" + (getNumeroConsignaciones() + getNumeroRetiros()) + "]";
	}

//	Es innecesario usar el método extractoMensual() sobreescribiendo
//	el de la clase padre, pudiendo usarlo directamente:

//	@Override
//	public void extractoMensual() {
//		super.extractoMensual();
//	} // extractoMensual

} // clase
