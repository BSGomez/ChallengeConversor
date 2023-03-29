package aplicationP;

import javax.swing.JOptionPane;

public class Longitud {
	
	public Longitud(double valor) {
		
String opcion = (String) (JOptionPane.showInputDialog(null, "Longitud a la que convertirá el valor ingresado", "Menu de Temperaturas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Centimetro a Apulgada", "Centimetro a Pie", "Centimetro a Metro", "Centimetro a Kilometro", "Pulgada a Centimetro", "Pulgada a Pie", "Pulgada a Metro", "Pulgada a Kilometro", "Pie a Centimetro", "Pie a Pulgada", "Pie a Metro", "Pie a Kilometro", "Metro a Centimetro", "Metro a Pulgada", "Metro a pie", "Metro a Kilometro", "Kilometro a Centimetro", "Kilometro a Pulgada", "Kilometro a Pie", "Kilometro a metro"}, "Longitudes"));
		
		if (opcion == null) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			System.exit(0);
		}else {
			try {
				
				
				switch (opcion) {
				
				case "Centimetro a Pulgada": {
					centimetroPulgada(valor);
					break;
				}
				
				case "Centimetro a Pie": {
					centimetroPie(valor);
					break;
				}
				
				case "Centimetro a Metro": {
					centimetroMetro(valor);
					break;
				}
				
				case "Centimetro a Kilometro":{
					centimetroKilometro(valor);
					break;
				}
				
				case "Pulgada a Centimetro":{
					pulgadaCentimetro(valor);
					break;
				}
				
				case "Pulgada a Pie":{
					pulgadaPie(valor);
					break;
				}
				
				case "Pulgada a Metro":{
					pulgadaMetro(valor);
					break;
				}
				
				case "Pulgada a Kilometro":{
					pulgadaKilometro(valor);
					break;
				}
				
				case "Metro a Centimetro":{
					metroCentimetro(valor);
					break;
				}
				
				case "Metro a Pulgada":{
					metroPulgada(valor);
					break;
				}
				
				case "Metro a Pie":{
					metroPie(valor);
					break;
				}
				
				case "Kilometro a Centimetro":{
					kilometroCentimetro(valor);
					break;
				}
				
				case "Kilometro a Pulgada":{
					kilometroPulgada(valor);
					break;
				}
				
				case "Kilometro a Pie":{
					kilometroPie(valor);
					break;
				}
				
				case "Kilometro a Metro":{
					kilometroMetro(valor);
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
	
	
	public void centimetroPulgada(double valor) {
		double valorCp = valor * 0.393701;
		valorCp = (double) Math.round(valorCp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pulgadas es: " + valorCp);
	}
	
	public void centimetroPie(double valor) {
		double valorCp = valor * 0.393701;
		valorCp = (double) Math.round(valorCp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pies es: " + valorCp);
	}
	
	public void centimetroMetro(double valor) {
		double valorCm = valor * 0.01;
		valorCm = (double) Math.round(valorCm *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Metros es: " + valorCm);
	}
	
	public void centimetroKilometro(double valor) {
		double valorCk = valor / 100000;
		valorCk = (double) Math.round(valorCk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Kilometros es: " + valorCk);
	}
	
	public void pulgadaCentimetro(double valor) {
		double valorPc = valor * 2.54;
		valorPc = (double) Math.round(valorPc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Centimetros es: " + valorPc);
	}
	
	public void pulgadaPie(double valor) {
		double valorPp = valor * 0.0833333;
		valorPp = (double) Math.round(valorPp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pies es: " + valorPp);
	}
	
	public void pulgadaMetro(double valor) {
		double valorPm = valor * 0.0254;
		valorPm = (double) Math.round(valorPm *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Metros es: " + valorPm);
	}
	
	public void pulgadaKilometro(double valor) {
		double valorPk = valor / 39370;
		valorPk = (double) Math.round(valorPk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Kilometros es: " + valorPk);
	}
	
	public void pieCentimetro(double valor) {
		double valorPc = valor * 30.48;
		valorPc = (double) Math.round(valorPc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Centimetros es: " + valorPc);
	}
	
	public void piePulgada(double valor) {
		double valorPp = valor * 12;
		valorPp = (double) Math.round(valorPp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pulgadas es: " + valorPp);
	}
	
	public void pieMetro(double valor) {
		double valorPm = valor * 0.3048;
		valorPm = (double) Math.round(valorPm *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Metros es: " + valorPm);
	}
	
	public void pieKilometro(double valor) {
		double valorPk = valor * 0.0003048;
		valorPk = (double) Math.round(valorPk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Kilometros es: " + valorPk);
	}
	
	public void metroCentimetro(double valor) {
		double valorMc = valor * 100;
		valorMc = (double) Math.round(valorMc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Centimetros es: " + valorMc);
	}
	
	public void metroPulgada(double valor) {
		double valorMc = valor * 39.3701;
		valorMc = (double) Math.round(valorMc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pulgadas es: " + valorMc);
	}
	
	public void metroPie(double valor) {
		double valorMc = valor * 3.28084;
		valorMc = (double) Math.round(valorMc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pies es: " + valorMc);
	}
	
	public void metroKilometro(double valor) {
		double valorMk = valor * 0.001;
		valorMk = (double) Math.round(valorMk *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Kilometros es: " + valorMk);
	}
	
	public void kilometroCentimetro(double valor) {
		double valorKc = valor * 100000;
		valorKc = (double) Math.round(valorKc *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Centimetros es: " + valorKc);
	}
	
	public void kilometroPulgada(double valor) {
		double valorKp = valor * 39370.1;
		valorKp = (double) Math.round(valorKp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pulgadas es: " + valorKp);
	}
	
	public void kilometroMetro(double valor) {
		double valorKm = valor * 1000;
		valorKm = (double) Math.round(valorKm *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Metros es: " + valorKm);
	}
	
	public void kilometroPie(double valor) {
		double valorKp = valor * 3280.84;
		valorKp = (double) Math.round(valorKp *100d)/100;
		JOptionPane.showMessageDialog(null, "La cantidad en Pies es: " + valorKp);
	}
	
}
