package com.eduit.calse3;

public class CajaDeAhorro {

	private float saldo;

	// Metodos aquí
	public void depositar(float monto) {
		saldo = saldo + monto;
	}

	public String toString() {
		return "CajaDeAhorro [saldo=" + saldo + "]";
	}
	
	
}
