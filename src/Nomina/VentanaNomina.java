package Nomina;

import javax.swing.*;
import java.awt.*;

public class VentanaNomina extends JFrame {
    
    public VentanaNomina(ListaEmpleados empleados) {
        setTitle("Nómina");
        setSize(400, 300);
        setLayout(new BorderLayout());

        String[][] datos = empleados.obtenerMatriz();
        String[] columnas = {"Nombre", "Apellidos", "Salario"};

        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tabla);

        add(scrollPane, BorderLayout.CENTER);
    }
}