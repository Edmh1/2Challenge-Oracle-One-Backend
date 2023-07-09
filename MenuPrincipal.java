package appConversor;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MenuPrincipal extends JFrame {

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
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 274);
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
		
		JLabel lblSeleccioneOpcion = new JLabel("Seleccione una opción de conversión");
		lblSeleccioneOpcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccioneOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneOpcion.setBounds(83, 71, 253, 14);
		contentPane.add(lblSeleccioneOpcion);
		
		JComboBox cboTipoDeConversion = new JComboBox();
		cboTipoDeConversion.setBackground(SystemColor.control);
		cboTipoDeConversion.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Divisa", "Conversor de Unidades"}));
		cboTipoDeConversion.setBounds(119, 96, 176, 22);
		contentPane.add(cboTipoDeConversion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(SystemColor.inactiveCaptionBorder);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int TipoDeConversor = cboTipoDeConversion.getSelectedIndex();
                
				VentanaDivisa ventanaDivisa = new VentanaDivisa();
                VentanaUnidades ventanaUnidades = new VentanaUnidades();
                setVisible(false);
            
				if(TipoDeConversor == 0) {
					ventanaDivisa.setVisible(true);
				}
				else {
					ventanaUnidades.setVisible(true);
				}
			}
		});
		btnAceptar.setBounds(78, 151, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(SystemColor.inactiveCaptionBorder);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(247, 151, 89, 23);
		contentPane.add(btnSalir);
	}
}
