package alura.challenge.volumen.modelo;

import javax.swing.JOptionPane;

public class Mililitros extends UnidadesDeVolumen implements GestorDeVolumen {

	@Override
	public void convertirMililitros() {
		
	}
	//Metodo que convierte de Litros a Mililitros
	@Override
	public void convertirLitros() {
		
		double resultadoEnml = GestorDeVolumen.validarValor()*1000;
		JOptionPane.showInternalMessageDialog(null,
				"El resultado es: " + resultadoEnml + " ml",
				"Resultado",
				JOptionPane.DEFAULT_OPTION);
		
	}

	@Override
	public void convertirMetrosCubicos() {
		
	}

	@Override
	public void convertirGalones() {
		
	}

}
