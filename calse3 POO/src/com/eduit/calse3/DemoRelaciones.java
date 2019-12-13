package com.eduit.calse3;

public class DemoRelaciones {
	public static void main(String[] args) {
		
		ClienteIndividuo c1 = new ClienteIndividuo("27014589");
		
		System.out.println("c1 a c: "+ c1.toString());
		
		CajaDeAhorro cda = c1.obtenerCajaDeAhorro(); 
		
		cda.depositar(2500);
			

		System.out.println("c1 b c: "+ c1.toString());
		
		System.out.println("CDA : " + cda.toString());
		
		
	
	
	}


}
