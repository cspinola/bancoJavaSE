package com.banco.domain;

public class SistemaInterno {
	
	public void login(funcionarioAutenticavel fa) {
		
		int senha = 1234; // deverá pegar a senha de algum dispositivo
		// Aqui vai chamar o autentica
		// Pois todo funcionario atuenticavel terá
		boolean ok = fa.autentica(senha);
	}

}
