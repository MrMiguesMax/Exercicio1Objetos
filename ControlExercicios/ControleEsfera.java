package ControlExercicios;

import java.util.Scanner;

import Principal.Esfera;

public class ControleEsfera {

	public static void main(String[] args) {
		float raio, calcA, calcV;
		Esfera ler = new Esfera();
		
		Scanner lerdados = new Scanner (System.in);
		
		System.out.println("Informe o raio da esfera: ");
		raio = lerdados.nextFloat();
		calcA = ler.getArea(raio);
		System.out.println("A area da esfera e de " + calcA);
		calcV = ler.getVolume(raio);
		System.out.println("O volume da esfera e de " + calcV);
		
		lerdados.close();
	}

}