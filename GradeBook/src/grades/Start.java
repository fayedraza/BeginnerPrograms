package grades;

public class Start {
  public static void main(String [] _a) {
	  infotemplate student1class1 = new grades("Fayed Raza", 13, "07/18/01",80,"History");
	  infotemplate student1class2 = new grades("Fayed Raza", 13, "07/18/01",80,"Math");
	  System.out.println(student1class1.getName());
	  System.out.println(((grades) student1class1).curveGrade(5,"History"));
	        
  }
}
