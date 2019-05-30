package words;
import java.util.Scanner;
public class list {
	public static void main(String args[]) {//String word[];
		Scanner quest = new Scanner(System.in);
		Scanner amount = new Scanner(System.in);
		Scanner letters = new Scanner(System.in);
		Scanner tense = new Scanner(System.in);
		
		System.out.println("How many verbs?");
		   int words = amount.nextInt();
		
		   String[] wd = new String[words];
		   int x=0;
		 while(x<words) { 
			   System.out.println("Enter a verb: ");
			 wd[x]= letters.nextLine();
			 
			    x++;
			 
			    }
				
			System.out.println("Great! Now type in \"past\" if you want past tense, \"future\" if you want in future tense, or \"present\" if you want in present tense. (lowercase letters only)");
		     String form = tense.nextLine();
		 
		     if(form.equals("present"))
		     {setPresent(wd);
		    	for(String f: wd) {
		    		 System.out.println(f);
		    	}
		    	 
		     }else if(form.equals("past")) {
		    	setPast(wd);
		    	for(String f: wd) {
		    		 System.out.println(f);
		    	}
		     }else if(form.equals("future")) {
		    	 setFuture(wd);
			    	
		     }else {
		    	 System.out.println("Error");
		     }
		 
		 
		 
			    
			    }

	public static void setPresent(String y[]) {
		for(int x=0;x<y.length;x++) {
			y[x]+="";}
	}

	public static void setPast(String y[]) {
		for(int x=0;x<y.length;x++) {
			y[x]+="ed";
			
	}}
		public static void setFuture(String y[]) {
			String will = "will ";
			for(int x=0;x<y.length;x++) {
				String h = will + y[x];
				System.out.println(h);
		   
	          

}}}

	
		
	
	
			