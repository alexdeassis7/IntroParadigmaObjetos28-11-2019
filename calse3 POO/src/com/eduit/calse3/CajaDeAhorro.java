package com.eduit.calse3;

public class CajaDeAhorro {

	private float saldo;

	// Metodos aqu�
	public void depositar(float monto) {
		saldo = saldo + monto;
	}

	public String toString() {
		return "CajaDeAhorro [saldo=" + saldo + "]";
	}
	
	
}
