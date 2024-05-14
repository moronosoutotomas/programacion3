package herencia3_inmueble_Tomas;

public class Inmueble {

	protected int idInmobiliario;
	protected int area; // en metros cuadrados
	protected String direccion;
	protected double precioVenta = 0d;

	public Inmueble(int idInmobiliario, int area, String direccion) {
		this.idInmobiliario = idInmobiliario;
		this.area = area;
		this.direccion = direccion;
	}

	public int getIdInmobiliario() {
		return idInmobiliario;
	}

	public void setIdInmobiliario(int idInmobiliario) {
		this.idInmobiliario = idInmobiliario;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Inmueble [idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	public double calculaPrecioVenta() {
		return 0d;
	}

} // clase
