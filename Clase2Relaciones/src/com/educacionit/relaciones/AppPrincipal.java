package com.educacionit.relaciones;

public class AppPrincipal {

	public static void main(String[] args) {

		Auto a1 = new Auto(2009, "207", "peugeot");
		Motor m1 = new Motor( 1.6f , 500 , "peugeot");
		
		System.out.println(a1.toString());
		a1.setMotor(m1);
		

		System.out.println(a1.toString());
		
		
		

	}

}
