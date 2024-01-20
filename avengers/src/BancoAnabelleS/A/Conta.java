package BancoAnabelleS.A;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	
	Random random = new Random();
	Scanner input = new Scanner (System.in);
	protected String TitularC;
	protected String CPF;
	protected String Data;
	protected int nConta;
	protected int Ag;
	protected String tipo;
	protected double Saldo;
    private int numeroConta;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = random.nextInt();
	}
	public void setData(String data) {
		Data = data;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getData() {
		return Data;
	}
	public void setIdade(String Data) {
		Data = Data;
	}
	protected boolean Status;
	
	public int getAg() {
		return Ag;
	}
	public void setAg(int ag) {
		Ag = ag;
	}
	
		public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean Status) {
		this.Status = Status;
	}
	public String getTitularC() {
		return TitularC;
	}
	public void setTitularC(String titularC) {
		TitularC = titularC;
	}
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public void Transferencia (Double pix) {
		
	}
	
	public void abrirNConta () {
		
	}
	public void nConta() {
				
	}
	public void transferencia(double pix) {
		// TODO Auto-generated method stub
		
	}
	public void saque(Double dinheiro) {
		// TODO Auto-generated method stub
		
	}
	public void saque(double i) {
		// TODO Auto-generated method stub
		
	}
	public void N() {
		// TODO Auto-generated method stub
		
	}
}
