package aplicationP;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws NumberFormatException {
		
		ValidarMonto valor = new ValidarMonto();
		
		
		
		boolean continua = true;
		while (continua) {
			
			String opciones = (String) (JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitud"}, "Opcion"));
			if (opciones == null) {
				JOptionPane.showMessageDialog(null, "Programa Terminado");
				System.exit(0);
			}
			try {
				
			
			switch (opciones) {
			case "Conversor de Moneda": {
				
				
				String input = JOptionPane.showInputDialog("Ingrese el monto a convertir");
				
				if (input == null ) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
					
				}else if (valor.valorExepcion(input)) {
					double input2 = Double.parseDouble(input);
					new Divisas(input2);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Continúa");
					}else {
						continua = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
					
				}
				
				break;
			}
			
			case "Conversor de Temperatura":{
				
				String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
				if (valor.valorExepcion(input)) {
					double input2 = Double.parseDouble(input);
					new Temperatura(input2);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Continúa");
					}else {
						continua = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
					
					
					
					
				}
				
				break;
				
			}
			
			case "Conversor de Longitud":{
				String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
				if (valor.valorExepcion(input)) {
					double input2 = Double.parseDouble(input);
					new Longitud(input2);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Continúa");
					}else {
						continua = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
					
					
					
					
				}
				
				break;
			}
			
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opciones);
			}
			} catch (IllegalArgumentException  e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
	}

}
