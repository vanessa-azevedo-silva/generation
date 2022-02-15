/*6-Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer 
 no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
*/
package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x2,y2,x1,y1,d;
		
		Scanner calc = new Scanner(System.in);
		System.out.println("Digite 2 pontos de partida: ");
		x1=calc.nextDouble();
		x2=calc.nextDouble();
		System.out.println("Digite 2 pontos de destino: ");
		y1=calc.nextDouble();
		y2=calc.nextDouble();
		
		d=Math.sqrt(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0));
		System.out.println("A distância entre os pontos foi: "+d);
		
		calc.close();
	}
}
