package Nomina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    ListaEmpleados empleados;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemMenu1, itemMenu2, itemMenu3, itemMenu4, itemMenu5;

    public VentanaPrincipal() {
        empleados = new ListaEmpleados();
        inicio();
        setTitle("Nómina");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Menú");
        itemMenu1 = new JMenuItem("Agregar empleado");
        itemMenu2 = new JMenuItem("Calcular nómina");
        itemMenu3 = new JMenuItem("Guardar archivo");
        itemMenu4 = new JMenuItem("Cargar archivo");
        itemMenu5 = new JMenuItem("Editar/Eliminar empleado");

        menuOpciones.add(itemMenu1);
        menuOpciones.add(itemMenu2);
        // cone este metodo lo que creamos es una barra separatoria para no tener los metodos juntos.
        menuOpciones.add(new JSeparator());
        menuOpciones.add(itemMenu3);
        menuOpciones.add(itemMenu4);
        menuOpciones.add(itemMenu5);
        barraMenu.add(menuOpciones);
        setJMenuBar(barraMenu);

        itemMenu1.addActionListener(this);
        itemMenu2.addActionListener(this);
        itemMenu3.addActionListener(this);
        itemMenu4.addActionListener(this);
        itemMenu5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == itemMenu1) {
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true);
        } else if (evento.getSource() == itemMenu2) {
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true);
        } else if (evento.getSource() == itemMenu3) {
            JFileChooser fc = new JFileChooser();
            int respuesta = fc.showSaveDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File archivo = fc.getSelectedFile();
                try {
                    empleados.guardarLista(archivo.getAbsolutePath());
                    JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (evento.getSource() == itemMenu4) {
            JFileChooser fc = new JFileChooser();
            int respuesta = fc.showOpenDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File archivo = fc.getSelectedFile();
                try {
                    empleados = ListaEmpleados.cargarLista(archivo.getAbsolutePath());
                    JOptionPane.showMessageDialog(this, "Archivo cargado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } else if (evento.getSource() == itemMenu5) {
            VentanaEditarEliminarEmpleado ventanaEditarEliminar = new VentanaEditarEliminarEmpleado(empleados);
            ventanaEditarEliminar.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}