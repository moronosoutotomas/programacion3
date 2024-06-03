package trimestre3_ej_2A;

import java.util.ArrayList;

public class Orden {

	public static final double IVA = 17;
	private int id;
	ArrayList<LineaPedido> itemsPedido;

	public Orden(int id) {
		super();
		this.id = id;
		this.itemsPedido = new ArrayList<LineaPedido>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<LineaPedido> getItemsPedido() {
		return itemsPedido;
	}

	/**
	 * Método que añade una lista de pedido al ArrayList orden.
	 * 
	 * @param identificador
	 * @param cantidad
	 * @param producto
	 */
	public void addItem(int identificador, int cantidad, Producto producto) {
		this.itemsPedido.add(new LineaPedido(identificador, cantidad, producto));
	}

	/**
	 * Método que calcula el total de una orden sumando los subtotales de cada línea
	 * de pedido.
	 * 
	 * @return int
	 */
	public int calcularTotalOrden() {
		int total = 0;
		for (LineaPedido lp : itemsPedido) {
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
		for (LineaPedido lp : itemsPedido) {
			lp.toString();
		}
		return str;
	}

	@Override
	public String toString() {
		return "Orden \nid=" + id + "\norden=" + itemsPedido + "\nLineas de pedido=" + listarOrden() + "\nPrecio total="
				+ calcularTotalOrden();
	}

	public String imprimirOrden() {

		String lineas = "Orden id= " + this.getId() + "\n" + "Total orden: " + this.calcularTotalOrden() + "€" + "\n"
				+ "" + "Lineas pedido: " + "\n\n";

		for (LineaPedido lp : itemsPedido) {
			lineas = lineas + "Producto:  " + lp.getProducto().getNombre() + "\n\t" + "Precio unitario: "
					+ lp.getProducto().getPrecio() + "€" + "\n\t" + "Cantidad: " + lp.getCantidadProducto() + " uds"
					+ " \n\t" + "Total linea:" + lp.calcularSubtotalLineaPedido() + "€" + "\n\n";
		}

		lineas = lineas + "=========== TOTALES ===========";
		lineas = lineas + "\n· Sin IVA: " + this.calcularTotalOrden() + "€";
		lineas = lineas + "\n· IVA: " + ((int) IVA) + "%";
		lineas = lineas + "\n· TOTAL: " + this.calcularTotalOrden() * (1 - IVA / 100.0) + "€";
		return lineas;
	}

} // clase
