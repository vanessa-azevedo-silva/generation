/*2)Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um
vetor com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica
dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
package vetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[10], soma = 0, maior = 0, somaMaior = 0;

		for (int x = 0; x < 10; x++) {
			System.out.println("N�mero que saiu na jogada: ");
			vet[x] = leia.nextInt();

			if (vet[x] >= 1 && vet[x] <= 6) {
				if (vet[x] > maior) {
					maior = vet[x];
				}
				
				if (vet[x] == maior) {
					somaMaior++;
				}
				soma = soma + vet[x];
			} else {
				System.out.println("Erro. Digite apenas de 1 � 6");
			}
		}
		for (int x = 0; x < 10; x++) {
			System.out.println("\t" + vet[x]);
		}
		System.out.println("A m�dia dos n�meros lan�ados �:" + soma / 10);
		System.out.println("\nO maior n�mero � " + maior + " e apareceu " + somaMaior + " vezes");
	}
}
