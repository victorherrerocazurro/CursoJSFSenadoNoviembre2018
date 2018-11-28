package com.curso.jsf.controllers;

import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlOutputText;

@FacesComponent(createTag=true, tagName="MiOutput", namespace="http://mis.componentes/jsf")
public class MiOutputText extends HtmlOutputText{

	public static final String MI_OUTPUT_TEXT_RENDERER_TYPE = "javax.faces.miOutputText";

	public MiOutputText() {
		super();
		setRendererType(MI_OUTPUT_TEXT_RENDERER_TYPE);
	}
	
	//Si se quiere definir una nueva familia, se debera implementar el metodo getFamily

	
	
}
