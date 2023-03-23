package AplicationP;

import javax.swing.JOptionPane;

public class Aplicacion1 {

	private double cantidadIngresada;
	private String pais;
	private int tipoCambio;
	private double totalConversion;
	
	public Aplicacion1() {
		// TODO Auto-generated constructor stub
	}
	

	public double getCantidadIngresada() {
		return cantidadIngresada;
	}

	public void setCantidadIngresada(int cantidadIngresada) {
		this.cantidadIngresada = cantidadIngresada;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(int tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public double getTotalConversion() {
		return totalConversion;
	}

	public void setTotalConversion(int totalConversion) {
		this.totalConversion = totalConversion;
	}
	
	//-------
	
	public void convertiCantidad(int cantidadIngresada) {
		
		if (this.cantidadIngresada <= 0) {
			JOptionPane.showMessageDialog(null, "Cantidad debe ser mayor a cero");
		}else {
			this.totalConversion = this.tipoCambio * cantidadIngresada;
		}
		
		
		
		
	}
	
	
}
