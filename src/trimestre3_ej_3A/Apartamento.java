package trimestre3_ej_3A;

public class Apartamento extends Vivienda implements Impuesto {

	public Apartamento(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
	}

	@Override
	public String toString() {
		return "Apartamento [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + ", idInmobiliario="
				+ idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularImpuesto() {
		double comision = super.calcularImpuesto();
		comision += this.calculaPrecioVenta() * 0.04;
		return comision;
	}

	

} // clase
