package appConversor;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaDivisa extends JFrame {

	private JPanel contentPane;
	private JTextField InputDevisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDivisa frame = new VentanaDivisa();
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
	public VentanaDivisa() {
		setTitle("Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JLabel lblInputDinero = new JLabel("Ingresa la cantidad de dinero que deseas convertir:");
		lblInputDinero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInputDinero.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputDinero.setBounds(67, 85, 311, 14);
		contentPane.add(lblInputDinero);
		
		InputDevisa = new JTextField();
		InputDevisa.setBackground(SystemColor.inactiveCaptionBorder);
		InputDevisa.setText("   ");
		InputDevisa.setToolTipText("");
		InputDevisa.setBounds(98, 110, 227, 20);
		contentPane.add(InputDevisa);
		InputDevisa.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBackground(SystemColor.inactiveCaptionBorder);
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
                    String texto = InputDevisa.getText();
                    
                    float numero = Float.parseFloat(texto);

                   OpcionesDivisa opciones = new OpcionesDivisa(numero);
                   setVisible(false);
                   opciones.setVisible(true);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido");
                }
			}
		});
		btnContinuar.setBounds(108, 141, 89, 23);
		contentPane.add(btnContinuar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.inactiveCaptionBorder);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				dispose();
			}
		});
		btnCancelar.setBounds(232, 141, 89, 23);
		contentPane.add(btnCancelar);
	}
}
