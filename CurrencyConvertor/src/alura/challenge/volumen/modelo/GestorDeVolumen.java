package alura.challenge.volumen.modelo;

import javax.swing.JOptionPane;

public interface GestorDeVolumen {

		public static double validarValor() {
				
				double volumenConvertir=0;
				try {
				while(volumenConvertir==0 || volumenConvertir<0) {
					
						try {
							String input = JOptionPane.showInputDialog(
				                    null,
				                    "Ingresa valor a convertir",
				                    "Conversor",
				                    JOptionPane.PLAIN_MESSAGE);
							
							 volumenConvertir = Double.parseDouble(input);
							 if(volumenConvertir<0){
									JOptionPane.showInternalMessageDialog(null, "No ingrese valores negativos");
								}
						}catch(NumberFormatException e) {
						JOptionPane.showInternalMessageDialog(null, "Ingrese un valor valido");
						}
					}
				}catch(NullPointerException n) {
					JOptionPane.showInternalMessageDialog(null, "¡Se canceló la conversión!");
				}	
				
				return volumenConvertir;
				}

}
