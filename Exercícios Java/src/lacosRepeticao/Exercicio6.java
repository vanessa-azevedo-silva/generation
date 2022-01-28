/*6)Escrever um programa que receba vários números inteiros no teclado. E no final
 imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero). */
package lacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double x = 0, soma = 0;
		int N;

		do {
			System.out.println("Digite um número: ");
			N = leia.nextInt();

			if (N % 3 == 0 && N != 0) {
				x++;
				soma = soma + N;
			}

		} while (N != 0);

		System.out.println("A média dos múltiplos de 3 é igual a:  " + soma / x);
		leia.close();
	}
}
