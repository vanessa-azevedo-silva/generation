/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média
 *final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. package exercicios;
 */
package exerciciosBasicos;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int nota1,nota2,nota3,soma;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite suas notas: ");
		nota1=calc.nextInt();
		nota2=calc.nextInt();
		nota3=calc.nextInt();
		
		soma=(nota1*2+nota2*3+nota3*5)/3;
				
		System.out.println("Sua média é: "+soma);
		calc.close();
	}

}
