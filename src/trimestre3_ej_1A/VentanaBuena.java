package trimestre3_ej_1A;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaBuena extends JFrame implements ActionListener {

//	Componentes requeridos para la ventana principal
	private Container contenedor;
	private JTextField campoTexto1, campoTexto2;
	private JLabel mensaje1, mensaje2, resultado;
	private JButton calcular;

	public VentanaBuena() {
		inicio();
		setTitle("Conversor stones/libras");
		setSize(380, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void inicio() {

		contenedor = getContentPane();
		contenedor.setLayout(null);

		campoTexto1 = new JTextField();
		campoTexto1.setBounds(150, 40, 180, 28);
		campoTexto1.addActionListener(this);

		campoTexto2 = new JTextField();
		campoTexto2.setBounds(150, 90, 180, 28);
		campoTexto2.addActionListener(this);

		mensaje1 = new JLabel();
		mensaje1.setText("Stones => ");
		mensaje1.setBounds(50, 40, 170, 28);

		mensaje2 = new JLabel();
		mensaje2.setText("Libras => ");
		mensaje2.setBounds(50, 90, 170, 28);

		calcular = new JButton();
		calcular.setText("Stones a Libras");
		calcular.setBounds(115, 140, 130, 25);
		calcular.addActionListener(this);

		resultado = new JLabel();
		resultado.setText("");
		resultado.setBounds(160, 200, 160, 25);

		contenedor.add(campoTexto1);
		contenedor.add(campoTexto2);
		contenedor.add(mensaje1);
		contenedor.add(mensaje2);
		contenedor.add(calcular);
		contenedor.add(resultado);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			double res = ConversorStonesLibras.stonesKg(Double.parseDouble(campoTexto1.getText()));
			res += ConversorStonesLibras.librasKg(Double.parseDouble(campoTexto2.getText()));
			resultado.setText(String.valueOf(res));

		}

	}

} // clase
