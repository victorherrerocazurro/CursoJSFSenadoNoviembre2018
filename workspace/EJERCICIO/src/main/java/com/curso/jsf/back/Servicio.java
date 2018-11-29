package com.curso.jsf.back;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.curso.jsf.model.Cliente;

@ManagedBean
@ApplicationScoped
public class Servicio {
	
	private int contador = 0;
	@ManagedProperty("#{lista}")
    private ArrayList<Cliente> lista;
    
    public void alta(Cliente cliente) {
    	contador++;
        lista.add(cliente);
        System.out.println("alta " + contador);
    }

	public ArrayList<Cliente> obtenerClientes() {
		return lista;
	}

	public void editarCliente(Cliente cliente) {
		lista.set(lista.indexOf(cliente), cliente);
	}

	public Map<String, Number> getClientesPorAnno() {
		HashMap<String, Number> resultado = new HashMap<>();
		
		resultado.put("2012", 34);
		resultado.put("2013", 4);
		resultado.put("2014", 134);
		resultado.put("2015", 54);
		
		return resultado;
	}

}
