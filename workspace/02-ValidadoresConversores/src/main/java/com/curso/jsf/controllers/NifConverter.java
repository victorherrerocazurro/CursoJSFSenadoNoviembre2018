package com.curso.jsf.controllers;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("nifConverter")
public class NifConverter implements Converter<Nif>{

	@Override
	public Nif getAsObject(FacesContext context, UIComponent component, String value) {
		
		//Si el formato aceptado de Nif es 71111222-Z
		
		String[] datos = value.split("-");
		
		Nif nif = new Nif(Long.parseLong(datos[0]), datos[1].charAt(0));
		
		return nif;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Nif value) {
		return value.toString();
	}

}
