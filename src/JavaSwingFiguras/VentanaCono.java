package JavaSwingFiguras;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCono extends JFrame implements ActionListener {

	private Container contenedor;

	private JLabel altura, alturaInclinada, radio, volumen, superficie;
	private JTextField campoAltura, campoAlturaInclinada, campoRadio;
	private JButton calcular;

	public VentanaCono() {
		inicio();
		setTitle("Cono");
		setSize(350, 240);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		radio = new JLabel();
		radio.setText("Radio (cms):");
		radio.setBounds(20, 20, 135, 23);
		campoRadio = new JTextField();
		campoRadio.setBounds(120, 20, 180, 23);

		altura = new JLabel();
		altura.setText("Altura (cms):");
		altura.setBounds(20, 50, 135, 23);
		campoAltura = new JTextField();
		campoAltura.setBounds(120, 50, 180, 23);

		alturaInclinada = new JLabel();
		alturaInclinada.setText("Altura inclinada (cms):");
		alturaInclinada.setBounds(20, 80, 200, 23);
		campoAlturaInclinada = new JTextField();
		campoAlturaInclinada.setBounds(165, 80, 135, 23);

		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(120, 110, 135, 23);
		calcular.addActionListener(this);

		volumen = new JLabel();
		volumen.setText("Volumen (cm3):");
		volumen.setBounds(20, 140, 200, 23);

		superficie = new JLabel();
		superficie.setText("Superficie (cm2):");
		superficie.setBounds(20, 170, 200, 23);

		contenedor.add(radio);
		contenedor.add(campoRadio);
		contenedor.add(altura);
		contenedor.add(campoAltura);
		contenedor.add(alturaInclinada);
		contenedor.add(campoAlturaInclinada);
		contenedor.add(calcular);
		contenedor.add(volumen);
		contenedor.add(superficie);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		Cono cono;
		boolean error = false;
		double altura = 0;
		double alturaInclinada = 0;
		double radio = 0;
		try {
			altura = Double.parseDouble(campoAltura.getText());
			alturaInclinada = Double.parseDouble(campoAlturaInclinada.getText());
			radio = Double.parseDouble(campoRadio.getText());
			cono = new Cono(altura, alturaInclinada, radio);
			volumen.setText("Volumen (cm3): " + String.format("%.2f", cono.calcularVolumen()));
			superficie.setText("Superficie (cm2): " + String.format("%.2f", cono.calcularSuperficie()));
		} catch (Exception e) {
			error = true;
		} finally {
			if (error) {
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

} // clase
