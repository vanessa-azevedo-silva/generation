/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
 * expressa em anos, meses e dias.
 *  */
package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int idadeDias,anos,meses,dias;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias:");
		idadeDias = calc.nextInt();
		
		anos=idadeDias/365;
		meses=(idadeDias%365)/30;
		dias=(idadeDias%365)%30;
		
		System.out.println("Você tem: "+anos+" anos "+meses+" meses "+"E "+dias+" dias");
		calc.close();
	}

}
