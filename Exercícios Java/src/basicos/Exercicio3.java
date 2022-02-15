/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa
 *  em segundos e mostre-o expresso em horas, minutos e segundos. 

 */
package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int totalSegundos,horas,minutos,segundos;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		totalSegundos=calc.nextInt();
		
		horas=totalSegundos/3600;
		minutos=(totalSegundos%3600)/60;
		segundos=(totalSegundos%3600)%60;
		
		System.out.println("O evento durou: "+horas+" hora, "+minutos+" minutos e "+segundos+" segundos");
		calc.close();

	}

}
