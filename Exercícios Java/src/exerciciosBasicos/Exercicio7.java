/*7-Um sistema de equações lineares do tipo:ax+by=c e dx+ey=f,  
 * pode ser resolvido segundo mostrado abaixo : x=(ce-bf)/(ae-bd) 
 *e y=(af-cd)/(ae-bd). Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
 *e calcula e mostra os valores de x e y.
 * package exercicios;*/
package exerciciosBasicos;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		double A,B,C,D,E,F,x,y;
		
		Scanner calc = new Scanner(System.in);
		System.out.println("Digite um número para A: ");
		System.out.println("Digite um número para B: ");
		System.out.println("Digite um número para C: ");
		System.out.println("Digite um número para D: ");
		System.out.println("Digite um número para E: ");
		System.out.println("Digite um número para F: ");
		A=calc.nextDouble();
		B=calc.nextDouble();
		C=calc.nextDouble();
		D=calc.nextDouble();
		E=calc.nextDouble();
		F=calc.nextDouble();
		
		x=(C*E-B*F)/(A*E-B*D);
		y=(A*F-C*D)/(A*E-B*D);
		
		System.out.println("O valor de x é: "+x+"\nE o valor de y é: "+y);
		calc.close();
		
	}

}
