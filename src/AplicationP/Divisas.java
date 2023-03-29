package aplicationP;

import javax.swing.JOptionPane;

public class Divisas {
	
	public Divisas(double monto) throws NumberFormatException {
		
		String opcion = (String) (JOptionPane.showInputDialog(null, "Moneda a la que convertirá el monto ingresado", "Menu de Divisas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Quetzal a Dolar", "Dolar a Quetzal", "Quetzal a Euro", "Euro a Quetzal","Quetzal a Libras", "Libra a Quetzal", "Quetzal a Yen", "Yen a Quetzal", "Quetzal a MXN. Peso", "MXN. Peso a Quetzal"}, "Divisa"));
		
		if (opcion == null) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			System.exit(0);
		}else {
			try {
				
				
				switch (opcion) {
				
				case "Quetzal a Dolar": {
					quetzalDolar(monto);
					break;
				}
				
				case "Dolar a Quetzal": {
					dolarQuetzal(monto);
					break;
				}
				
				case "Quetzal a Euro":{
					quetzalEuro(monto);
					break;
				}
				
				case "Euro a Quetzal":{
					euroQuetzal(monto);
					break;
				}
				
				case "Quetzal a Libra":{
					quetzalLibra(monto);
					break;
				}
				
				case "Libra a Quetzal":{
					libraQuetzal(monto);
					break;
				}
				
				case "Quetzal a Yen":{
					quetzalYenes(monto);
					break;
				}
				
				case "Yen a Quetzal":{
					yenesQuetzal(monto);
					break;
				}
				
				case "Quetzal a MXN. Peso":{
					quetzalMxnPeso(monto);
					break;
				}
				
				case "MXN. Peso a Quetzal":{
					mxnPesoQuetzal(monto);
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
	
	

	public void quetzalDolar(double monto) {
		double montoDolar = monto * 0.13;
		montoDolar = (double) Math.round(montoDolar *100d)/100; 
		JOptionPane.showMessageDialog(null,"Su total es de $." + montoDolar);
	}
	
	public void dolarQuetzal(double monto) {
		double montoQetzal = monto * 7.81;
		montoQetzal = (double) Math.round(montoQetzal *100d)/100; 
		JOptionPane.showMessageDialog(null,"Su total es de Q." + montoQetzal);
	}
	
	public void quetzalEuro(double monto) {
		double montoEuro = monto * 0.12;
		montoEuro = (double) Math.round(montoEuro *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es €." + montoEuro);
	}
	
	public void euroQuetzal(double monto) {
		double montoQetzal = monto * 8.42;
		montoQetzal = (double) Math.round(montoQetzal *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es Q." + montoQetzal);
	}
	
	public void quetzalLibra(double monto) {
		double montoLibra = monto * 0.105775;
		montoLibra = (double) Math.round(montoLibra *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es £." + montoLibra);
	}
	
	public void libraQuetzal(double monto) {
		double montoQetzal = monto * 9.55;
		montoQetzal = (double) Math.round(montoQetzal *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es Q." + montoQetzal);
	}
	
	public void quetzalYenes(double monto) {
		double montoYen = monto * 16.75;
		montoYen = (double) Math.round(montoYen *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es ¥." + montoYen);
	}
	
	public void yenesQuetzal(double monto) {
		double montoQetzal = monto * 0.060;
		montoQetzal = (double) Math.round(montoQetzal *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es Q." + montoQetzal);
	}
	
	public void quetzalMxnPeso(double monto) {
		double montoMxnpeso = monto * 2.36;
		montoMxnpeso = (double) Math.round(montoMxnpeso *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es Mex$." + montoMxnpeso);
	}
	
	public void mxnPesoQuetzal(double monto) {
		double montoQetzal = monto * 0.42;
		montoQetzal = (double) Math.round(montoQetzal *100d)/100;
		JOptionPane.showMessageDialog(null,"Su total es Q." + montoQetzal);
	}
	
}
