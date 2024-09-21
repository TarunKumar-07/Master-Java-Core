package com.masterCore;

public class Car implements P11_Drivable{
	public Car() {}
	// P7 parametrized constructor
	public Car(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	private String model;
	
	private String brand;
	private double price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	P6 detalis() and discountPrice() method
	public String details() {
		return "Car [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	
	public int discountPrice(int percent) {
		int discount = (int) ((price*percent)/100);
		return (int)(price-discount);
	}
//	P11
	@Override
	public boolean drive() {
		return true;
	}


}
