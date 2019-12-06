package com.educacionit.relaciones;

public class Auto {

	private int anio;
	private String modelo;
	private String marca;
	private Motor motor;

	public Auto(int anio, String modelo, String marca) {

		this.anio = anio;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Auto [anio=" + anio + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + "]";
	}

}
