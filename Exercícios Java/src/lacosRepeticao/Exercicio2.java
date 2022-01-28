/*2)Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

package lacosRepeticao;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		int N, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {
			System.out.println("Digite um número: ");
			N = leia.nextInt();

			if (N % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println(par + " números são pares");
		System.out.println(impar + " números são ímpares");
		leia.close();
	}
}