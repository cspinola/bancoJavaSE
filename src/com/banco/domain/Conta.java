package com.banco.domain;

public class Conta {
	private String cpf;
	private double saldo;
	private String dataAbertura;
	private String agencia;
	private int numero;
	//private Cliente titular;
	private String titular;
	private double limite;
	private static int totaldeContas;
	private int identificador;
	private String tipo;
	private static double rendimento;
	// private static double rendimento; 
	// Construtor de Conta
	
	public Conta(){
		// Construtor sem argumentos
		System.out.println("Criando Conta.");
		Conta.totaldeContas += 1; // Na vari?vel static n?o se usa o "this"
		this.identificador = Conta.totaldeContas;
	}
	Conta(String titular){
		//this();
		this.titular = titular;
	}
	Conta(int conta, String titular){
		this(titular); //Chama o construtor que foi declarado acima
		this.numero = conta;
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
	/*
	public boolean equals(Object object){
		//Verifica se o objeto ? nulo
		if (object == null){
			return false;
		}
		if (this.numero == object.numero && this.agencia.equals(object.agencia)){
			return true;
		}
		return false;
	}
	*/
	
	public void mudaCPF(String cpf){
		validaCPF(cpf);
		this.cpf = cpf;
	}
	public int getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador(int identificador){
		this.identificador = identificador;
	}
	
	private void validaCPF(String cpf){
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public String getAgencia(){
		return this.agencia ;
	}
	
	public double getSaldo(){
		return this.saldo; //+ this.limite;
	}
	
	public String getTitular(){
		return this.titular;
	}
	
	public void setTitular(String nome){
		this.titular = nome;
	}
	
/*
	public boolean saca(double valor){
		if (this.saldo < valor){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}*/
	
	/*public void saca(double valor){
		if (valor > this.saldo){
			System.out.println("Nao foi posssivel sacar um valor maior que o saldo!");
		}else {
			this.saldo -= valor;
		}
	}*/
	
	public void saca(double valor){
		if (this.saldo < valor || valor < 0){
			throw new IllegalArgumentException("O valor do saque ? superior ao saldo ou negativo.");
		} else {
			this.saldo -= valor;
		}
	}
	
	void deposita(double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Apenas valores positivos s?o permitidos.");
		}else {
			this.saldo += valor;
		}
	}
	/*
	void transfere(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	boolean transferePara (Conta destino, double valor){
		
		boolean retirou;
		
		if (retirou == false){
			// n�o deu para sacar!
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
		dados += "\n O Saldo �: " + this.saldo;
		dados += "\n A Ag�ncia �: " + this.agencia;
		dados += "\n O num da conta �: " + this.numero;
		dados += "\n Data de abertura: " + this.dataAbertura;
		dados += "\n Tipo: " + this.getTipo();
		System.out.println(dados);
		return dados;
	}
	
	//Metodo Imprime objeteo Conta com JavaLang!!!
	//Permite a Impress?o via System.out.println("Conta: " + Conta)
	//@Override
	public String toString(){
		return "Identificador: " + this.identificador
		 + "\nTitular da Conta: " + this.titular
		 + "\n O Saldo �: " + this.saldo
		 + "\n A Ag�ncia �: " + this.agencia
		 + "\n O num da conta �: " + this.numero
		 + "\n Data de abertura: " + this.dataAbertura
		 + "\n Tipo: " + this.getTipo();
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo += tipo;
	}
	void recuperaDadosParaImpressao(){
		System.out.println("O Titular �:" + this.titular);
		System.out.println("O Saldo �:" + this.saldo);
		System.out.println("A Ag�ncia �:" + this.agencia);
		System.out.println("O num da conta �:" + this.numero);
		System.out.println("Data de abertura:" + this.dataAbertura);
	}
}

