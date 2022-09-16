package day15ExeptionHandling;

public class Retairement {

	public static void main(String[] args){
		int age=62;
		try {
			if(age>=60) {
				//throw new Custom("ELIGIBLE FOR RETIREMENT");
			   System.out.println("ELIGIBLE");
			}
			else {
				System.out.println("NOT ELIGIBLE FOR RETAIREMENT");
			}
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
