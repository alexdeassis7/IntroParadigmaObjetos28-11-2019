package com.educacionit.clase2encapsulamieto;

public class Casa {
	// DEFINIMOS ATRIBUTOS
	private String direccion;
	private int numCuartos;
	private float metrosCuadrados;
	private boolean patio;
	private int pisos;
	private short numDeBanios;
	private boolean garage;

	public void setNumCuartos(int numCuartos) {

		if (numCuartos > 0) {
			this.numCuartos = numCuartos;
			System.out.println("Se Logro Setear el numero de cuartos");
		} else {
			System.out.println("ERROR: NO puede tener un numero de cuartos negativo");
		}

	}

//	public int getNumCuartos() {
//
//		return numCuartos;
//	}

	public Casa(String direccion, int numCuartos, float metrosCuadrados, boolean patio, int pisos, boolean garage) {

		this.direccion = direccion;
		this.numCuartos = numCuartos;
		this.metrosCuadrados = metrosCuadrados;
		this.patio = patio;
		this.pisos = pisos;
		this.numDeBanios = numDeBanios;
		this.garage = garage;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public boolean isPatio() {
		return patio;
	}

	public void setPatio(boolean patio) {
		this.patio = patio;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public short getNumDeBanios() {
		return numDeBanios;
	}

	public void setNumDeBanios(short numDeBanios) {
		this.numDeBanios = numDeBanios;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public int getNumCuartos() {
		return numCuartos;
	}
	
	

}
