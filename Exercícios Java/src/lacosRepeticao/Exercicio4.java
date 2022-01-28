/*4)Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos
indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade,
sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2,
se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um
sistema que permita ler os dados de 150 pessoas, calcule e mostre:*/

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int idade, sexo, soma = 0, temperamento;
		int calmo = 0, nervoso = 0, agressivo = 0, calmoOut = 0, nervoso40 = 0, calmo18 = 0;
		Scanner leia = new Scanner(System.in);

		while (soma <= 150) {

			System.out.println("Qual a sua idade:");
			idade = leia.nextInt();
			System.out.println("Qual o seu sexo: \n(Digite 1-feminino|2-masculino|3-Outros) ");
			sexo = leia.nextInt();
			System.out.println("Voc� se identifica mais como algu�m: \n(1-Calmo(a)|2-Nervoso(a)|3-Agressivo(a)");
			temperamento = leia.nextInt();

			if (temperamento == 1) {
				calmo18++;
			}
			if (sexo == 1 && temperamento == 2) {
				nervoso++;
			}
			if (sexo == 2 && temperamento == 3) {
				agressivo++;
			}
			if (sexo == 3 && temperamento == 1) {
				calmoOut++;
			}
			if (idade > 40 && temperamento == 2) {
				nervoso40++;
			}
			if (idade < 18 && temperamento == 1) {
				calmo18++;
			}
			soma++;
		}

		System.out.println("O n�mero de pessoas calmas � de: " + calmo + " pessoas");
		System.out.println("O n�mero de mulheres nervosas � de: " + nervoso + " mulheres");
		System.out.println("O n�mero de homens agressivos � de: " + agressivo + " homens");
		System.out.println("O n�mero do sexo 'Outros' e calmos � de: " + calmoOut + " pessoas");
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � de: " + nervoso40 + " pessoas");
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � de " + calmo18 + " pessoas");
		leia.close();
	}
}