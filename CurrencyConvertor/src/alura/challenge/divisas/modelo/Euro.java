package alura.challenge.divisas.modelo;

import javax.swing.JOptionPane;

public class Euro extends Moneda{
	
	GestorDeConversion gestor = new GestorDeConversion();
	
	@Override
	public void convertirValor() {
		
		double resultadoConversion = gestor.validarValor() * 0.9215;
			JOptionPane.showInternalMessageDialog(null,
										"El monto en Euros es: " + "EUR "+resultadoConversion ,
										"Resultado",
										JOptionPane.DEFAULT_OPTION);
		
	}

	@Override
	public void conversionInversa() {
		double resultadoConversion = gestor.validarValor() * 1.0744;
		JOptionPane.showInternalMessageDialog(null,
									"El equivalente son " + "USD "+resultadoConversion ,
									"Resultado",
									JOptionPane.DEFAULT_OPTION);
		
	}

}
