package grades;

public class infotemplate {
     static int nos;
     static int id;
     private int age;
     private String dob;
     private String studentname;
	public infotemplate(String studentname, int age, String dob ){
		this.studentname=studentname;
		this.age= age;
		this.dob= dob;
		nos++;
		id++;
	}
	public int getamountofstudents() {
		return nos;
	}
	public int id() {
		return id;
	}
	
	public String getName() {
		return studentname;
	}
	public String getDob() {
		return dob;
	}
	public int getAge() {
		return age;
	}
	
	
} 
