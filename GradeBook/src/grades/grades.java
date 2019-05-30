package grades;

public class grades extends infotemplate {
	
      private int grade;
      private String clas;
	public grades(String studentname, int age, String dob,int grade, String clas) {
		super(studentname, age, dob);
		this.grade=grade;
		this.clas=clas;
	}
     
	public String curveGrade(int x, String r ) {
		int y= grade;
		grade = x + grade;
		int dif = grade - y;
		return "Congrats your grade went from " + y + " to " + grade + " by " + dif +" points " + "in " + r;
	}
	
	
	
	
	
	
}
