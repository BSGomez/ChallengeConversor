package AplicationP;

import gui.VentanaConversion;

public class Aplication {

	public Aplication() {
		presentarVentana();
	}

	private void presentarVentana() {
		VentanaConversion miVentana = new VentanaConversion();
		miVentana.setVisible(true);
	}
}
