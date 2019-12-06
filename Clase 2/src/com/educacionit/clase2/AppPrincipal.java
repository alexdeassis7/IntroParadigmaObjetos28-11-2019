package com.educacionit.clase2;

import javax.swing.JOptionPane;

public class AppPrincipal {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();

		int numero1Ingresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		int numero2Ingresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

		float resultado = Calculadora.sumar(numero1Ingresado, numero2Ingresado);

		float resultadoResta = c1.restar(numero1Ingresado, numero2Ingresado);

		JOptionPane.showMessageDialog(null, "El resultado SUMA es : " + resultado);

		JOptionPane.showMessageDialog(null, "El resultado RESTA es : " + resultadoResta);

		// Auto a1 = new Auto("Audi", "ADB 098", 2006);
		// Auto a2 = new Auto("BMW", "ADB 098", 2006);
		// Auto a3 = new Auto("Mercedez", "ADB 098", 2006);
		//
		// System.out.println("AUDI");
		// System.out.println("acelerar(int):" + a1.acelerar(10));
		// System.out.println("acelerar(int, boolean):" + a1.acelerar(10,
		// true));
		// System.out.println("acelerar()" + a1.acelerar());
		//
		// System.out.println("BMW");
		// System.out.println("acelerar(int):" + a2.acelerar(120));
		// System.out.println("acelerar(int, boolean):" + a2.acelerar(10,
		// true));
		// System.out.println("acelerar()" + a2.acelerar());
		//
		// System.out.println("MERCEDEZ");
		// System.out.println("acelerar(int):" + a3.acelerar(10));
		// System.out.println("acelerar(int, boolean):" + a3.acelerar(20,
		// true));
		// System.out.println("acelerar()" + a3.acelerar());
		//
		//
		//
		//
		// Auto a2 = new Auto("Audi", "ADB 098", 2006);
		// Auto a3 = new Auto("Alfa Romeo", "EET 455", 2008);
		// Auto a4 = new Auto(23, "peugeot", "ADR 123", "verde", 2015, 155555,
		// 2015, 120, 10);
		//
		// System.out.println("***********A1*************");
		// System.out.println(a1.mostrarEstadoDeAtributos());
		//
		// System.out.println("***********A2*************");
		// System.out.println(a2.mostrarEstadoDeAtributos());
		//
		// System.out.println("***********A3*************");
		// System.out.println(a3.mostrarEstadoDeAtributos());
		//
		// System.out.println("***********A4*************");
		// System.out.println(a4.mostrarEstadoDeAtributos2());

	}
}
