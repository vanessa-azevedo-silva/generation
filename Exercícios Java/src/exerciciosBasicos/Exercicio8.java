/*8-O custo ao consumidor de um carro novo � a soma do custo de f�brica 
 com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
 Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever 
 um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
*/

package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double custoFabrica, distribuidor = 0.28, impostos=0.45, soma;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o custo de f�brica: ");
		custoFabrica=calc.nextDouble();
		
		soma = custoFabrica*distribuidor+custoFabrica*impostos+custoFabrica;
		System.out.println("O cuto ao consumidor �: "+soma);
		calc.close();		
	}

}
