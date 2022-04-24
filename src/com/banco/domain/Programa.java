package com.banco.domain;

public class Programa {
	
	public static void main(String[] args){
		
		Gerente gerente = new Gerente();
		gerente.setSalario(10000);
		Funcionario f = new Funcionario("Joao");
		gerente.setSenha(1234);
		boolean autentica;
		
		autentica = gerente.autentica(1234);
		
		System.out.println(autentica);
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente.getSalario());
		System.out.println(f.nome);
		/*
		Conta minhaConta1 = new Conta();
		Conta minhaConta2 = new Conta();
		Conta minhaConta3 = new Conta();
		Conta minhaConta4 = new Conta(1234, "Carlos");
		int j = Conta.getTotaldeContas(); // para imprimir um m�todo statico usar a classe diretamente
		
		System.out.println(j);
		minhaConta4.Imprime();
		System.out.println(minhaConta1.getIdentificador());
		System.out.println(minhaConta2.getIdentificador());
		System.out.println(minhaConta3.getIdentificador());
		System.out.println(minhaConta4.getIdentificador());*/
	}

}
