package com.sonata.day2;

public class Product {
	
	int proID;
	
	String proName;
	
	double proPrice;
	
	Product(){}
	
	Product( int id , String name , double price ) {
		
		this.proID = id;
		this.proName = name;
		this.proPrice = price;
		
	}
	
	public double gstTax (double p) {
		
		double finalPrice = proPrice + (proPrice*0.12);
		
		return finalPrice;
		
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product( 199 , "WhirlPool" , 79999);
		
		System.out.println( p1.proID + " - " + p1.proName + "\nPrice = " + p1.proPrice + "\n" + "GST = " + (p1.proPrice*0.18) + "\nFinal Price = " + p1.gstTax(p1.proPrice) );
		
	}
	
}