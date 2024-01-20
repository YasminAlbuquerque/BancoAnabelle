package BancoAnabelleS.A;

public class ContaPoupança extends Conta {

	private Double pix;
	private int nConta;
	private int numeroconta;

	
	
	
	@Override
	public void abrirNConta() {
		this.setSaldo(0.00);
		this.getSaldo();
		System.out.println("Seja Bem-Vindo ao Banco Anabelle S.A!");
		System.out.println("A Conta Poupança foi aberta com sucesso. Obrigada pela preferência.");
		System.out.println("O número da sua agência é 100" );}
		



	public void Deposito (double valor) { 
		this.setSaldo (valor + this.getSaldo());
		System.out.println("Deposito realizado com sucesso no valor de: R$ " + valor);
	
	}
	@Override
	public void transferencia (double pix) {
		if (this.getSaldo()> 0 && this.getSaldo() >= pix) {
			this.setSaldo(this.getSaldo()- pix);
			System.out.println("O pix no valor de R$ " + pix + " foi realizado com sucesso!");
			
		}else {
			System.out.println("Saldo insuficiente");}
	}
	
	@Override
	public void saque(double i) {
		if ((this.getSaldo()> 0 && this.getSaldo() >= i)){
		this.setSaldo(this.getSaldo()- i);
        System.out.println("O saque no valor de R$ " + i + " foi realizado com sucesso!");
			
		}else {
			System.out.println("Saldo insuficiente");}}}
			