package JavaSwingNomina;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private Container contenedor; // Un contenedor de elementos gráficos
	ListaEmpleados empleados; // Un vector de empleados
	private JMenuBar barraMenu; // Una barra de menú principal
	private JMenu menuOpciones; // Un menú de la barra de menú principal
	private JMenuItem itemMenu1; // Un ítem de menú
	private JMenuItem itemMenu2; // Un ítem de menú
	private JMenuItem itemMenu3; // Un ítem de menú

	public VentanaPrincipal() {
		empleados = new ListaEmpleados(); // Se crea la lista de empleados
		inicio();
		setTitle("Nómina"); // Establece el título de la ventana
		setSize(280, 380); // Establece el tamaño de la ventana
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	public void inicio() {
		contenedor = getContentPane(); /*
										 * Obtiene el panel de contenidos de la ventana
										 */
		contenedor.setLayout(null); /*
									 * Establece que el contenedor no tiene un layout
									 */
// Se crea la barra de menús, un menú y tres ítems de menú
		barraMenu = new JMenuBar();
		menuOpciones = new JMenu("Menú");
		itemMenu1 = new JMenuItem("Agregar empleado");
		itemMenu2 = new JMenuItem("Calcular nómina");
		itemMenu3 = new JMenuItem("Guardar archivo");
		menuOpciones.add(itemMenu1); // Se agrega el ítem de menú 1 al menú
		menuOpciones.add(itemMenu2); // Se agrega el ítem de menú 2 al menú
		menuOpciones.add(new JSeparator()); // Se agrega una línea divisoria
		menuOpciones.add(itemMenu3); // Se agrega el ítem de menú 3 al menú
		barraMenu.add(menuOpciones); // Se agregan las opciones de menú al menú
		setJMenuBar(barraMenu); // Se agrega el menú a la ventana

		itemMenu1.addActionListener(this);
		itemMenu2.addActionListener(this);
		itemMenu3.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal throws
	 * Exception Excepción en la creación o escritura del archivo
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == itemMenu1) {
			VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
			ventanaAgregar.setVisible(true); // Se hace visible la ventana
		}
		if (evento.getSource() == itemMenu2) {
			VentanaNómina ventanaNómina = new VentanaNómina(empleados);
			ventanaNómina.setVisible(true);
		}
		if (evento.getSource() == itemMenu3) {
			JFileChooser fc = new JFileChooser();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

			int respuesta = fc.showOpenDialog(this);
			if (respuesta == JFileChooser.APPROVE_OPTION) {
				File directorioElegido = fc.getSelectedFile();
				String nombre = directorioElegido.getName();

				try {
					String contenido = empleados.convertirTexto();
					File file = new File(nombre + "\\" + "Nómina.txt");
					file.createNewFile();
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(contenido);
					bw.close(); // Se cierra el archivo
					String texto = "El archivo de la nómina Nómina.txt se ha creado en " + nombre;
					JOptionPane.showMessageDialog(this, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

} // clase
