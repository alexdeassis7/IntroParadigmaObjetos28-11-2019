package com.eduit.demo;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	// ATRIBUTOS!

	public void jugarPartido() {
		System.out.println("estoy jugando un partido ");
	}

	public Futbolista(int id, String nombre, String apellido, int edad,
			int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public void Entrenar() {
		System.out.println("estoy entrenando para el partido ");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void metodo1() {
		
		
	}

}
