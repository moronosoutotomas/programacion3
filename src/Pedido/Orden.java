package Pedido;

import java.util.ArrayList;

public class Orden {

	private int id;
	ArrayList<LineaPedido> factura;

	public Orden(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int calcularTotalOrden() {

		return 0;
	}

	public void añadirItem(LineaPedido lp) {
		factura.add(lp);
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + "]";
	}

} // clase
