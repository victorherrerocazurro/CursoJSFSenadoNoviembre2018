package com.curso.jsf.controllers;

public class Car {

	private String id;
	private String brand;
	private int year;
	private String color;
	private int price;
	private boolean soldState;
	
	
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Car(String id, String brand, int year, String color, int price, boolean soldState) {
		super();
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.soldState = soldState;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public boolean isSoldState() {
		return soldState;
	}





	public void setSoldState(boolean soldState) {
		this.soldState = soldState;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
