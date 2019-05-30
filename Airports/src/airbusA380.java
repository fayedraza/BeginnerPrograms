
/////////////////////////////



//Created by Fayed Raza



/////////////////////////////



public class airbusA380 extends Plane {

   

	//purpose is to get the status of a specific model of a plane (A380)

	

       final int engines = 4;

       final static int seats = 853;

	   public static int booked;

	   final int fuel= 81890;

	   public String destination;

	   String result;

	   public airbusA380(String airport, int terminal, int number, String airline,String destination,int booked) {

		   super(airport,terminal,number,airline);

		   this.destination=destination;

		   this.booked=booked;

		   

	   }

	   

	   

	   //increase seats

	   

	   public void increaseSeats(int s) {

    	   booked+=s;

    	 if(booked>seats) {

    		 booked = 853;

    	 }else {

    		 booked = booked;

    	 }

    	   }

	 

	   



	 //get the status of A380

    	public String toInfo() {

    		return(super.toTickets()  +"\n Flight " + super.number + " is haeding to " + 

    	destination + "\n There are " + booked + " seats that are booked."

    	

    				

    				

    				

    				

    				

    				

    				);

    	}

    	   

    	   

    	   

    	   

    	   

    	   

    	   

    	   

    	   

       

       

       

       

       

       

 public String getPlaneinfo() {

		return (super.toTickets() + " and this plane is an Airbus A380 \n" + "This plane has " + engines + " engines" + " and " + seats + " seats");

	}

	

}