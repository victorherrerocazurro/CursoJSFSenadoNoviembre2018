package com.curso.jsf.controllers;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean //Equivale a la CDI @Named
@RequestScoped //No es necesario ponerlo, es el por defecto
public class IndexController {
	
	@ManagedProperty("#{msg}") 
	private ResourceBundle bundle;
	
	public ResourceBundle getBundle() {
		return bundle;
	}

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	private Saludo saludo = new Saludo();

	public Saludo getSaludo() {
		return saludo;
	}

	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}

	public void saludar(){
		
		Locale locale= Locale.ENGLISH; 
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		
		System.out.println(bundle.getString("views.index.title"));
		
		saludo.generarSaludo();
	}
}
