package exerciciosBasicos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double A,B,C,R,S,D;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		A=calc.nextDouble();
		B=calc.nextDouble();
		C=calc.nextDouble();
		
		R= Math.pow((A+B),2);
		S= Math.pow((B+C),2);
		D=(R+S)/2;
		
		System.out.println("\nD é igual a: "+D);
		calc.close();
	}

}
