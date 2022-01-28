/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias.*/

package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int meses,anos,dias,totalDias;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		anos = calc.nextInt();
		
		System.out.println("Quantos meses você tem?");
		meses = calc.nextInt();
		
		System.out.println("Quantos dias você tem?");
		dias = calc.nextInt();
		
		totalDias = anos*365+meses*30+dias;
		
		System.out.println("Sua idade em dias é: \n"+totalDias);
		calc.close();
		
	}

}
