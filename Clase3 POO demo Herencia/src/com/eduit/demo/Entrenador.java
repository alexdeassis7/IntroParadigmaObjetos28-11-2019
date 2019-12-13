package com.eduit.demo;

public abstract class Entrenador extends SeleccionFutbol{

	// ATRIBUTOS!
	private int idFederacion;

	
	public Entrenador(int id, String nombre, String apellido, int edad,
			int idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	

	public void dirigirPartido() {
		System.out.println("estoy digiendo el partido ");
	}

	public void dirigirentrenamieto() {
		System.out.println("estoy digiendo el entrenamieto");
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	
	
	

}
