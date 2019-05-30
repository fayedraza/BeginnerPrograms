////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////


import java.text.NumberFormat;

public class items {
	
	//purpose is to print the amount after an item is added
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	private String name;
       private double price;
       static int items = 0;
       static double total = 0.0;
       
       //declares an item
	public items(String name, double price) {
		this.name = name;
		this.price = price;
		  items++;
		  total+=price;
		  toString(name,total);
		  
	}
	
	//gets the item
	public int getItems() {
		return items;
	}
	 
//prints final result
 public void toString(String item, double  x) {





	System.out.println( "After " + item + " was added, the total is " + formatter.format(x));

    System.out.println();

	}	
	
	
	
	
	
	
	
}
