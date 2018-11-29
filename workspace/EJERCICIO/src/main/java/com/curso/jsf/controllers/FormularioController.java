package com.curso.jsf.controllers;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.curso.jsf.back.Servicio;
import com.curso.jsf.model.Cliente;

@ManagedBean
@RequestScoped
public class FormularioController {
    
	@ManagedProperty("#{servicio}")
	private Servicio servicio;
	
    @ManagedProperty("#{cliente}")
    private Cliente cliente;
    
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//Funcionalidad de formulario de alta
    public String alta() {
        servicio.alta(cliente);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Alta OK!!", null));
        return null;
    }
 }
