package Ej_4A;

public class Apartamento extends Vivienda implements Comision {

	public Apartamento(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
	}

	@Override
	public String toString() {
		return "Apartamento [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularComision() {
		double comision = super.calcularComision();
		comision += this.calculaPrecioVenta() * 0.04;
		return comision;
	}

	

} // clase
