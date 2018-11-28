package com.curso.jsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@ManagedBean //Equivale a la CDI @Named
@RequestScoped //No es necesario ponerlo, es el por defecto
public class IndexController {
	
	private Saludo saludo = new Saludo();

	public Saludo getSaludo() {
		return saludo;
	}

	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}

	public void saludar(){
		System.out.println("En el Action");
		saludo.generarSaludo();
	}
	
	public void ajax(AjaxBehaviorEvent event) {
		System.out.println("En el Ajax");
	}
}
