package Ej_4A;

import java.util.Objects;

public class Inmueble implements Comision {

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return area == other.area && Objects.equals(direccion, other.direccion)
				&& idInmobiliario == other.idInmobiliario;
	}

	@Override
	public String toString() {
		return "Inmueble [idInmobiliario=" + idInmobiliario + ", area=" + area + ", direccion=" + direccion + "]";
	}

	public double calculaPrecioVenta() {
		return 0d;
	}

	@Override
	public double calcularComision() {
		return 0;
	}

}
