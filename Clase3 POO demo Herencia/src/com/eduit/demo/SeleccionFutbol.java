package com.eduit.demo;

public abstract class SeleccionFutbol {
	// ATRIBUTOS DE CLASE PADRE
	private int id;
	private String nombre;
	private String apellido;
	private int edad;

	public abstract void metodo1();
	
	
	
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// METODO DE LA CLASE padre
	public void concentrarce() {
		System.out.println("estoy concentrando soy objeto Selecion ");
	}

	public void viajar() {
		System.out.println("estoy por viajar soy objeto Selecion");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
