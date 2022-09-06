package com.sonata.day2;

public class MyShop {
	
    public static void main(String[] args) {
    	
        Sedan sedan = new Sedan(7000, 5000, "blue", 30);
        
        Ford fordOne = new Ford(6000, 3000, "black", 2021, 45);
        
        Ford fordTwo = new Ford(8000, 2500, "yellow", 2020, 40);
        
        Car car = new Car(1000, 1000, "black");
        
        System.out.println("Sedan " + sedan.getSalePrice());
        
        System.out.println("Fordone " + fordOne.getSalePrice());
        
        System.out.println("fordTwo " + fordTwo.getSalePrice());
        
        System.out.println("Car  " + car.getSalePrice());
        
    }
    
}
