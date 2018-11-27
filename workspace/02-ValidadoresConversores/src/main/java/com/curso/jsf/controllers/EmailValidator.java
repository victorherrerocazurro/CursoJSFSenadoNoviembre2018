package com.curso.jsf.controllers;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator<String> {

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {

		if(!value.equals("victorherrerocazurro@gmail.com")) {
			FacesMessage message = new FacesMessage(); 
			message.setSeverity(FacesMessage.SEVERITY_ERROR); 
			message.setSummary("Este esel mensajede error principal"); 
			message.setDetail("Este esel detalle"); 
			throw new ValidatorException(message );
		}
	}
}
