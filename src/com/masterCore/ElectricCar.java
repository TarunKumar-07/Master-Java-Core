package com.masterCore;
// P8
public class ElectricCar extends Car{
	private double BatteryCapacity;
	public ElectricCar() {
		super();
	}
	// P9 Overloading
	public ElectricCar(String model, String brand, double price, double BatteryCapacity) {
		super(model, brand, price);
		this.BatteryCapacity = BatteryCapacity;
	}
	public void setBattryCapacity(float BatteryCapacity) {
		this.BatteryCapacity = BatteryCapacity;
	}
	public double getBatteryCapacity() {
		return BatteryCapacity;
	}
//	P9 Overriding
	@Override
	public String details() {
		return "ElectricCar [model=" + super.getModel() + ", brand=" + getBrand() + ", price=" + getPrice() +" ,battry capacity="+BatteryCapacity+ "kWh]";
	}
	
	
	
}
