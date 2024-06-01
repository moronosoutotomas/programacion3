package Ej_3A;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {

//	Componentes requeridos para la ventana principal
	private Container contenedor;
	private JTextField campoTexto;
	private JLabel mensaje;
	private JButton eurosDolares, dolaresEuros;

//	Constructor de la ventana principal
	public VentanaPrincipal() {
		inicio();
		setTitle("Conversor dolar/euro");
		setSize(380, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

//	Método que inicia el programa (instancia todos los componentes)
	public void inicio() {

//		Contenedor principal de la ventana
		contenedor = getContentPane();
		contenedor.setLayout(null);

//		Campo de texto en el que introducir la cantidad
		campoTexto = new JTextField();
		campoTexto.setBounds(120, 20, 120, 23);
		campoTexto.addActionListener(this);

//		Mensaje informativo reutilizado para mostrar los 2 posibles resultados condicionalmente
		mensaje = new JLabel();
		mensaje.setText("Indique una cantidad y pulse en uno de los botones");
		mensaje.setBounds(35, 50, 320, 23);

//		Botón para la conversión euros -> dolares
		eurosDolares = new JButton();
		eurosDolares.setText("EUR a USD");
		eurosDolares.setBounds(35, 90, 130, 25);
		eurosDolares.addActionListener(this);

//		Botón para la conversión dolares -> euros
		dolaresEuros = new JButton();
		dolaresEuros.setText("USD a EUR");
		dolaresEuros.setBounds(195, 90, 130, 25);
		dolaresEuros.addActionListener(this);

//		Añadimos todo al contenedor principal
		contenedor.add(campoTexto);
		contenedor.add(mensaje);
		contenedor.add(eurosDolares);
		contenedor.add(dolaresEuros);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == eurosDolares) {
			double res = ConversorEurosDolares.eurosDolares(Double.parseDouble(campoTexto.getText()));
			mensaje.setText(String.valueOf(res));
		}

		if (evento.getSource() == dolaresEuros) {
			double res = ConversorEurosDolares.dolaresEuros(Double.parseDouble(campoTexto.getText()));
			mensaje.setText(String.valueOf(res));
		}
	}
}// clase
