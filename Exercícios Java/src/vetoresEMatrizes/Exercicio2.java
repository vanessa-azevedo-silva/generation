/*2)Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um
vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética
dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
package vetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[10], soma = 0, maior = 0, somaMaior = 0;

		for (int x = 0; x < 10; x++) {
			System.out.println("Número que saiu na jogada: ");
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
				System.out.println("Erro. Digite apenas de 1 à 6");
			}
		}
		for (int x = 0; x < 10; x++) {
			System.out.println("\t" + vet[x]);
		}
		System.out.println("A média dos números lançados é:" + soma / 10);
		System.out.println("\nO maior número é " + maior + " e apareceu " + somaMaior + " vezes");
	}
}
