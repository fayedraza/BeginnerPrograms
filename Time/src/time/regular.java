package time;

public class regular {
 private int hour;
 private int min;
 private String y;
 
	
public void setTime(int h, int m, String x)	{
	

	   min = m;
	   hour = h;
	   y = x;
	
}
public void toset(int h, int m, String x)	{	
	if(x.equals("AM")) {	
		 min = m;
		   hour = h;
		   y = x;
	}else {
		 min = m;
		   hour = h + 12;
		   y = x;
	}}


public String totime() {
	return String.format("%2d:%02d %s", hour, min,y);
}
	
	
	
	
	
}
