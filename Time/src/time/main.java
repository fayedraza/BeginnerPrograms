package time;

public class main {
  public static void main(String []args) {
	  regular test = new regular();
	
	  test.setTime(6, 2, "PM");
	   
	  System.out.print(test.totime());
	  System.out.println();
	  
	  //xenomorph.set(6, 2, "PM");
	 test.toset(6, 2, "AM");
	 System.out.println(test.totime());
	  
  }
}
