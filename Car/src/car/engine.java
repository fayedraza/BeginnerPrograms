package car;

public class engine extends car{
   public int speed;
   public boolean status;
   public boolean drive;
   public boolean park;
	
   public engine(int speed, boolean status, boolean drive, boolean park)
   {
	   this.speed=speed;
	   this.status=status;
	   this.drive=drive;
	   this.park=park;
	   
	   
	   
   }
  public boolean getStatus() {
	  return this.status;
  }
  public boolean getPark() {
	  return this.park;
  }
   
  public boolean getDrive() {
	  return this.drive;
  }
   
	
   
   
   public  void speedUp(int s) {
		speed+=s;
	}
	public  void slowdown(int s) {
		speed-=s;
	}
	
	
	
	
	
	
	
	
}
