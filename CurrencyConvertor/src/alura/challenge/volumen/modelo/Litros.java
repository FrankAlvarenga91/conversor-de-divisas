package alura.challenge.volumen.modelo;

import javax.swing.JOptionPane;

public class Litros extends UnidadesDeVolumen implements GestorDeVolumen {
	
	//Metodo que convierte de Mililtros a Litros 
	@Override
	public void convertirMililitros() {
		double resultadoEnLitros = (GestorDeVolumen.validarValor()/1000);
		JOptionPane.showInternalMessageDialog(null,
				"El el resultado es: " + resultadoEnLitros + " L",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}
	
	@Override
	public void convertirLitros() {
		
	}
	
	//Metodo que convierte MetrosCubicos a Litros
	@Override
	public void convertirMetrosCubicos() {
		
		double resultadOEnLitros = GestorDeVolumen.validarValor()*1000;
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadOEnLitros + " L",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}
	
	//Metodo que convierte de Galones a Litros
	@Override
	public void convertirGalones() {
		
		double resultadoEnLitros = GestorDeVolumen.validarValor()*3.785;
		JOptionPane.showInternalMessageDialog(null,
				"El el resultado es: " + resultadoEnLitros+ " L",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}
	

}
