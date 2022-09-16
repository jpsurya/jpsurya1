package day15ExeptionHandling;

public class Num {

	public static void main(String[] args) {
		try {
			String a="prakash";
			int b=Integer.parseInt(a);
			System.out.println(b);
		}catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("INVALIDS");
		}
		

	}

}
