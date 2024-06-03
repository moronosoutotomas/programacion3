package trimestre3_ej_3A;

public class Casa extends Vivienda implements Impuesto {

	protected int numPisos;

	public Casa(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
		super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
		this.numPisos = numPisos;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "Casa [numPisos=" + numPisos + ", numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños
				+ ", idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularImpuesto() {
		double comision = super.calcularImpuesto();
		comision += this.calculaPrecioVenta() * 0.02;
		return comision;
	}

} // clase
