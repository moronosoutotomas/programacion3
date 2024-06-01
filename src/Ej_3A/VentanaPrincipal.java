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
	private JLabel instrucciones;
	private JLabel resultadoEurosDolares;
	private JLabel resultadoDolaresEuros;
	private JButton eurosDolares, dolaresEuros;

//	Constructor de la ventana principal
	public VentanaPrincipal() {
		inicio();
		setTitle("Conversor dolar/euro");
		setSize(350, 160);
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
		campoTexto.setBounds(20, 50, 80, 23);
		campoTexto.addActionListener(this);

//		Instrucciones del programa
		instrucciones = new JLabel();
		instrucciones.setText("Indique una cantidad y pulse en uno de los botones");
		instrucciones.setBounds(20, 50, 80, 23);

//		Resultado caso euros -> dolares
		resultadoEurosDolares = new JLabel();
		resultadoEurosDolares.setText("resultado"); // TODO: poner resultado
		resultadoEurosDolares.setBounds(20, 50, 80, 23);

//		Resultado caso dolares -> euros
		resultadoDolaresEuros = new JLabel();
		resultadoDolaresEuros.setText("resultado"); // TODO: poner resultado
		resultadoDolaresEuros.setBounds(20, 50, 80, 23);

//		Botón para la conversión euros -> dolares
		eurosDolares = new JButton();
		eurosDolares.setText("Cilindro");
		eurosDolares.setBounds(20, 50, 80, 23);
		eurosDolares.addActionListener(this);

//		Botón para la conversión dolares -> euros
		dolaresEuros = new JButton();
		dolaresEuros.setText("Cilindro");
		dolaresEuros.setBounds(20, 50, 80, 23);
		dolaresEuros.addActionListener(this);

//		Añadimos todo al contenedor principal
		contenedor.add(campoTexto);
		contenedor.add(instrucciones);
		contenedor.add(eurosDolares);
		contenedor.add(dolaresEuros);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == eurosDolares) {
//			ConversorEurosDolares.eurosDolares(campoTexto); TODO: preguntar a Larota
			resultadoEurosDolares.setVisible(true);
		}

		if (evento.getSource() == dolaresEuros) {
//			lógica
			resultadoDolaresEuros.setVisible(true);
		}
	}
}// clase
