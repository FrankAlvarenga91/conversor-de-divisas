package alura.challenge.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import alura.challenge.volumen.modelo.GalonesEEUU;
import alura.challenge.volumen.modelo.Litros;
import alura.challenge.volumen.modelo.MetrosCubicos;
import alura.challenge.volumen.modelo.Mililitros;

public class ConversorDeVolumen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ConversorDeVolumen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonMenu = new JButton("Menú Principal");
		botonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mn = new MenuPrincipal();
				mn.setVisible(true);
				dispose();
			}
		});
		botonMenu.setBounds(49, 104, 124, 23);
		contentPane.add(botonMenu);
		
		JLabel lblqueTipoDe = new JLabel("¿Que tipo de conversión desea realizar?");
		lblqueTipoDe.setForeground(new Color(0, 128, 255));
		lblqueTipoDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblqueTipoDe.setBounds(37, 22, 269, 23);
		contentPane.add(lblqueTipoDe);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(69, 59, 211, 22);
		comboBox.addItem("De Litros a Mililitros");
		comboBox.addItem("De Litros a Metros Cubicos");
		comboBox.addItem("De Litros a Galones(EEUU)");
		comboBox.addItem("De Galones(EEUU) a Litros");
		comboBox.addItem("De Metros Cubicos a Litros");
		comboBox.addItem("De Mililitros a Litros");
		comboBox.addItem("De Metros Cubicos a Galones(EEUU)");
		comboBox.addItem("De Galones(EEUU) a Metros Cubicos");
		contentPane.add(comboBox);
		
		JLabel firma = new JLabel("Conversor De Volumen");
		firma.setForeground(new Color(0, 128, 255));
		firma.setFont(new Font("Tahoma", Font.ITALIC, 11));
		firma.setBounds(196, 108, 114, 15);
		contentPane.add(firma);
		
		JLabel lblNewLabel = new JLabel("By Frank Alvarenga");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setBounds(204, 125, 102, 24);
		contentPane.add(lblNewLabel);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String opcion = (String) comboBox.getSelectedItem();
				switch(opcion) {
					case"De Litros a Mililitros":
						Mililitros mili = new Mililitros();
						mili.convertirLitros();
						break;
					case"De Litros a Metros Cubicos":
						MetrosCubicos metros = new MetrosCubicos();
						metros.convertirLitros();
						break;
					case"De Litros a Galones(EEUU)":
						GalonesEEUU galones = new GalonesEEUU();
						galones.convertirLitros();
						break;
					case"De Galones(EEUU) a Litros":
						Litros litros = new Litros();
						litros.convertirGalones();
						break;
					case"De Metros Cubicos a Litros":
						Litros litros2 = new Litros();
						litros2.convertirMetrosCubicos();
						break;
					case"De Mililitros a Litros":
						Litros lit = new Litros();
						lit.convertirMililitros();
						break;
					case"De Metros Cubicos a Galones(EEUU)":
						GalonesEEUU gal = new GalonesEEUU();
						gal.convertirMetrosCubicos();
						break;
					case"De Galones(EEUU) a Metros Cubicos":
						MetrosCubicos met = new MetrosCubicos();
						met.convertirGalones(); 
						break;
					}
			}
		});
	}
}
