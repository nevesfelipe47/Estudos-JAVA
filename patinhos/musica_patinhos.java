package patinhos;
import java.util.Random;
import java.util.Scanner;
public class musica_patinhos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int duck_in;
		System.out.println("VAMOS CANTAR A MUSICA DOS PARTINHOS!!");
		
		System.out.println("Digite a quantidade de patinhos: ");
		duck_in = entrada.nextInt();
		
		
		for(int duck_dec = duck_in; duck_dec >=0; duck_dec--){

			int duck_fim = duck_dec -1;

			if(duck_fim > -1){//inicio do if
			System.out.printf("%d patinhos foram passear\n", duck_dec);
			System.out.println("Além das montanhas");
			System.out.println("Para brincar");
			System.out.println("A mamãe gritou: Quá, quá, quá, quá");
			System.out.printf("Mas só %d patinhos voltaram de lá.\n\n",duck_fim);
			}//encerra if
			
			if(duck_fim == -1){
				System.out.println("A mamãe patinha foi procurar");
				System.out.println("Além das montanhas");
				System.out.println("Na beira do mar");
				System.out.println("A mamãe gritou: Quá, quá, quá, quá");
				System.out.printf("E os %d patinhos voltaram de lá.\n\n\n",duck_in);
				}
			}//encerra if
		}
	}





