package ControlExercicios;

import java.util.Scanner;

import Principal.Cone;

public class ControleCone {

	public static void main(String[] args) {
			float raio, altura, Geratriz,calc1, calc2;
			Cone ler = new Cone();
			
			Scanner lerdados = new Scanner (System.in);
			
			System.out.println("Informe o raio do Cone: ");
			raio = lerdados.nextFloat();
			System.out.println("Informe a altura do Cone: ");
			altura = lerdados.nextFloat();
			System.out.println("Informe a Geratriz do Cone: ");
			Geratriz = lerdados.nextFloat();
			calc1 = ler.getArea(raio, altura, Geratriz);
			System.out.println("A area do Cone e de " + calc1);
			calc2 = ler.getVolume(raio, altura);
			System.out.println("O volume do Cone e de " + calc2);
			
			lerdados.close();
	}

}
