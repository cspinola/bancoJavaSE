package com.banco.domain;
/*
public class teste {
	public	static	void	main(String[]	args) {
		Conta conta = new Conta();
		conta.deposita(1000);
		try{
			conta.saca(-1200);
			System.out.println("Saque realizado com sucesso.");
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(conta.getSaldo());
	}
}*/

public class teste {
	public	static	void	main(String[]	args) {
		Conta conta = new Conta();
		conta.deposita(1000);
		conta.setIdentificador(13542);
		conta.setAgencia("3610");
		System.out.println("Conta:" + conta);
	}
}