package com.eduit.demo;

public class Masajista extends SeleccionFutbol {

	// ATRIBUTOS Clase hija!

	private int aniosExperiencia;
	private String titulacion;

	public Masajista(int id, String nombre, String apellido, int edad,
			int aniosExperiencia, String titulacion) {
		super(id, nombre, apellido, edad);
		this.aniosExperiencia = aniosExperiencia;
		this.titulacion = titulacion;
	}

	

	public void darMasaje() {
		System.out.println("estoy masajeando a un jugador!");

	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

}
