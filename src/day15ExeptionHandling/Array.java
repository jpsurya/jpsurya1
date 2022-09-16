package day15ExeptionHandling;

public class Array {

	public static void main(String[] args) {
		try {
			int[] a= {12,13,14};
			System.out.println(a[3]);
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("INVALID");
		}
	}

}
