package appConversor;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuMonedas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMonedas frame = new MenuMonedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIndicaciones = new JLabel("Ingresa la cantidad de dinero que desea convertir: ");
		lblIndicaciones.setBounds(43, 50, 301, 14);
		contentPane.add(lblIndicaciones);
		
		JFormattedTextField InputCantidad = new JFormattedTextField();
		InputCantidad.setBounds(57, 75, 233, 20);
		contentPane.add(InputCantidad);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(67, 106, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(192, 106, 89, 23);
		contentPane.add(btnCancelar);
	}
}
