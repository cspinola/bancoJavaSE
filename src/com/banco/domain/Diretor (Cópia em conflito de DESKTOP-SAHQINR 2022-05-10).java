package com.banco.domain;

public class Diretor extends Gerente implements Autenticavel{
	public  double getBonificacao(){
		return this.salario*0.15;
	}
	public boolean autentica(int senha){
		if(this.senha == senha){
			return true;
		}
		return false;
	}
}
