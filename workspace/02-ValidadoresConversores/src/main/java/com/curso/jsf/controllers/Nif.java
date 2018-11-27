package com.curso.jsf.controllers;

public class Nif {
	
	private long numero;
	private char letra;
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public Nif(long numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}
	public Nif() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return numero + "-" + letra;
	}
	
	
}
