package Pedido;

public class LineaPedido {

	private int id;
	private int cantidadProducto;
	private Producto producto;

	public LineaPedido() {
	}

	public LineaPedido(int id, int cantidad, Producto producto) {
		this.id = id;
		this.cantidadProducto = cantidad;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * Método que calcula el subtotal de la línea de pedido de un producto.
	 * 
	 * @return int
	 */
	public double calcularSubtotalLineaPedido() {
		try {
			return producto.getPrecio() * this.getCantidadProducto();
		} catch (NullPointerException e) {
			System.out.println("EL producto no tiene un precio asociado todavía.");
		}
		return 0;
	}

	@Override
	public String toString() {
		return "LineaPedido \nid=" + id + "\ncantidad=" + cantidadProducto + "\nProducto=" + producto.toString();
	}

} // clase
