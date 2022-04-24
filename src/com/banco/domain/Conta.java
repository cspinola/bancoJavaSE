package com.banco.domain;

class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	double salario;
}

class Data{
	int dia, mes, ano;
}

public class Conta {
	private String cpf;
	private double saldo;
	private String dataAbertura;
	private String agencia;
	private int conta;
	//private Cliente titular;
	private String titular;
	private double limite;
	private static int totaldeContas;
	private int identificador;
	private static double rendimento;
	// private static double rendimento; 
	// Construtor de Conta
	
	Conta(){
		// Construtor sem argumentos
		System.out.println("Criando Conta.");
		Conta.totaldeContas += 1; // Na variável static não se usa o "this"
		this.identificador = Conta.totaldeContas;
	}
	Conta(String titular){
		//this();
		this.titular = titular;
	}
	Conta(int conta, String titular){
		this(titular); //Chama o construtor que foi declarado acima
		this.conta = conta;
	}
	/*
	Conta(String cpf){
		if (validaCPF(cpf) == FALSE){
			return 0;
		}else {
			this.cpf = cpf;
		}
	}
	*/
	public static int getTotaldeContas(){
		return	Conta.totaldeContas;
	}
	public void mudaCPF(String cpf){
		validaCPF(cpf);
		this.cpf = cpf;
	}
	public int getIdentificador(){
		return this.identificador;
	}
	private void validaCPF(String cpf){
	
	}
	
	public double getSaldo(){
		return this.saldo; //+ this.limite;
	}
	
	public String getNome(){
		return this.titular;
	}
	
	public void setNome(String nome){
		this.titular = nome;
	}
	
	/*
	boolean saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo -= quantidade;
		return true;
	}*/
	
	public void saca(double valor){
		if (valor > this.saldo){
			System.out.println("Nï¿½o ï¿½ possï¿½vel sacar um valor maior que o saldo!");
		}else {
			this.saldo -= valor;
		}
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	/*
	void transfere(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	boolean transferePara (Conta destino, double valor){
		
		boolean retirou;
		
		if (retirou == false){
			// nï¿½o deu para sacar!
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}
	}	*/
	/*
	double calculaRendimento (double indice){
		// corrige o saldo com juros
		this.saldo = this.saldo*(1+ indice);
		return this.saldo;
	}
	*/
	
	double calculaRendimento (){
		// corrige o saldo com juros
		// this.saldo = this.saldo
		return this.saldo*this.rendimento;
	}
	
	public String Imprime(){
		String dados;
		dados = "Identificador: " + this.identificador;
		dados += "\nTitular da Conta: " + this.titular;
		dados += "\n O Saldo ï¿½: " + this.saldo;
		dados += "\n A Agï¿½ncia ï¿½: " + this.agencia;
		dados += "\n O num da conta ï¿½: " + this.conta;
		dados += "\n Data de abertura: " + this.dataAbertura;
		System.out.println(dados);
		return dados;
	}
	
	void recuperaDadosParaImpressao(){
		System.out.println("O Titular ï¿½:" + this.titular);
		System.out.println("O Saldo ï¿½:" + this.saldo);
		System.out.println("A Agï¿½ncia ï¿½:" + this.agencia);
		System.out.println("O num da conta ï¿½:" + this.conta);
		System.out.println("Data de abertura:" + this.dataAbertura);
	}
}

