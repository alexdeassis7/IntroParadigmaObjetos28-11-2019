package com.eduit.clase1operaciones;

public class Calculadora {

	// Atributos
	float numero1 = 0;
	float numero2 = 0;
	float res = 0;

	/**
	 * modificardorDeAcceso ValorDeRetorno Indentificador (ParametrosDeEntrada
	 * tipo idem, tipo2 idem2 ) METODO : PROCEDIMIENTO
	 */
	public void sumar(float n1, float n2) {
		res = n1 + n2;
	}

	public float restar(float numero1, float numero2) {
		res = numero1 - numero2;
		return res;
	}

	public int multiplicar() {

		res = numero1 * numero2;
		return 100;
	}

	public void dividir(float numero1, float numero2) {
		if (numero2 != 0) {
			res = numero1 / numero2;
		} else {
			mostrarMensajeDeError("No es posible dividir por cero en los numero REALES AMEGOOOO!!");
		}

	}

	public void mostrarResultado() {
		System.out.println("RESULTADO : " + res);

	}

	public void mostrarMensajeDeError(String mensajeAMostrar) {
		System.out.println("ERROR : " + mensajeAMostrar);

	}

	public void metodoBobo() {

		mostrarMensajeDeError("SOY EL METODO BOBO ");
	}

}
