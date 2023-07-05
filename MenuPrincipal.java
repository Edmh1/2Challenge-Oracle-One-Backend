package appConversor;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {

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
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
					//centrado de app en la pantalla
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Choice cboConversores = new Choice();
		cboConversores.addItem("Conversor de Monedas");
		cboConversores.addItem("Conversor de Unidades");
		cboConversores.addItem("Conversor de Temperatura");
		cboConversores.setBounds(93, 62, 174, 23);
		contentPane.add(cboConversores);
		
		JButton btnOpcionElegida = new JButton("Aceptar");
		btnOpcionElegida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String elegido = cboConversores.getSelectedItem();
				if(elegido == "Conversor de Monedas") {
					 // Crear instancia de la nueva ventana
					MenuMonedas ventanaSecundaria = new MenuMonedas();
	                
	                // Ocultar la ventana actual
	                setVisible(false);
	                
	                // Mostrar la nueva ventana
	                ventanaSecundaria.setVisible(true);
	                
					//centrado de app en la pantalla
					ventanaSecundaria.setLocationRelativeTo(null);
				}
				/*else if (elegido == "Conversor de Unidades") {
					
					MenuUnidades ventanaSecundaria = new MenuUnidades();
	                
	                
	                setVisible(false);
	                
	                
	                ventanaSecundaria.setVisible(true);
	                
					
					ventanaSecundaria.setLocationRelativeTo(null);
				}
				else if (elegido == "Conversor de Temperatura") {
					
					MenuTemperatura ventanaSecundaria = new MenuTemperatura();
	                
	                
	                setVisible(false);
	                
	                
	                ventanaSecundaria.setVisible(true);
	                
					
					ventanaSecundaria.setLocationRelativeTo(null);
				}
				else {
					
					OpcionInvalida ventanaSecundaria = new OpcionInvalida();
	                
	                
	                setVisible(false);
	                
	               
	                ventanaSecundaria.setVisible(true);
	                
					
					ventanaSecundaria.setLocationRelativeTo(null);
				}*/
			}
		});
		btnOpcionElegida.setBounds(137, 108, 89, 23);
		contentPane.add(btnOpcionElegida);
	}
}
