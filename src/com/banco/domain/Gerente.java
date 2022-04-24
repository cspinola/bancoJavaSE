package com.banco.domain;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	//Autentica gerente
	//@Override
	public double getBonificacao(){
		//return this.salario*0.15;
		return super.getSalario()*0.15;
		//return super.getBonificacao() + this.salario*0.05;		
	}
	
	public boolean autentica(int senha){
		if(this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		}else{
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
