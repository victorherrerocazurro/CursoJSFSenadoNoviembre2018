package com.curso.jsf.controllers;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import com.sun.faces.renderkit.html_basic.LabelRenderer;

@FacesRenderer(rendererType=MiOutputText.MI_OUTPUT_TEXT_RENDERER_TYPE, componentFamily=UIOutput.COMPONENT_FAMILY)
public class MiOutputRenderer extends LabelRenderer{

	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	
		ResponseWriter writer = context.getResponseWriter();
		
		writer.startElement("div", component);
		
		String pepito = (String)component.getAttributes().get("pepito");
        
        writer.writeAttribute("pepito", pepito, null);
		
		System.out.println("Renderizando");
		
		super.encodeBegin(context, component);
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
		// TODO Auto-generated method stub
		super.encodeEnd(context, component);
		
		ResponseWriter writer = context.getResponseWriter();
		
		writer.endElement("div");
	}
	
}
