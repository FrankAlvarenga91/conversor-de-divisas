package alura.challenge.divisas.modelo;

import javax.swing.JOptionPane;

public class Yen extends Moneda {
	
	GestorDeConversion gestor = new GestorDeConversion();

	@Override
	public void convertirValor() {
		
			double resultadoConversion = gestor.validarValor()* 135719;
			JOptionPane.showInternalMessageDialog(null,
								"El monto en Yenes es: " + "JPY "+resultadoConversion,
								"Resultado",
								JOptionPane.DEFAULT_OPTION);
		}

	@Override
	public void conversionInversa() {
		
		double resultadoConversion = gestor.validarValor()* 0.0072;
		JOptionPane.showInternalMessageDialog(null,
							"El monto en Dolares es: " + " USD"+resultadoConversion,
							"Resultado",
							JOptionPane.DEFAULT_OPTION);
		
	}

}
