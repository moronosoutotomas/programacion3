package JavaSwingNomina;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double salarioDia;
	private double otrosIngresos;
	private double pagosSalud;
	private double aportePensiones;
	private int diasTrabajados;
	private TipoCargo cargo;
	private TipoGenero genero;

	public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGenero genero, double salarioDea,
			int deasTrabajados, double otrosIngresos, double pagosSalud, double aportePensiones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.genero = genero;
		this.salarioDia = salarioDea;
		this.diasTrabajados = deasTrabajados;
		this.otrosIngresos = otrosIngresos;
		this.pagosSalud = pagosSalud;
		this.aportePensiones = aportePensiones;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public TipoCargo getCargo() {
		return cargo;
	}

	public TipoGenero getGenero() {
		return genero;
	}

	public double getSalarioDia() {
		return salarioDia;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;
	}

	public double getOtrosIngresos() {
		return otrosIngresos;
	}

	public double getPagosSalud() {
		return pagosSalud;
	}

	public double getAportePensiones() {
		return aportePensiones;
	}

	/**
	 * Método que calcula el salario mensual de un empleado
	 * 
	 * @return Salario mensual de un empleado
	 */
	public double calcularNomina() {
		return ((salarioDia * diasTrabajados) + otrosIngresos - pagosSalud - aportePensiones);
	}
} // clase
