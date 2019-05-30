package car;

public class fuel extends car {
   public int fuel = 500;
   public int miles;
	public boolean status;
	
	public boolean getStatus() {
	   if(fuel == 0) {
		   return false;
	   }else {
		   return true;
	   }
	}
	
	public void decreaseFuel(int x) {
		miles=x;
		
		fuel-=miles;
	}
	
	public void increaseFuel(int x) {
		
		
		fuel+=x;
		if(x>500) {
			fuel=500;
		}else {
			fuel=fuel;
		}
	}
	
	
	
	
}
