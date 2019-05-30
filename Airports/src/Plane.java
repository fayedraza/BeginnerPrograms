
/////////////////////////////

//Created by Fayed Raza

/////////////////////////////



public class Plane {

  

	public String airport;

	public int number;

	public String airline;

	public int terminal;

	public  int speed;

	

	//purpose is to create tickets and status of plane

	

	public Plane(String airport, int terminal, int number, String airline) {

		

		this.airport=airport;

		this.terminal=terminal;

		this.number=number;

		this.airline=airline;

	}

	

	//increase speed

	public  void speedUp(int s) {

		speed+=s;

	}

	

	//decrease speed

	public  void slowdown(int s) {

		speed-=s;

	}

	

	//get the value of speed

	public  void getspeed(int s) {

		speed=s;

	}

	

	

	//print ticket

	public String toTickets() {

		return ("Flight " + number +" is at " + airport + "\n Current speed is " + speed + " miles per hour");

	}



	

	}











	


	
	
	
	
	
	
	

