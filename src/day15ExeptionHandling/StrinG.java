package day15ExeptionHandling;

public class StrinG {

	public static void main(String[] args) {
		try {
			String a="surya";
			char b=a.charAt(5);
			System.out.println(b);
		}catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("STRING ERROR");
		}

	}

}
