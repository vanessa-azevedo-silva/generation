/*2)Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */

package lacosRepeticao;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		int N, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {
			System.out.println("Digite um n�mero: ");
			N = leia.nextInt();

			if (N % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println(par + " n�meros s�o pares");
		System.out.println(impar + " n�meros s�o �mpares");
		leia.close();
	}
}