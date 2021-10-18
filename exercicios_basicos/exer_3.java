package exercicios_basicos;

import java.util.Scanner;

public class exer_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int A,B,C,D, diferenca;
		
		System.out.println("Digite o Valor de A= ");
		A = entrada.nextInt();

		System.out.println("Digite o Valor de B= ");
		B = entrada.nextInt();

		System.out.println("Digite o Valor de C= ");
		C = entrada.nextInt();

		System.out.println("Digite o Valor de D= ");
		D = entrada.nextInt();
		
		diferenca = (A*B-C*D);
		

		System.out.println("A diferença dos valores= "+diferenca);

		

	}

}
