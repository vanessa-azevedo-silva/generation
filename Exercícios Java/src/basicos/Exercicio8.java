/*8-O custo ao consumidor de um carro novo é a soma do custo de fábrica 
 com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever 
 um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double custoFabrica, distribuidor = 0.28, impostos=0.45, soma;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica=calc.nextDouble();
		
		soma = custoFabrica*distribuidor+custoFabrica*impostos+custoFabrica;
		System.out.println("O cuto ao consumidor é: "+soma);
		calc.close();		
	}

}
