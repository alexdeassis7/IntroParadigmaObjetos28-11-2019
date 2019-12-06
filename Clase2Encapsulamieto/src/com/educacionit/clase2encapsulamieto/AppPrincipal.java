package com.educacionit.clase2encapsulamieto;

public class AppPrincipal {

	public static void main(String[] args) {

		Casa c1 = new Casa("Av Santa Fe 5007", 2, 35, true, 1, false);

		// SIN ENCAPSULAMIEMTO
		// c1.direccion = "5555555555555555";
		// c1.metrosCuadrados = -56;
		// c1.numCuartos = -568;ç

		// CON ENCAPSULAMIEMTO

		System.out.println("NUM DE CUARTOS : " + c1.getNumCuartos());
		c1.setNumCuartos(5);

		System.out.println("POST SETTERS NUM DE CUARTOS : " + c1.getNumCuartos());
	}
}
