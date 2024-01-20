package avengers;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
			
		Scanner Teclado = new Scanner (System.in);{
			
		System.out.println ("Qual a primeira nota?");
		nota1= Teclado.nextDouble();
		System.out.println("Qual a segunda nota?");
		nota2= Teclado.nextDouble();
		
		}
		double media = (nota1 + nota2) / 2;
		System.out.println ("Sua média é: " + media);
	}	
}


