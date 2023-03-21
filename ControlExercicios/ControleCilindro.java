package ControlExercicios;

import java.util.Scanner;

import Principal.Cilindro;

public class ControleCilindro {

	public static void main(String[] args) {
		float raio, altura, calc1, calc2;
		Cilindro ler = new Cilindro();
		
		Scanner lerdados = new Scanner (System.in);
		
		System.out.println("Informe o raio do cilindro: ");
		raio = lerdados.nextFloat();
		System.out.println("Informe a altura do cilindro: ");
		altura = lerdados.nextFloat();
		calc1 = ler.getArea(raio, altura);
		System.out.println("A area do cilindro e de " + calc1);
		calc2 = ler.getVolume(raio, altura);
		System.out.println("O volume do cilindro e de " + calc2);
		
		lerdados.close();
	}

}
