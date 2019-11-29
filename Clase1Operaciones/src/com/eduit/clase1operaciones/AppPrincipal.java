package com.eduit.clase1operaciones;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Instanciamos un objeto de tipo calculadora

		Calculadora c1 = new Calculadora();

		c1.numero1 = 5;
		c1.numero2 = 5;
		c1.multiplicar();
		c1.mostrarResultado();

		// c1.mostrarResultado();

		//
		//
		// c1.mostrarMensajeDeError("soy un mensaje de error proveniente del
		// main");
		// c1.metodoBobo();

		// System.out.println("Ingrese el numero 1");
		// float numero1IngresadoPorTeclado = teclado.nextFloat();
		//
		// System.out.println("Ingrese el numero 2");
		// float numero2IngresadoPorTeclado = teclado.nextFloat();
		//
		// c1.dividir(numero1IngresadoPorTeclado, numero2IngresadoPorTeclado);
		// c1.mostrarResultado();

	}
}
