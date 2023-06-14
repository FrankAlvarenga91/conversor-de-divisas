package alura.challenge.divisas.modelo;

import javax.swing.JOptionPane;

public class LibrasEsterlinas extends Moneda {
	
	GestorDeConversion gestor = new GestorDeConversion();

	@Override
	public void convertirValor() {
		
			double resultadoConversion = gestor.validarValor() * 0.8032;
			JOptionPane.showInternalMessageDialog(null,
											"El monto en Libras Esterlinas es: " + "GBP "+resultadoConversion,
											"Resultado",
											JOptionPane.DEFAULT_OPTION);
		}

	@Override
	public void conversionInversa() {
		double resultadoConversion = gestor.validarValor() * 1.2498;
				JOptionPane.showInternalMessageDialog(null,
											"El monto en Dolares es : " + "USD "+resultadoConversion,
											"Resultado",
											JOptionPane.DEFAULT_OPTION);
		
	}
	

}
