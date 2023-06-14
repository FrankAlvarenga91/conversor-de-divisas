package alura.challenge.volumen.modelo;

import javax.swing.JOptionPane;

public class GalonesEEUU extends UnidadesDeVolumen implements GestorDeVolumen{

	@Override
	public void convertirMililitros() {
		
	}
	//Metodo que convierte de Litros a Galones 
	@Override
	public void convertirLitros() {
		
		double resultadoEnGalones = (GestorDeVolumen.validarValor()/3.785);
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadoEnGalones + " gal(EEUU)",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}
	
	//Metodo que convierte de MetrosCubicos a Galones
	@Override
	public void convertirMetrosCubicos() {
		
		double resultadoEnGalones = GestorDeVolumen.validarValor()*264.2;
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadoEnGalones + " gal(EEUU)",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}

	@Override
	public void convertirGalones() {
		
	}

}
