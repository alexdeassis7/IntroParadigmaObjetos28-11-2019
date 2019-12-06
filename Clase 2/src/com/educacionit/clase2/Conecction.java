package com.educacionit.clase2;

public class Conecction {

	long ip;
	String nombreDB;
	String user;
	String pass;
	int puerto;

	public Conecction(long ip, String nombreDB, String user, String pass, int puerto) {
		this.ip = ip;
		this.nombreDB = nombreDB;
		this.user = user;
		this.pass = pass;
		this.puerto = puerto;
	}

	public Conecction(String name) {
		nombreDB = name;
	}

}
