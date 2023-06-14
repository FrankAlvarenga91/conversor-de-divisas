package alura.challenge.volumen.modelo;

import javax.swing.JOptionPane;

public class MetrosCubicos extends UnidadesDeVolumen implements GestorDeVolumen {
	
	//Metodo que convierte de Litros a MetrosCubicos
	@Override
	public void convertirLitros() {
		
		double resultadoEnMetrosCubicos = (GestorDeVolumen.validarValor()/1000);
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadoEnMetrosCubicos + " m³",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);		
	
	}
	
	//Metodo que convierte de Galones a MetrosCubicos
	@Override
	public void convertirGalones() {
		
		double resultadoEnMetrosCubicos = (GestorDeVolumen.validarValor()/264.2);
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadoEnMetrosCubicos + " m³",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}

	@Override
	public void convertirMililitros() {
		
	}

	@Override
	public void convertirMetrosCubicos() {
		
	}


}
