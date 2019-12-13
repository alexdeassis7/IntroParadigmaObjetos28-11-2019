package com.eduit.demo;

public class Test {

	public static void main(String[] args) {

		Futbolista f1 = new Futbolista(11, "lionel", "messis", 34, 10,
				"DELANTERO");

		// Entrenador e1 = new Entrenador(44, "miguel angel", "Russo", 59,
		// 2222221);

		Masajista m1 = new Masajista(33, "ramon", "perez", 25, 4,
				"masajista anal!");

		System.out.println("FUTBOLISTA \n" + f1.toString());
		f1.Entrenar();
		f1.jugarPartido();
		f1.Entrenar();
		f1.concentrarce();
		f1.viajar();

		// System.out.println("ENTRENADOR \n" + e1.toString());

		// e1.concentrarce();
		// e1.viajar();
		// e1.dirigirentrenamieto();
		// e1.dirigirPartido();

		System.out.println("MASAJISTA \n" + m1.toString());

		m1.concentrarce();
		m1.viajar();
		m1.darMasaje();

	}
}
