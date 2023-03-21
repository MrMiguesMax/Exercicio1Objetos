package ControlExercicios;

import java.util.Scanner;

import Principal.Quadrado;

public class ControleQuadrado {

	public static void main(String[] args) {
		float MedidaLado, calcA, calcV;
		Quadrado ler = new Quadrado();
		
		Scanner lerdados = new Scanner (System.in);
		
		System.out.println("Informe as medidas dos lados do quadrado: ");
		MedidaLado = lerdados.nextFloat();
		calcA = ler.getArea(MedidaLado);
		System.out.println("A area do quadrado e de " + calcA);
		calcV = ler.getPerimetro(MedidaLado);
		System.out.println("O perimetro do quadrado e de " + calcV);
		lerdados.close();
		
	}
	
}