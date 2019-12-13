package com.eduit.calse3;

public class ClienteIndividuo {

	private String dni;
	private CajaDeAhorro cuenta = new CajaDeAhorro();

	// Constructores
	ClienteIndividuo(String d) {
		dni = d;
	}

	public CajaDeAhorro obtenerCajaDeAhorro() {
		return cuenta;
	}

	public String toString() {
		return "ClienteIndividuo [dni=" + dni + ", cuenta=" + cuenta + "]";
	}
	
	
	

}
