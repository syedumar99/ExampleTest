package com.sonata.day2;

public class TShirt {
	
	String color, material, design;
	
	TShirt (){}
	
	TShirt ( String c , String m , String d ) {
		
		this.color = c;
		this.material = m;
		this.design = d;
		
	}
	
	public static void main(String[] args) {	
		
		TShirt[] small = new TShirt[3];
		
		small[0] = new TShirt( "Blue" , "Cotton" , "Round Collar" );
		small[1] = new TShirt( "Yellow" , "Polyester" , "Full Sleeves" );
		small[2] = new TShirt( "Green" , "Linen" , "V Neck" );
		
		TShirt[] medium = new TShirt[3];
		
		medium[0] = new TShirt( "Black" , "Cotton" , "Round Collar" );
		medium[1] = new TShirt( "White" , "Polyester" , "Full Sleeves" );
		medium[2] = new TShirt( "Purple" , "Linen" , "V Neck" );
		
		TShirt[] large = new TShirt[3];
		
		large[0] = new TShirt( "Black" , "Cotton" , "Round Collar" );
		large[1] = new TShirt( "White" , "Polyester" , "Full Sleeves" );
		large[2] = new TShirt( "Green" , "Linen" , "V Neck" );	
		
		TShirt[] extraLarge = new TShirt[3];
		
		extraLarge[0] = new TShirt( "Red" , "Cotton" , "Round Collar" );
		extraLarge[1] = new TShirt( "SkyBlue" , "Polyester" , "Full Sleeves" );
		extraLarge[2] = new TShirt( "Green" , "Linen" , "V Neck" );	
		
		//Small TShirt
		System.out.println("\nSize - Small\n");
		for( int i = 0 ; i < small.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + small[i].color + "\nT-Shirt Material - " + small[i].material + "\nT-Shirt Design - " + small[i].design);
			
		}		
		
		//Medium TShirt
		System.out.println("\nSize - Medium\n");
		for( int i = 0 ; i < medium.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + medium[i].color + "\nT-Shirt Material - " + medium[i].material + "\nT-Shirt Design - " + medium[i].design);
			
		}
		
		//Large TShirt
		System.out.println("\nSize - Large\n");
		for( int i = 0 ; i < large.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + large[i].color + "\nT-Shirt Material - " + large[i].material + "\nT-Shirt Design - " + large[i].design);
			
		}
		
		//Extra-Large TShirt
		System.out.println("\nSize - Extra-Large\n");
		for( int i = 0 ; i < extraLarge.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + extraLarge[i].color + "\nT-Shirt Material - " + extraLarge[i].material + "\nT-Shirt Design - " + extraLarge[i].design);
			
		}		
		
	}
	
}