package day15ExeptionHandling;

public class Nullpoint {

	public static void main(String[] args) {
	try {
		String a=null;
	int b=a.length();
	System.out.println(b);
	
	
	}catch(NullPointerException e){
		//e.printStackTrace();
	  System.out.println(e);
	}finally {
		System.out.println("INVALID");
	}
	}

}
