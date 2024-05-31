package JavaSwingNomina;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class VentanaAgregarEmpleado extends JFrame implements ActionListener {

	private Container contenedor;
	private ListaEmpleados lista;
	private JLabel nombre, apellidos, cargo, salarioDia, numeroDias, genero, otrosIngresos, aportesSalud, pensiones;
	private JTextField campoNombre, campoApellidos, campoSalarioDia, campoOtrosIngresos, campoAportesSalud,
			campoPensiones;
	private ButtonGroup grupoGenero; // Grupo de botones de radio
	private JRadioButton masculino, femenino; // Botones de radios
	private JComboBox<String> campoCargo; // PEPE NO LO TIENE PARAMETRIZADO
	private JSpinner campoNumeroDias; // Un selector de datos numérico
	private SpinnerNumberModel modeloSpinner; // Modelo numérico para el selector numérico
	private JButton agregar, limpiar; // Botones para agregar un empleado y para borrar la lista de empleados

	/**
	 * Constructor de la clase VentanaAgregarEmpleado
	 * 
	 * @param lista Parámetro que define la lista de empleados
	 */
	public VentanaAgregarEmpleado(ListaEmpleados lista) {
		this.lista = lista;
		inicio();
		setTitle("Agregar Empleado"); // Establece el título de la ventana
		setSize(300, 400); // Establece el tamaño de la ventana
		setLocationRelativeTo(null);
		setResizable(false);
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	public void inicio() {
		contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
		contenedor.setLayout(null); // Establece que el contenedor no tiene un layout
// Establece la etiqueta y el campo de texto nombre del empleado
		nombre = new JLabel();
		nombre.setText("Nombre:");
// Establece la posición de la etiqueta nombre del empleado
		nombre.setBounds(20, 20, 135, 23);
		campoNombre = new JTextField();
// Establece la posición del campo de texto nombre del empleado
		campoNombre.setBounds(160, 20, 100, 23);
// Establece la etiqueta y el campo de texto apellidos del empleado
		apellidos = new JLabel();
		apellidos.setText("Apellidos:");
// Establece la posición de la etiqueta apellidos del empleado
		apellidos.setBounds(20, 50, 135, 23);
		campoApellidos = new JTextField();
// Establece la posición del campo de texto apellidos del empleado
		campoApellidos.setBounds(160, 50, 100, 23);
// Establece la etiqueta y el combo box del cargo del empleado
		cargo = new JLabel();
		cargo.setText("Cargo:");
		cargo.setBounds(20, 80, 135, 23);
		campoCargo = new JComboBox<String>();
// Agrega los tres tipos de cargo de un empleado al combobox
		campoCargo.addItem("Directivo");
		campoCargo.addItem("Estratégico");
		campoCargo.addItem("Operativo");
// Establece la posición del combobox cargo del empleado
		campoCargo.setBounds(160, 80, 100, 23);

		genero = new JLabel();
		genero.setText("Género:");
// Establece la posición de la etiqueta de género del empleado
		genero.setBounds(20, 110, 100, 30);
		grupoGenero = new ButtonGroup(); // Crea un grupo de botones
		masculino = new JRadioButton("Masculino", true);
		masculino.setBounds(160, 110, 100, 30);
		grupoGenero.add(masculino); // Añade el botón al grupo
		femenino = new JRadioButton("Femenino");
		femenino.setBounds(160, 140, 100, 30);
		grupoGenero.add(femenino); // Añade el botón al grupo

		salarioDia = new JLabel();
		salarioDia.setText("Salario por día:");
// Establece la posición de la etiqueta salario por día del empleado
		salarioDia.setBounds(20, 170, 135, 23);
		campoSalarioDia = new JTextField();

		campoSalarioDia.setBounds(160, 170, 100, 23);

		numeroDias = new JLabel();
		numeroDias.setText("Días trabajados al mes:");

		numeroDias.setBounds(20, 200, 135, 23);
		campoNumeroDias = new JSpinner(); // Crea un spinner
		modeloSpinner = new SpinnerNumberModel(); // Crea un modelo numérico para el spinner
// Define valor mínimo, máximo y valor inicial para el spinner
		modeloSpinner.setMinimum(1);
		modeloSpinner.setMaximum(31);
		modeloSpinner.setValue(30);
		campoNumeroDias.setModel(modeloSpinner); // Asocia el modelo numérico al spinner
		campoNumeroDias.setBounds(160, 200, 40, 23); // Establece la posición del spinner

		otrosIngresos = new JLabel();
		otrosIngresos.setText("Otros ingresos:");
// Establece la posición de la etiqueta otro ingresos del empleado
		otrosIngresos.setBounds(20, 230, 135, 23);
		campoOtrosIngresos = new JTextField();
		campoOtrosIngresos.setBounds(160, 230, 100, 23);
		aportesSalud = new JLabel();
		aportesSalud.setText("Pagos por salud:");
// Establece la posición de la etiqueta pagos por salud del empleado
		aportesSalud.setBounds(20, 260, 135, 23);
		campoAportesSalud = new JTextField();
		campoAportesSalud.setBounds(160, 260, 100, 23);
		pensiones = new JLabel();
		pensiones.setText("Aportes pensiones:");
// Establece la posición de la etiqueta aporte pensiones del empleado
		pensiones.setBounds(20, 290, 135, 23);
		campoPensiones = new JTextField();
		campoPensiones.setBounds(160, 290, 100, 23);
// Establece el botón agregar empleado
		agregar = new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(20, 320, 100, 23);
		agregar.addActionListener(this);
// Establece el botón borrar empleados
		limpiar = new JButton();
		limpiar.setText("Borrar");
		limpiar.setBounds(160, 320, 80, 23);
		limpiar.addActionListener(this);
// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(nombre);
		contenedor.add(campoNombre);
		contenedor.add(apellidos);
		contenedor.add(campoApellidos);
		contenedor.add(cargo);
		contenedor.add(campoCargo);
		contenedor.add(genero);
		contenedor.add(masculino);
		contenedor.add(femenino);
		contenedor.add(salarioDia);
		contenedor.add(campoSalarioDia);
		contenedor.add(numeroDias);
		contenedor.add(campoNumeroDias);
		contenedor.add(otrosIngresos);
		contenedor.add(campoOtrosIngresos);
		contenedor.add(aportesSalud);
		contenedor.add(campoAportesSalud);
		contenedor.add(pensiones);
		contenedor.add(campoPensiones);
		contenedor.add(agregar);
		contenedor.add(limpiar);
	}

	/**
	 * Método que borra los campos de texto ingresados en la ventana de agregar
	 * empleado
	 */
	public void limpiarCampos() {
		campoNombre.setText("");
		campoApellidos.setText("");
		campoSalarioDia.setText("");
		campoNumeroDias.setValue(0);
		campoOtrosIngresos.setText("");
		campoAportesSalud.setText("");
		campoPensiones.setText("");
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == agregar) {
			añadirEmpleado();
		}
		if (evento.getSource() == limpiar) {
			limpiarCampos();
		}
	}

	/**
	 * Método que agrega un empleado a la lista de empleados throws Exception
	 * Excepción de campo nulo o error en formato de numero
	 */
	private void añadirEmpleado() {
		TipoCargo tipoC;
// Obtiene el cargo seleccionado del combobox
		String itemSeleccionado = (String) campoCargo.getSelectedItem();

		if (itemSeleccionado == "Directivo") {
			tipoC = TipoCargo.DIRECTIVO;
		} else if (itemSeleccionado == "Estratégico") {
			tipoC = TipoCargo.ESTRATEGICO;
		} else {
			tipoC = TipoCargo.OPERATIVO;
		}
		TipoGenero tipoG;

		if (masculino.isSelected()) {
			tipoG = TipoGenero.MASCULINO;
		} else {
			tipoG = TipoGenero.FEMENINO;
		}
		try {
			String valor1 = campoNombre.getText();
			String valor2 = campoApellidos.getText();
// Se obtiene y convierte el campo de texto salario
			double valor3 = Double.parseDouble(campoSalarioDia.getText());
// Se obtiene el valor ingresado de días trabajados
			int valor4 = (int) campoNumeroDias.getValue();
// Se obtiene y convierte el campo de texto otros ingresos
			double valor5 = Double.parseDouble(campoOtrosIngresos.getText());
// Se obtiene y convierte el campo de texto aportes salud
			double valor6 = Double.parseDouble(campoAportesSalud.getText());
// Se obtiene y convierte el campo de texto pensiones
			double valor7 = Double.parseDouble(campoPensiones.getText());
			Empleado e = new Empleado(valor1, valor2, tipoC, tipoG, valor3, valor4, valor5, valor6, valor7);
			lista.agregarEmpleado(e);
// Mensaje de confirmación de empleado agregado a la lista
			JOptionPane.showMessageDialog(this, "El empleado ha sido agregado", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);
			limpiarCampos();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
} // clase
