
////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////



public class flighttest {

	public static void main(String[] args) {

		

		/// purpose is to test the two programs out

		

		Plane p1 = new airbusA380("EWR", 23, 546, "UNITED Express ", "PHL", 45);

		

		

		p1.speedUp(495);

		p1.speedUp(100);

		p1.slowdown(13);

		

		

		

		((airbusA380) p1).increaseSeats(10);

		  System.out.println(((airbusA380) p1).toInfo());

		  

		  

	       

		

		 

		

}

}



