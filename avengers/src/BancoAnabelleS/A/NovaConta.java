package BancoAnabelleS.A;

import java.util.Scanner;

public class NovaConta {

    public static void main(String[] args) {
        int opcao;
        int i = 1;

        Conta c1 = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Olá! Para criar uma conta no Banco Anabelle S.A digite as informações requeridas abaixo");

        System.out.println("Por gentileza, informar o nome do Titular");
        c1.setTitularC(Teclado.nextLine());

        System.out.println("Por gentileza, informar o CPF");
        c1.setCPF(Teclado.nextLine());

        System.out.println("Por gentileza, informar a data de nascimento");
        c1.setIdade(Teclado.nextLine());

        do {
            System.out.println(" MENU");
            System.out.println("1) Conta Corrente");
            System.out.println("2) Conta Poupança");
            opcao = Teclado.nextInt();

            if (opcao == 1) {
                cc.abrirNConta();
                
                System.out.println("O número da sua conta é:" + (i++));
                System.out.println("Saldo: R$"+ cc.getSaldo()); 
                cc.Deposito(1000); 
                System.out.println("Saldo atual: R$"+ cc.getSaldo());
                cc.transferencia(200);
                System.out.println("Saldo atual: R$"+ cc.getSaldo());
                cc.saque(500);
                System.out.println("Saldo atual: R$"+ cc.getSaldo());
                
            } else if (opcao == 2) {
                cp.abrirNConta();
                
                System.out.println("O número da sua conta é:" + (i++));
                System.out.println("Saldo: R$"+ cp.getSaldo()); 
                cp.Deposito(1000); 
                System.out.println("Saldo atual: R$"+ cp.getSaldo());
                cp.transferencia(200);
                System.out.println("Saldo atual: R$"+ cp.getSaldo());
                cp.saque(500);
                System.out.println("Saldo atual: R$"+ cp.getSaldo());
            }
        } while (opcao != 1 && opcao != 2);
    }
}
		
	
		
		

		
		




		
		
				
	

	
			


	
	
