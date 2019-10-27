////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////



package gpa;
import java.util.Scanner;
public class grades {
	public static void main(String args[]) {
		Scanner enter =  new Scanner (System.in);
		Scanner hs =  new Scanner (System.in);
		Scanner classs =  new Scanner (System.in);
		Scanner grade =  new Scanner (System.in);
		
		//purpose is to output student's current gpa
		
		//asks if you are in high school
		System.out.println("Are you in high school?");
		   String yn = hs.nextLine();
		   if(yn.equalsIgnoreCase("yes")) {
			   System.out.println("How many classes?");
			  int classes = classs.nextInt();
			
		   
			   int y=1;
			   int total = 0;
			   while(y<=classes) {
				   System.out.println("Enter grade: ");
				   Double x = grade.nextDouble();
				   total+=x;
				   y++;
				   
			   } int gpa = total/classes;
				  if (gpa>100) {
					  System.out.println("Invalid Grades");
				  }else {
			 
					  //finds gpa
			 if (gpa==100 || gpa>=93) {
				 System.out.println("GPA: 4.0 ");
			 } else if (gpa==92 || gpa>=90){
				 System.out.println("GPA: 3.7 ");
			 }else if (gpa==89 || gpa>=87){
				 System.out.println("GPA: 3.3 ");
			 }else if (gpa==86 || gpa>=83){
				 System.out.println("GPA: 3.0 ");
			 }else if (gpa==82 || gpa>=80){
				 System.out.println("GPA: 2.7 ");
			 }else if (gpa==79 || gpa>=77){
				 System.out.println("GPA: 2.3 ");
			 }else if (gpa==76 || gpa>=73){
				 System.out.println("GPA: 2.0 ");
			 }else if (gpa==72 || gpa>=70){
				 System.out.println("GPA: 1.7 ");
			 }else if (gpa==69 || gpa>=67){
				 System.out.println("GPA: 1.3 "); 
			 }else if (gpa==66 || gpa>=63){
				 System.out.println("GPA: 1.0");
			 }else if (gpa==62 || gpa>=60){
				 System.out.println("GPA: 0.7");
			 }else{
				 System.out.println("GPA: 0.0 ");
			 }
				   }  }
				   
			  else if(yn.equals("no") ) {
			   System.out.println("Come back when you are in high school.");
		   }else {
			   System.out.println(" Error ");
		   }

	}}
