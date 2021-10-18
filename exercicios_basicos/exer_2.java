package exercicios_basicos;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double area,raio, pi;
		
		pi= 3.14159;
		
		System.out.println("Digite o valor do Raio:  ");
		raio = entrada.nextDouble();
		
		area = (double) pi * Math.pow(raio, 2.0);
		
		System.out.println("Area= "+area);
		
		

	}

}
