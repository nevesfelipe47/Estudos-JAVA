package exercicios_basicos;

import java.util.Scanner;

public class reajusteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double sal, resultado,porcentagem, valor;
		
		
		System.out.println("Digite o valor do Salario que será reajustado: ");
		sal = entrada.nextDouble();
		
		System.out.println("Digite a porcentagem de reajuste: ");
		porcentagem = entrada.nextDouble();
		
		
		valor= sal *porcentagem/100;
		
		System.out.println("Valor do reajuste=R$ "+valor);
		
		resultado = sal + valor;
		
		System.out.println("Novo Salario é de=R$ "+resultado);
		
		
	}

}
