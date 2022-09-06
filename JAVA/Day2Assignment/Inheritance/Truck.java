package com.sonata.day2;

public class Truck extends Car {
	
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
    	
        super(speed, regularPrice, color);
        this.weight = weight;
        
    }

    public double getSalePrice() {
    	
        return super.getSalePrice() * (weight > 2000 ? 0.10 : 0.20);
        
    }
    
}