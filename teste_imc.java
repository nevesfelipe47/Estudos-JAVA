import java.util.Scanner;
import java.math.*;
import java.util.Locale;


public class teste_imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura;
		
		System.out.println("------ Bem vindo ao calculo de IMC em JAVA -----");
		Locale.setDefault(Locale.US);
		System.out.println("Digite sua seu peso: ");
		peso = sc.nextDouble();
		Locale.setDefault(Locale.US);
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		Locale.setDefault(Locale.US);
		double imc;
		imc=peso / (altura*altura);
		Locale.setDefault(Locale.US);
		if(imc < 18.5) {
			System.out.println("IMC Abaixo do Peso Seu IMC = " + imc);
		}else if (imc >=18.6 && imc<=24.9) {
			System.out.println("IMC Peso Normal Seu IMC = " + imc);
		Locale.setDefault(Locale.US);
		}else if (imc >=25 && imc<=29.9) {
			System.out.println("IMC Sobrepeso Seu IMC = " + imc);
		}else if (imc >=30 && imc<=34.9) {
			System.out.println("IMC Obesidade Nivel 1 Seu IMC = " + imc);
		}else if (imc >=35 && imc<=39.9) {
			System.out.println("IMC Obesidade Nivel 2 Seu IMC = " + imc);
		} else if( imc >=40 ){
			System.out.println("IMC Obesidade Nivel 3 ou Morbida Seu IMC = " + imc);
		}
		
		

	}

}
