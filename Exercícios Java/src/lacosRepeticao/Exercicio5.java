/*5)Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre
 *  a soma dos n�meros digitados. */
package lacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N, soma = 0;

		do {
			System.out.println("Digite um n�mero: ");
			N = leia.nextInt();
			soma = soma + N;
		}

		while (N != 0);
		
		System.out.println("A soma dos n�meros �: " + soma);
		leia.close();
	}
}
