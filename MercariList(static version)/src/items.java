import java.text.NumberFormat;

public class items  {
	 static double total = 0.0;
	static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	 public static void add(String item, double  x) {
		 total+=x;
		 toString(item, total);
	 }
	 

 public static void toString(String item, double  x) {





	System.out.println( "After " + item + " was added, the total is " + formatter.format(x));

    System.out.println();

	}	
	
	
	
	
	
	
	
}
