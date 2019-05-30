
////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////




package calculator;
import java.util.Scanner;
public class calculatormain {
	public static void main(String args[]) {
		
		//purpose is to make a four function calculator
		String  word;
		int n = 0;
		
		Scanner input = new Scanner (System.in);
		Scanner number = new Scanner (System.in);
		Scanner  number2 = new Scanner (System.in);
	System.out.println("                Welcome                       ");
	System.out.println("                                              ");
	
	//asks what function
	System.out.println("     What do you want to do today?  (Only Enter Addition, Subtraction, Multipication, or Division)          ");
	
	  
	//switch statement
	switch (input.nextLine()) {
	case "Addition":
		System.out.println("       Type in the first number:                   ");
		                             double fnum;  
		                          fnum = number.nextDouble();
		System.out.println("       Type in the second number:                   ");
		                             double snum;  
		                          snum = number.nextDouble();
		                          double result = fnum + snum;
	                         System.out.println(result);
		                             
		break;
	case "Subtraction":
		System.out.println("       Type in the first number:                   ");
        double fnum2;  
     fnum2 = number.nextDouble();
System.out.println("       Type in the second number:                   ");
        double snum2;  
     snum2 = number.nextDouble();
     double result2 = fnum2 - snum2;
    System.out.println(result2);
    System.out.println("      What do you want to do next?             ");
		break;
	case "Multiplication":
		System.out.println("       Type in the first number:                   ");
        double fnum3;  
     fnum3 = number.nextDouble();
System.out.println("       Type in the second number:                   ");
        double snum3;  
     snum3 = number.nextDouble();
     double result3 = fnum3 + snum3;
System.out.println(result3);
		break;
	case "Divide":
		System.out.println("       Type in the first number:                   ");
        double fnum4;  
     fnum = number.nextDouble();
System.out.println("       Type in the second number:                   ");
        double snum4;  
     snum = number.nextDouble();
     double result4 = fnum + snum;
System.out.println(result4);
		break;
		default: 
			System.out.println("  Error! Not Acceptable Method.   ");
			break;
	}
} 
}