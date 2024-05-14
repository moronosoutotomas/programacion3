package repaso;

public class Cuenta {

	private float saldo;
	private int numeroConsignaciones = 0;
	private int numeroRetiros = 0;
	private float tasaAnual; // en porcentaje
	protected float comisionMensual = 0;

	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public void consignar(float cantidad) {
		saldo += cantidad;
		numeroConsignaciones++;
	}

	public void retirar(float cantidad) {
		float nuevoSaldo = saldo - cantidad;

		if (nuevoSaldo >= 0) {
			saldo -= cantidad;
			numeroRetiros++;
		} else {
			System.out.println("La cantidad a retirar excede el saldo actual.");
			System.out.println("Saldo: " + saldo);
		}
	}

	public void calcularInteres() {
		float tasaMensual = tasaAnual / 12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual; // Actualiza el saldo aplicando el interés mensual
	}

	public void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
				+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}

} // clase
