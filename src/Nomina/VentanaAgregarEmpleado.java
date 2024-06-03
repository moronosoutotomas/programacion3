package Nomina;

import javax.swing.*;

import Nomina.Empleado.TipoCargo;
import Nomina.Empleado.TipoGenero;

// import Nomina.EmpleadosYNominas.Empleado.TipoCargo;
// import Nomina.EmpleadosYNominas.Empleado.TipoGenero;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarEmpleado extends JFrame implements ActionListener {
    private ListaEmpleados empleados;
    private JTextField nombreField, apellidosField, salarioField, diasField, otrosIngresosField, saludField, pensionesField;
    private JComboBox<TipoCargo> cargoBox;
    private JComboBox<TipoGenero> generoBox;
    private JButton agregarButton;

    public VentanaAgregarEmpleado(ListaEmpleados empleados) {
        this.empleados = empleados;
        setTitle("Agregar Empleado");
        setSize(300, 400);
        setLayout(new GridLayout(10, 2));

        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Apellidos:"));
        apellidosField = new JTextField();
        add(apellidosField);

        add(new JLabel("Cargo:"));
        cargoBox = new JComboBox<>(TipoCargo.values());
        add(cargoBox);

        add(new JLabel("Género:"));
        generoBox = new JComboBox<>(TipoGenero.values());
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

        agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(this);
        add(agregarButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreField.getText();
        String apellidos = apellidosField.getText();
        TipoCargo cargo = (TipoCargo) cargoBox.getSelectedItem();
        TipoGenero genero = (TipoGenero) generoBox.getSelectedItem();
        double salario = Double.parseDouble(salarioField.getText());
        int dias = Integer.parseInt(diasField.getText());
        double otrosIngresos = Double.parseDouble(otrosIngresosField.getText());
        double salud = Double.parseDouble(saludField.getText());
        double pensiones = Double.parseDouble(pensionesField.getText());

        Empleado empleado = new Empleado(nombre, apellidos, cargo, genero, salario, dias, otrosIngresos, salud, pensiones);
        empleados.agregarEmpleado(empleado);

        JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }
}
