package com.curso.jsf.controllers;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.primefaces.model.chart.PieChartModel;

import com.curso.jsf.back.Servicio;

@ManagedBean
public class ChartController implements Serializable {
    
    @ManagedProperty(value = "#{servicio}")
    private Servicio servicio;
     
    public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public PieChartModel geClientesPorAnno() {
        
		PieChartModel pieChartModel = new PieChartModel();
		
		Map<String, Number> data = servicio.getClientesPorAnno();
		
		pieChartModel.setData(data);

		pieChartModel.setTitle("Simple Pie");
		pieChartModel.setLegendPosition("w");
		pieChartModel.setShadow(false);
		
		return pieChartModel;
    }
}
