/*5)Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre
 *  a soma dos números digitados. */
package lacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N, soma = 0;

		do {
			System.out.println("Digite um número: ");
			N = leia.nextInt();
			soma = soma + N;
		}

		while (N != 0);
		
		System.out.println("A soma dos números é: " + soma);
		leia.close();
	}
}
