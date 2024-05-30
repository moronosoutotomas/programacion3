package JavaSwingNomina;

import java.util.ArrayList;

public class ListaEmpleados {

	public ArrayList<Empleado> lista;
	public double totalNomina = 0;

	public ListaEmpleados() {
		lista = new ArrayList();
	}

	/**
	 * Método que agrega un empleado a la lista de empleados
	 * 
	 * @param a Parámetro que define un empleado a agregar a la lista de empleados
	 */
	public void agregarEmpleado(Empleado a) {
		lista.add(a);
	}

	/**
	 * Método que calcula la nómina total mensual de la empresa
	 * 
	 * @return La nómina total mensual de la empresa
	 */
	public double calcularTotalNomina() {
		for (int i = 0; i < lista.size(); i++) {
			Empleado e = (Empleado) lista.get(i);
			totalNomina = totalNomina + e.calcularNomina();
		}
		return totalNomina;
	}

	/**
	 * Método que convierte los datos de la lista de empleados en una matriz
	 */
	public String[][] obtenerMatriz() {
		String datos[][] = new String[lista.size()][3];
		for (int i = 0; i < lista.size(); i++) {
			Empleado e = (Empleado) lista.get(i);
			datos[i][0] = e.getNombre(); // Coloca el nombre del empleado en la 1ª columna
			datos[i][1] = e.getApellidos(); // Coloca los apellidos del empleado en la 2ª columna
			datos[i][2] = Double.toString(e.calcularNomina()); // Coloca el salario del empleado en la 3ª columna
			totalNomina += e.calcularNomina();
		}
		return datos;
	}

	/**
	 * Método que convierte los datos de la lista de empleados a texto
	 */
	public String convertirTexto() {
		String texto = "";
		for (int i = 0; i < lista.size(); i++) {
			Empleado e = (Empleado) lista.get(i);
			texto += "Nombre = " + e.getNombre() + "\nApellidos = " + e.getApellidos() + "\nCargo = " + e.getCargo()
					+ "\nGénero = " + e.getGenero() + "\nSalario = " + e.getSalarioDia() + "€" + "\nDías trabajados = "
					+ e.getDiasTrabajados() + "\nOtros ingresos = " + e.getOtrosIngresos() + "€" + "\nPagos saludo = "
					+ e.getPagosSalud() + "€" + "\nAportes pensiones = " + e.getAportePensiones() + "€"
					+ "\n---------\n";
		}
		texto += "Total nómina = $" + String.format("%.2f", calcularTotalNomina());
		return texto;
	}
} // clase
