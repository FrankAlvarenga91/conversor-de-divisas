package alura.challenge.divisas.modelo;

import javax.swing.JOptionPane;

public class GestorDeConversion {
	
	public double validarValor() {
		
		double cantidadConvertir=0;
		try {
		while(cantidadConvertir==0 || cantidadConvertir<0) {
			
				try {
					String input = JOptionPane.showInputDialog(
		                    null,
		                    "Ingresa el monto a convertir",
		                    "Conversor",
		                    JOptionPane.PLAIN_MESSAGE);
					
					 cantidadConvertir = Double.parseDouble(input);
					 if(cantidadConvertir<0){
							JOptionPane.showInternalMessageDialog(null, "No ingrese valores negativos");
						}
				}catch(NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Ingrese un valor valido");
				}
			}
		}catch(NullPointerException n) {
			JOptionPane.showInternalMessageDialog(null, "¡Se canceló la conversión!");
		}	
		
		return cantidadConvertir;
		}


}
