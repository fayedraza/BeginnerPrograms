package id;

public class info {
	public static void main(String []args) {
		
		idmaker id = new idmaker();
		idmaker spy = new idmaker();
		idmaker spy2 = new idmaker();
		id.makeid("Fayed Raza","7/18/01", 436475834);
	
		System.out.println(id.toCard());
		
		System.out.println();
	
		
		spy.makeid("unknown unknown", 436475834);
		System.out.println(spy.toCard());
		
	}
}

