package com.banco.domain;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public abstract double getBonificacao();/*{
		//return this.salario*0.1; - definido abstrato vai ser obrigatoria
								// mente definido nas classes filhas.
	}*/
	
	//construtor sem argumento
	Funcionario(){
		
	}
	
	Funcionario(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
