/*1)Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
 atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente*/

package vetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[5], maior = 0;

		for (int x = 0; x < 5; x++) {
			System.out.println("Digite sua pontua��o: ");
			vet[x] = leia.nextInt();
			if (vet[x] > maior)
				maior = vet[x];
		}

		for (int x = 0; x < 5; x++) {
			System.out.println(vet[x]);

		}
		System.out.println("A maior pontua��o �: " + maior);
	}

}
