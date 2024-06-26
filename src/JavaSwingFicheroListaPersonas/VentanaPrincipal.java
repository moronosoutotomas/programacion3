package JavaSwingFicheroListaPersonas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private ListaPersonas lista; // El objeto ListaPersonas de la aplicación

	private Container contenedor; // Un contenedor de elementos gráficos
	private JLabel nombre, apellidos, telefono, direccion; // Etiquetas estáticas para los nombres de los atributos
	private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion; // Campos de ingreso de texto
	private JButton añadir, eliminar, borrarLista, guardar; // Botones
	private JList jListListaPersonas; // Lista de personas
	private DefaultListModel modeloJList; // Objeto que modela la lista
	private JScrollPane scrollLista; // Barra de desplazamiento vertical

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		lista = new ListaPersonas(); // Crea la lista de personas desde cero
		inicio();
		setTitle("Personas"); // Establece el título de la ventana
		setSize(270, 350); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
		setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece que el botón de cerrar permitirá salir de la
														// aplicación
		cargarListaPersonas();
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
		contenedor.setLayout(null); // Establece que el panel no tiene asociado ningún layout

		nombre = new JLabel(); // Establece la etiqueta nombre
		nombre.setText("Nombre:");// Establece el campo nombre
		nombre.setBounds(20, 20, 135, 23); // Establece la posición de la etiqueta nombre

		campoNombre = new JTextField();
		campoNombre.setBounds(105, 20, 135, 23);

		apellidos = new JLabel();
		apellidos.setText("Apellidos:");
		apellidos.setBounds(20, 50, 135, 23);

		campoApellidos = new JTextField();
		campoApellidos.setBounds(105, 50, 135, 23);

		telefono = new JLabel();
		telefono.setText("Teléfono:");
		telefono.setBounds(20, 80, 135, 23);

		campoTelefono = new JTextField();
		campoTelefono.setBounds(105, 80, 135, 23);

		direccion = new JLabel();
		direccion.setText("Dirección:");
		direccion.setBounds(20, 110, 135, 23);

		campoDireccion = new JTextField();
		campoDireccion.setBounds(105, 110, 135, 23);

		añadir = new JButton();
		añadir.setText("Añadir");
		añadir.setBounds(20, 150, 80, 23);
		añadir.addActionListener(this);

//		Botón de guardar requerido por Pepe
		guardar = new JButton();
		guardar.setText("Guardar lista");
		guardar.setBounds(120, 150, 120, 23);
		guardar.addActionListener(this);

		eliminar = new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(20, 280, 80, 23);
		eliminar.addActionListener(this);

		borrarLista = new JButton();
		borrarLista.setText("Borrar Lista");
		borrarLista.setBounds(120, 280, 120, 23);
		borrarLista.addActionListener(this); // Agrega al botón un ActionListener para que gestione eventos del botón

// 		Establece la lista gráfica de personas
		jListListaPersonas = new JList();
		jListListaPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Establece que se pueda seleccionar
																					// solamente un elemento de la lista
		modeloJList = new DefaultListModel();

		scrollLista = new JScrollPane(); // Establece una barra de desplazamiento vertical
		scrollLista.setBounds(20, 190, 220, 80); // Establece la posición de la barra de desplazamiento vertical
		scrollLista.setViewportView(jListListaPersonas); // Asocia la barra de desplazamiento vertical a la lista de
															// personas

// 		Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(nombre);
		contenedor.add(campoNombre);
		contenedor.add(apellidos);
		contenedor.add(campoApellidos);
		contenedor.add(telefono);
		contenedor.add(campoTelefono);
		contenedor.add(direccion);
		contenedor.add(campoDireccion);
		contenedor.add(añadir);
		contenedor.add(guardar);
		contenedor.add(eliminar);
		contenedor.add(borrarLista);
		contenedor.add(scrollLista);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == añadir) { // Si se pulsa el botón añadir
			añadirPersona(); // Se invoca añadir persona
		}
		if (evento.getSource() == eliminar) {
			eliminarPersona(jListListaPersonas.getSelectedIndex());
		}
		if (evento.getSource() == borrarLista) {
			borrarLista();
		}
		if (evento.getSource() == guardar) {
			guardarListaPersonas();
		}
	}

	/**
	 * Método que agrega una persona al ArrayList de personas y a la lista gráfica
	 * de personas
	 */
	private void añadirPersona() {

		Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(), campoTelefono.getText(),
				campoDireccion.getText());

		lista.añadirPersona(p);

//		String elemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTelefono.getText() + "-"
//				+ campoDireccion.getText(); // se supone que esto también vale
		String elemento = p.toString();
		modeloJList.addElement(elemento);
		jListListaPersonas.setModel(modeloJList);

		campoNombre.setText("");
		campoApellidos.setText("");
		campoTelefono.setText("");
		campoDireccion.setText("");
	}

	/**
	 * Método que elimina una persona del vector de personas y de la lista gráfica
	 * de personas en la ventana
	 * 
	 * @param indice Parámetro que define la posición de la persona a eliminar
	 */
	private void eliminarPersona(int indice) {
		if (indice >= 0) {
			modeloJList.remove(indice);
			lista.eliminarPersona(indice);
		} else {
			JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método que elimina todas las personas del ArrayList de personas
	 */
	private void borrarLista() {
		lista.borrarLista();
		modeloJList.clear(); // Limpia el JList, la lista gráfica de personas
	}

	/**
	 * Método que guarda la persona en cuestión en el fichero con la lista de
	 * personas
	 */
	private void guardarListaPersonas() {
		lista.guardarEnArchivo(
				"C:\\Users\\Tomás\\eclipse-workspace\\tercero\\src\\JavaSwingFicheroListaPersonas\\ListaPersonas.obj");
	}

	/**
	 * Método que guarda la persona en cuestión en el fichero con la lista de
	 * personas
	 */
	private void cargarListaPersonas() {
		ArrayList<Persona> personas = lista.cargarDesdeArchivo(
				"C:\\Users\\Tomás\\eclipse-workspace\\tercero\\src\\JavaSwingFicheroListaPersonas\\ListaPersonas.obj");

		for (Persona p : personas) {
			modeloJList.addElement(p);
		}
		jListListaPersonas.setModel(modeloJList);
	}

} // clase
