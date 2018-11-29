package com.curso.jsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean //Equivale a la CDI @Named
@RequestScoped //No es necesario ponerlo, es el por defecto
public class IndexController {
	
	@ManagedProperty("#{saludo}")
	private Saludo saludo;

	public Saludo getSaludo() {
		return saludo;
	}

	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}

	public void saludar(){
		saludo.generarSaludo();
	}
}