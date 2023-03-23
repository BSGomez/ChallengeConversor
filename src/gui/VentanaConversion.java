package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConversion extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	private JTextField textField;
	JButton btnNewButton, btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConversion frame = new VentanaConversion();
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
	public VentanaConversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setComponentes();
		
		setLocationRelativeTo(null);
		setTitle("Conversor");
		setResizable(false);
		
	
		
	}

	private void setComponentes() {
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(24, 29, 46, 14);
		panelPrincipal.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 26, 86, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.setBounds(50, 71, 89, 23);
		btnNewButton.addActionListener(this);
		panelPrincipal.add(btnNewButton);
		
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(50, 104, 89, 23);
		btnNewButton_1.addActionListener(this);
		panelPrincipal.add(btnNewButton_1);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnNewButton == e.getSource() ) {
			int num1 = Integer.parseInt(textField.getText());
			JOptionPane.showMessageDialog(null, num1);
		}
		
		
		
	}
}
