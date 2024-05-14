package repaso;

public class CuentaAhorros extends Cuenta {

	private boolean activa;

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.activa = this.isActiva();
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

//	Método similar a un método set
	public boolean isActiva() {
		if (this.getSaldo() > 10000)
			return true;
		else
			return false;
	}

	@Override
	public void consignar(float cantidad) {
		if (activa)
			super.consignar(cantidad);
		else
			System.out.println("Cuenta NO activa.");
	}

	@Override
	public void retirar(float cantidad) {
		if (activa)
			super.retirar(cantidad);
		else
			System.out.println("Cuenta NO activa.");
	}

	@Override
	public void extractoMensual() {
		if (this.getNumeroRetiros() > 4) {
			this.comisionMensual = (this.getNumeroRetiros() - 4) * 1000;
			super.extractoMensual();
			activa = isActiva();
		}
	}

	@Override
	public String toString() {
		return "CuentaAhorros [activa=" + activa + ", comisionMensual=" + comisionMensual + ", getSaldo()=" + getSaldo()
				+ ", getNumeroConsignaciones()=" + getNumeroConsignaciones() + ", getNumeroRetiros()="
				+ getNumeroRetiros() + "]";
	}

} // clase
