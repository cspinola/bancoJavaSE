package com.banco.domain;

public class funcionarioAutenticavel extends Funcionario {
	int senha;
	
	public double getBonificacao(){
		return this.salario*0.1;
	}
	
	public boolean autentica (int senha){
		if (senha == this.senha){
			return true;
		}
		return false;
	}
}
