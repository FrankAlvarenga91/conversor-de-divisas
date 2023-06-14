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

import alura.challenge.divisas.modelo.Euro;
import alura.challenge.divisas.modelo.LibrasEsterlinas;
import alura.challenge.divisas.modelo.WonNorCoreano;
import alura.challenge.divisas.modelo.Yen;

public class ConversorDeDivisas extends JFrame implements ActionListener {
	
	JComboBox<String> combo;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ConversorDeDivisas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btonMenu = new JButton("Menú Principal");
		btonMenu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal ventana1 = new MenuPrincipal();
				ventana1.setVisible(true);
				dispose();
			}
		});
		btonMenu.setBounds(23, 144, 116, 30);
		contentPane.add(btonMenu);
		
		JLabel label = new JLabel("¿Que tipo de conversión desea realizar?");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(23, 30, 271, 30);
		contentPane.add(label);
		
		combo = new JComboBox<String>();
		combo.setBounds(63, 78, 181, 30);
		combo.addItem("------------------------------------");
		combo.addItem("De Dolar a Euros");
		combo.addItem("De Dolar a Libras Esterlinas");
		combo.addItem("De Dolar a Yen Japonés");
		combo.addItem("De Dolar a Won Coreano");
		combo.addItem("De Euros a Dolares");
		combo.addItem("De Libras Esterlinas a Dolares");
		combo.addItem("De Yen Japonés a Dolares");
		combo.addItem("De WonNorcoreano a Dolares");
		contentPane.add(combo);
		
		JLabel firma = new JLabel("Conversor De Divisas");
		firma.setForeground(new Color(0, 128, 255));
		firma.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		firma.setBounds(165, 144, 116, 30);
		contentPane.add(firma);
		
		JLabel firma2 = new JLabel("By Frank Alvarenga");
		firma2.setForeground(new Color(0, 128, 255));
		firma2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		firma2.setBounds(170, 177, 100, 22);
		contentPane.add(firma2);
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String opcion1 = (String) combo.getSelectedItem();
				switch(opcion1) {	
				case "De Dolar a Euros":
					Euro euro = new Euro();
					euro.convertirValor();
					break;
					
				case "De Dolar a Libras Esterlinas":
					LibrasEsterlinas libras = new LibrasEsterlinas();
					libras.convertirValor();
					break;
					
				case "De Dolar a Yen Japonés":
					Yen yen = new Yen();
					yen.convertirValor();
					break;
				
				case "De Dolar a Won Coreano":
					WonNorCoreano won = new WonNorCoreano();
					won.convertirValor();
					break;
					
				case "De Euros a Dolares":	
					Euro euro2 = new Euro();
					euro2.conversionInversa();
					break;
					
				case "De Libras Esterlinas a Dolares":
					LibrasEsterlinas libras2 = new LibrasEsterlinas();
					libras2.conversionInversa();
					break;
					
				case "De Yen Japonés a Dolares":
					Yen yen1 = new Yen();
					yen1.conversionInversa();
					break;
					
				case "De WonNorcoreano a Dolares":
					WonNorCoreano coreano = new WonNorCoreano();
					coreano.conversionInversa();
					break;
					}
				
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
