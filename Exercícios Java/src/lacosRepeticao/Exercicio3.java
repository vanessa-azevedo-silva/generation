/*3)Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade = 0, x = 0, y = 0; // x= menor que 21 anos e y=maior que 50 anos
		Scanner leia = new Scanner(System.in);

		while (idade != -99) {

			System.out.println("Qual sua idade: ");
			idade = leia.nextInt();

			if (idade == -99) {
				break;
			} else if (idade < 21) {
				x++;
			} else if (idade > 50) {
				y++;
			}
		}
		System.out.println(x + " pessoa(s) tem menos que 21 anos");
		System.out.println(y + " pessoa(s) tem mais que 50 anos");
		leia.close();
	}
}
