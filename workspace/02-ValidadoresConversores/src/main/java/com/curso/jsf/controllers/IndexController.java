package com.curso.jsf.controllers;

import javax.faces.annotation.ManagedProperty;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

import com.sun.faces.taglib.html_basic.InputTextTag;

@ManagedBean //Equivale a la CDI @Named
@RequestScoped //No es necesario ponerlo, es el por defecto
public class IndexController {
	
	private InputTextTag itNif;
	
	private Nif nif;
	
	public Nif getNif() {
		return nif;
	}

	public void setNif(Nif nif) {
		this.nif = nif;
	}

	public EmailValidator getEmailValidator() {
		return emailValidator;
	}

	public void setEmailValidator(EmailValidator emailValidator) {
		this.emailValidator = emailValidator;
	}

	@ManagedProperty("#{emailValidator}")
	private EmailValidator emailValidator;
	
	private String mail;
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	private Saludo saludo = new Saludo();

	public Saludo getSaludo() {
		return saludo;
	}

	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}

	public void saludar(){
		
		//emailValidator.validate(FacesContext.getCurrentInstance(), null, mail);
		
		System.out.println(nif);
		
		saludo.generarSaludo();
	}
	
	public void validarCampoCorreo(
			FacesContext context, UIComponent component, String value) throws ValidatorException {
		
		if(!value.equals("victorherrerocazurro@gmail.com")) {
			FacesMessage message = new FacesMessage(); 
			message.setSeverity(FacesMessage.SEVERITY_ERROR); 
			message.setSummary("Este esel mensajede error principal"); 
			message.setDetail("Este esel detalle"); 
			throw new ValidatorException(message );
		}
		
	}
}
