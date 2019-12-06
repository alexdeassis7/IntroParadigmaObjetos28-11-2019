package com.educacionit.relaciones;

public class Motor {

	private float cilindrada;
	private float caballosDeFuerza;
	private String fabricante;

	public Motor() {

	}

	public Motor(float cilindrada, float caballosDeFuerza, String fabricante) {

		this.cilindrada = cilindrada;
		this.caballosDeFuerza = caballosDeFuerza;
		this.fabricante = fabricante;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public float getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(float caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", caballosDeFuerza=" + caballosDeFuerza + ", fabricante="
				+ fabricante + "]";
	}

}
