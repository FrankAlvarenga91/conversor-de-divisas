package alura.challenge.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione tipo de Conversor");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 11, 202, 44);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcion = (String)comboBox.getSelectedItem();
				switch(opcion){
				case"Conversor de Divisas":
					ConversorDeDivisas conversor = new ConversorDeDivisas();
					conversor.setVisible(true);
					dispose();
					break;
				case"Conversor de Volumen":
					ConversorDeVolumen volumen = new ConversorDeVolumen();
					volumen.setVisible(true);
					dispose();
					break;
				}
			}
		});
		comboBox.addItem("-------------------------------------");
		comboBox.addItem("Conversor de Divisas");
		comboBox.addItem("Conversor de Volumen");
		comboBox.setBounds(68, 66, 181, 44);
		contentPane.add(comboBox);
	}
}
