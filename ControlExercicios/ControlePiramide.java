package ControlExercicios;

import java.util.Scanner;

import Principal.Piramide;

public class ControlePiramide {

	public static void main(String[] args) {
		float calc1, calc2, altura, AreaLado, AreaBase;
		Piramide ler = new Piramide();
		
		Scanner lerdados = new Scanner (System.in);
		
		System.out.println("Informe a area dos lados da Piramide: ");
		AreaLado = lerdados.nextFloat();
		System.out.println("Informe a altura do Piramide: ");
		altura = lerdados.nextFloat();
		System.out.println("Informe a area da base da Piramide: ");
		AreaBase = lerdados.nextFloat();
		calc1 = ler.getArea(AreaBase, altura);
		System.out.println("A area da piramide e de " + calc1);
		calc2 = ler.getVolume(AreaBase, AreaLado);
		System.out.println("O volume da piramide e de " + calc2);
		
		lerdados.close();
	}

}
