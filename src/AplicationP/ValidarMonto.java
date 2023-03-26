package AplicationP;

import javax.swing.JOptionPane;

public class ValidarMonto extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean valorExepcion(String valorIngresado) {
		try {
			
			double x = Double.parseDouble(valorIngresado);
			if (x < 0 || x >= 0);
				return true;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Valor no permitido");
			return false;
			
		}
	}
	
}
