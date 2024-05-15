package Pedido;

import java.util.ArrayList;

public class Orden {

	private int id;
	ArrayList<LineaPedido> orden;
	LineaPedido lineaPedido;

	public Orden(int id) {
		this.id = id;
	}

	public Orden(int id, ArrayList<LineaPedido> orden) {
		super();
		this.id = id;
		this.orden = orden;
		lineaPedido = new LineaPedido();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public ArrayList<LineaPedido> getFactura() {
//		return factura;
//	}
//
//	public void setFactura(ArrayList<LineaPedido> factura) {
//		this.factura = factura;
//	}

	/**
	 * Método que añade una lista de pedido al ArrayList orden.
	 * 
	 * @param lp
	 */
	public void añadirItem(LineaPedido lp) {
		orden.add(lp);
	}

	/**
	 * Método que calcula el total de una orden sumando los subtotales de cada línea
	 * de pedido.
	 * 
	 * @return int
	 */
	public int calcularTotalOrden() {
		int total = 0;
		for (LineaPedido lp : orden) {
			total += lp.calcularSubtotalLineaPedido();
		}
		return total;
	}

	/**
	 * Método que lista las líneas de pedido del ArrayList orden.
	 * 
	 * @return String
	 */
	public String listarOrden() {
		String str = "";
		for (LineaPedido lp : orden) {
			lp.toString();
		}
		return str;
	}

	@Override
	public String toString() {
		return "Orden \nid=" + id + "\norden=" + orden + "\nLineas de pedido=" + listarOrden() + "\nPrecio total="
				+ calcularTotalOrden();
	}

} // clase
