package Pedido;

import java.util.ArrayList;

public class LineaPedido {

	private int id;
	private int cantidad;
	ArrayList<Producto> lineaPedido;

	public LineaPedido(int id, int cantidad, Producto producto) {
		this.id = id;
		this.cantidad = cantidad;
		producto = new Producto();
		lineaPedido = new ArrayList<Producto>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int calcularSubtotalLineaPedido() {

		return 0;
	}

	@Override
	public String toString() {
		return "LineaPedido [id=" + id + ", cantidad=" + cantidad + "]";
	}

} // clase
