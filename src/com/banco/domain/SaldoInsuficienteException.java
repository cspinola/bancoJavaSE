package com.banco.domain;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException (String message){
		super(message);
	}
}
