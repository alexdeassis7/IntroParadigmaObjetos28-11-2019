package com.educacionit.clase2;

public class Auto {

	long id;
	String marca;
	String patente;
	String color;
	int modelo;
	long km;
	int anioDeFabricacion;
	int velocidad = 0;
	int nitro = 0;

	public String mostrarEstadoDeAtributos() {

		return "ID :" + id + " marca :" + marca + "Patente:" + patente + "Color:" + color + "Modelo: " + modelo;
	}

	public String mostrarEstadoDeAtributos2() {
		return "Auto [id=" + id + ", marca=" + marca + ", patente=" + patente + ", color=" + color + ", modelo="
				+ modelo + ", km=" + km + ", anioDeFabricacion=" + anioDeFabricacion + ", velocidad=" + velocidad
				+ ", nitro=" + nitro + "]";
	}

	public void acelerar(Float VelocidadDeAceleracion) {
		System.out.println("Estoy acelerando a " + VelocidadDeAceleracion + "Kilometros por Hs");

	}

	public int acelerar() {
		return velocidad = velocidad + 10;

	}

	public int acelerar(int km) {

		return velocidad = velocidad + km;
	}

	public int acelerar(int km, boolean tieneNitro) {

		if (tieneNitro == false) {
			return (acelerar(km));
		} else {
			return (acelerar(km * 2));
		}
	}

	public Auto(String marca, String patente, int modelo) {
		this.marca = marca;
		this.patente = patente;
		this.modelo = modelo;
	}

	public Auto() {

	}

	public Auto(long id, String marca, String patente, String color, int modelo, long km, int anioDeFabricacion,
			int velocidad, int nitro) {

		this.id = id;
		this.marca = marca;
		this.patente = patente;
		this.color = color;
		this.modelo = modelo;
		this.km = km;
		this.anioDeFabricacion = anioDeFabricacion;
		this.velocidad = velocidad;
		this.nitro = nitro;
	}

}
