package com.curso.jsf.controllers;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.curso.jsf.back.Servicio;
import com.curso.jsf.model.Cliente;

@ManagedBean
@RequestScoped
public class TablaController {
    
	@ManagedProperty("#{servicio}")
	private Servicio servicio;
	
    //Funcionalidad de representacion de clientes en una tabla
    public ArrayList<Cliente> getClientes() {
        return servicio.obtenerClientes();
    }
    
    public void onRowEdit(RowEditEvent event) {
    	
    	Cliente cliente = (Cliente) event.getObject();
    	
    	servicio.editarCliente(cliente);
        
		FacesMessage msg = new FacesMessage("Se ha editado con exito el Cliente", String.valueOf(cliente.getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Se ha cancelado la edicion", String.valueOf(((Cliente) event.getObject()).getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 }
