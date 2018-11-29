package com.curso.jsf.controllers;

public class Saludo {

	private String texto;
	private String generado = "<vacio>";
	
	public String getGenerado() {
		return generado;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void generarSaludo() {
		generado = "Hola " + texto;
		
	}
}
