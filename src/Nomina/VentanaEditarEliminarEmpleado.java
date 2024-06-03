package Nomina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEditarEliminarEmpleado extends JFrame implements ActionListener {
    private ListaEmpleados empleados;
    private JComboBox<String> empleadoBox;
    private JTextField nombreField, apellidosField, salarioField, diasField, otrosIngresosField, saludField, pensionesField;
    private JComboBox<Empleado.TipoCargo> cargoBox;
    private JComboBox<Empleado.TipoGenero> generoBox;
    private JButton editarButton, eliminarButton;

    public VentanaEditarEliminarEmpleado(ListaEmpleados empleados) {
        this.empleados = empleados;
        setTitle("Editar/Eliminar Empleado");
        setSize(400, 450);
        setLayout(new GridLayout(11, 2));

        add(new JLabel("Seleccionar Empleado:"));
        empleadoBox = new JComboBox<>();
        for (Empleado e : empleados.lista) {
            empleadoBox.addItem(e.getNombre() + " " + e.getApellidos());
        }
        add(empleadoBox);

        empleadoBox.addActionListener(this);

        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Apellidos:"));
        apellidosField = new JTextField();
        add(apellidosField);

        add(new JLabel("Cargo:"));
        cargoBox = new JComboBox<>(Empleado.TipoCargo.values());
        add(cargoBox);

        add(new JLabel("Género:"));
        generoBox = new JComboBox<>(Empleado.TipoGenero.values());
        add(generoBox);

        add(new JLabel("Salario por día:"));
        salarioField = new JTextField();
        add(salarioField);

        add(new JLabel("Días trabajados:"));
        diasField = new JTextField();
        add(diasField);

        add(new JLabel("Otros ingresos:"));
        otrosIngresosField = new JTextField();
        add(otrosIngresosField);

        add(new JLabel("Pagos salud:"));
        saludField = new JTextField();
        add(saludField);

        add(new JLabel("Aportes pensiones:"));
        pensionesField = new JTextField();
        add(pensionesField);

        editarButton = new JButton("Editar");
        editarButton.addActionListener(this);
        add(editarButton);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.addActionListener(this);
        add(eliminarButton);

        actualizarCampos();
    }

    private void actualizarCampos() {
        int index = empleadoBox.getSelectedIndex();
        if (index >= 0) {
            Empleado empleado = empleados.obtenerEmpleado(index);
            nombreField.setText(empleado.getNombre());
            apellidosField.setText(empleado.getApellidos());
            cargoBox.setSelectedItem(empleado.getCargo());
            generoBox.setSelectedItem(empleado.getGénero());
            salarioField.setText(String.valueOf(empleado.getSalarioDía()));
            diasField.setText(String.valueOf(empleado.getDíasTrabajados()));
            otrosIngresosField.setText(String.valueOf(empleado.getOtrosIngresos()));
            saludField.setText(String.valueOf(empleado.getPagosSalud()));
            pensionesField.setText(String.valueOf(empleado.getAportePensiones()));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editarButton) {
            int index = empleadoBox.getSelectedIndex();
            if (index >= 0) {
                Empleado empleado = new Empleado(
                    nombreField.getText(),
                    apellidosField.getText(),
                    (Empleado.TipoCargo) cargoBox.getSelectedItem(),
                    (Empleado.TipoGenero) generoBox.getSelectedItem(),
                    Double.parseDouble(salarioField.getText()),
                    Integer.parseInt(diasField.getText()),
                    Double.parseDouble(otrosIngresosField.getText()),
                    Double.parseDouble(saludField.getText()),
                    Double.parseDouble(pensionesField.getText())
                );
                empleados.editarEmpleado(index, empleado);
                JOptionPane.showMessageDialog(this, "Empleado editado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == eliminarButton) {
            int index = empleadoBox.getSelectedIndex();
            if (index >= 0) {
                empleados.eliminarEmpleado(empleados.obtenerEmpleado(index));
                empleadoBox.removeItemAt(index);
                actualizarCampos();
                JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == empleadoBox) {
            actualizarCampos();
        }
    }
}