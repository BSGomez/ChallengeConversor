package aplicationP;

import javax.swing.JOptionPane;

public class Temperatura {
	
	public Temperatura(double valor) throws NumberFormatException {
		
		String opcion = (String) (JOptionPane.showInputDialog(null, "Moneda a la que convertirá el monto ingresado", "Menu de Temperaturas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Fahrenheit a Rankine", "Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankine", "Kelvin a Fahrenheit", "Kelvin a Celsius", "Kelvin a Rankine", "Rankine a Fahrenheit", "Rankine a Celsius", "Rankine a Kelvin"}, "Temperaturas"));
		
		if (opcion == null) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			System.exit(0);
		}else {
			try {
				
				
				switch (opcion) {
				
				case "Fahrenheit a Celsius": {
					fahrenheitCelsius(valor);
					break;
				}
				
				case "Fahrenheit a Kelvin": {
					fahrenheitKelvin(valor);
					break;
				}
				
				case "Fahrenheit a Rankine": {
					fahrenheitRankine(valor);
					break;
				}
				
				case "Celsius a Fahrenheit":{
					celsiusFahrenheit(valor);
					break;
				}
				
				case "Celsius a Kelvin":{
					celsiusKelvin(valor);
					break;
				}
				
				case "Celsius a Rankine":{
					celsiusRankine(valor);
					break;
				}
				
				case "Kelvin a Fahrenheit":{
					kelvinFahrenheit(valor);
					break;
				}
				
				case "Kelvin a Celsius":{
					kelvinCelsius(valor);
					break;
				}
				
				case "Kelvin a Rankine":{
					kelvinRankine(valor);
					break;
				}
				
				case "Rankine a Fahrenheit":{
					rankineFahrenheit(valor);
					break;
				}
				
				case "Rankine a Celsius":{
					rankineCelsius(valor);
					break;
				}
				
				case "Rankine a Kelvin":{
					rankineKelvin(valor);
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
				}
				}catch (IllegalArgumentException  e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					}
		}
		
		
	}
	
	public void fahrenheitCelsius(double valor) {
		double valorFc = (valor - 32)* 5/9;
		valorFc = (double) Math.round(valorFc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °C es: " + valorFc);
	}
	
	public void fahrenheitKelvin(double valor) {
		double valorFk = (valor - 32) * 5/9 + 273.15;
		valorFk = (double) Math.round(valorFk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °K es: " + valorFk);
	}
	
	public void fahrenheitRankine(double valor) {
		double valorFr = valor + 459.67;
		valorFr = (double) Math.round(valorFr *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °R es: " + valorFr);
	}
	
	public void celsiusFahrenheit(double valor) {
		double valorCf = (valor * 9/5)+ 32;
		valorCf = (double) Math.round(valorCf *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °F es: " + valorCf);
	}
	
	public void celsiusKelvin(double valor) {
		double valorCk = valor + 273.15;
		valorCk = (double) Math.round(valorCk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °K es: " + valorCk);
	}
	
	public void celsiusRankine(double valor) {
		double valorCr = valor * 9/5 + 491.67;
		valorCr = (double) Math.round(valorCr *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °R es: " + valorCr);
	}
	
	public void kelvinCelsius(double valor) {
		double valorKc = valor - 273.15;
		valorKc = (double) Math.round(valorKc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °C es: " + valorKc);
	}
	
	public void kelvinFahrenheit(double valor) {
		double valorKf = (valor - 273.15)* 9/5 +32;
		valorKf = (double) Math.round(valorKf *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °F es: " + valorKf);
	}
	
	public void kelvinRankine(double valor) {
		double valorKr = valor * 1.8;
		valorKr = (double) Math.round(valorKr *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °R es: " + valorKr);
	}
	
	public void rankineFahrenheit(double valor) {
		double valorRf = valor-459.67;
		valorRf = (double) Math.round(valorRf *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °F es: " + valorRf);
	}
	
	public void rankineCelsius(double valor) {
		double valorRc = (valor - 491.67)* 5/9;
		valorRc = (double) Math.round(valorRc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °C es: " + valorRc);
	}
	
	public void rankineKelvin(double valor) {
		double valorRk = (valor * 5/9);
		valorRk = (double) Math.round(valorRk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en °K es: " + valorRk);
	}
	
}
