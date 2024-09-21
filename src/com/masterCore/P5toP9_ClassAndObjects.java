package com.masterCore;

public class P5toP9_ClassAndObjects {
	public static void main(String[] args) {
//		Car car1 = new Car("R8","Audi",20000000);
//		System.out.println(car1.details());
//		System.out.println(car1.discountPrice(10));
		
		ElectricCar ecar1 = new ElectricCar("Cyber Truck","Tesla",50000000,30.5) ;
		System.out.println(ecar1.details());
		System.out.println(ecar1.drive());
	}
}
