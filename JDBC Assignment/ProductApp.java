package com.sonata.Example;

import com.sonata.DAOImpl.ProductImplement;
import com.sonata.Model.Product;

public class ProductApp {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		
		p1.setProductID(101);
		p1.setProductName("Macbook");
		p1.setProductPrice(96000.00);

		
		p2.setProductID(102);
		p2.setProductName("Mobile");
		p2.setProductPrice(20000.00);

		
		p3.setProductID(103);
		p3.setProductName("Watch");
		p3.setProductPrice(5000.00);

		
		p4.setProductID(p2.getProductID());
		p4.setProductName("Headphones");
		p4.setProductPrice(500.00);
		
		ProductImplement pImpl = new ProductImplement();
		
		// Adding Products to Database
		System.out.println(pImpl.addProduct(p1));
		System.out.println(pImpl.addProduct(p2));
		System.out.println(pImpl.addProduct(p3));
		pImpl.displayProduct();	

		System.out.println("\n");
		
		// Deleting Product - 101
		System.out.println(pImpl.deleteProduct(p1));
		pImpl.displayProduct();	

		System.out.println("\n");
		
		// Updating Product - 102
		System.out.println(pImpl.updateProduct(p4));
		pImpl.displayProduct();	

		System.out.println("\n");
	}
}