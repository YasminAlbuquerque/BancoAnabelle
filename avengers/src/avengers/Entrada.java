package avengers;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String nome;
	int idade;
		
	Scanner Teclado = new Scanner (System.in);{
		
	System.out.println("Digite seu nome: " + Titular );
	nome = Teclado.nextLine();
	System.out.println("Digite sua idade: ");
	idade = Teclado.nextInt();
	}
	System.out.println("Muito prazer, " + nome);
	System.out.println("Sua idade é: " + idade + "anos!");
	}
}