package id;

public class idmaker {
     private String name;
     private String DOB;
     private String id2;
	
     public void makeid(String n,  int id)  {
    	  
 		
         
    	 name = "Name: " + n;
		
		id2 = "Id Number: " + id;
		
	}
     
     
     
     public void makeid(String n, String dob, int id)  {
  
		
     
    	 name = "Name: " + n;
		DOB = "Date: " + dob;
		id2 = "Id Number: " + id;
		
	}
	public String toCard() {
		return String.format("%s\n%s\n%s", name, DOB, id2);
		
	}
}
