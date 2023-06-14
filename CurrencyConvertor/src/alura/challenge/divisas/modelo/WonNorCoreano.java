package alura.challenge.divisas.modelo;

import javax.swing.JOptionPane;

public class WonNorCoreano extends Moneda {
	
	GestorDeConversion gestor = new GestorDeConversion();
	
	@Override
	public void convertirValor() {
		
			double resultadoConversion = gestor.validarValor() * 135;
			JOptionPane.showInternalMessageDialog(null, 
							"El monto en WonesConreanos es: " + " KPW"+resultadoConversion,
							"Resultado",
							JOptionPane.DEFAULT_OPTION);
		}

	@Override
	public void conversionInversa() {
		
		double resultadoConversion = gestor.validarValor() * 0.0074;
		JOptionPane.showInternalMessageDialog(null, 
						"El monto en Dolares es: " + " USD"+resultadoConversion,
						"Resultado",
						JOptionPane.DEFAULT_OPTION);
		
	}	

}
