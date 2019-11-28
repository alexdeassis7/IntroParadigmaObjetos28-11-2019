package com.eduit.clase1Demo1;

import javax.swing.JOptionPane;

public class AppPrincipal {

	public static void main(String[] args) {
		// punto de inicio de ejecucion de mi app
		// CREAMOS OBJETOS DE LA CLASE PERSONA(Instanciar)

		System.out.println("ARGUMENTO DE ENTRADA DEL MAIN :");

		JOptionPane.showMessageDialog(null, "soy un programa re viejo ");
		Persona nombreObjetoPersona = new Persona();

		System.out.println("estado INICIAL de los atributos");

		System.out.println("nombre : " + nombreObjetoPersona.nombre);

		System.out.println("dni : " + nombreObjetoPersona.dni);

		System.out.println(" genero : " + nombreObjetoPersona.genero);

		System.out.println(" edad : " + nombreObjetoPersona.edad);

		System.out.println(" altura : " + nombreObjetoPersona.altura);

		nombreObjetoPersona.altura = 1.70f;
		nombreObjetoPersona.nombre = "Alex De Assis";
		nombreObjetoPersona.dni = 36863837;
		nombreObjetoPersona.edad = 26;
		nombreObjetoPersona.genero = 'M';

		System.out.println("estado POST SETEO de los atributos");

		System.out.println("nombre : " + nombreObjetoPersona.nombre);

		System.out.println("dni : " + nombreObjetoPersona.dni);

		System.out.println(" genero : " + nombreObjetoPersona.genero);

		System.out.println(" edad : " + nombreObjetoPersona.edad);

		System.out.println(" altura : " + nombreObjetoPersona.altura);

	}

}
