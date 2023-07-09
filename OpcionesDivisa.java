package appConversor;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class OpcionesDivisa extends JFrame {

	static double numero;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesDivisa frame = new OpcionesDivisa(numero);
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
	public OpcionesDivisa(double numero) {
		OpcionesDivisa.numero = numero;
		
		setTitle("Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 276);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int windowWidth = getWidth();
        int windowHeight = getHeight();
        int xPos = (screenWidth - windowWidth) / 2;
        int yPos = (screenHeight - windowHeight) / 2;
        setLocation(xPos, yPos);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformacion = new JLabel("Elija la moneda a la que desea convertir su dinero");
		lblInformacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInformacion.setForeground(SystemColor.infoText);
		lblInformacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacion.setBounds(61, 75, 283, 14);
		contentPane.add(lblInformacion);
		
		JComboBox monedaInicial = new JComboBox();
		monedaInicial.setBackground(SystemColor.control);
		monedaInicial.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolares", "Euros"}));
		monedaInicial.setBounds(94, 101, 85, 22);
		contentPane.add(monedaInicial);
		
		JComboBox monedaFinal = new JComboBox();
		monedaFinal.setBackground(SystemColor.control);
		monedaFinal.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolares", "Euros"}));
		monedaFinal.setBounds(220, 101, 85, 22);
		contentPane.add(monedaFinal);
		
		JLabel lblNewLabel_1 = new JLabel("De");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(66, 105, 18, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("A");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(192, 105, 18, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBackground(SystemColor.inactiveCaptionBorder);
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monedaInicio = monedaInicial.getSelectedItem().toString();
				String monedaFin = monedaFinal.getSelectedItem().toString();
				
				OperacionesDivisa calculadora = new OperacionesDivisa(numero);
				double respuesta = calculadora.conversion(numero, monedaInicio, monedaFin);
				JOptionPane.showMessageDialog(null, "Tiene " + respuesta + " "+ monedaFin);
				
			}
		});
		btnConvertir.setBounds(150, 142, 89, 23);
		contentPane.add(btnConvertir);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(UIManager.getColor("Button.darkShadow"));
		btnSalir.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				dispose();
			}
		});
		btnSalir.setBounds(278, 200, 89, 23);
		contentPane.add(btnSalir);
	}

}
