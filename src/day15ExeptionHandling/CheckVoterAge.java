package day15ExeptionHandling;

public class CheckVoterAge {

	public static void main(String[] args)throws Custom,Exception {
		 int age=23;
		 try {
			 if(age>=18) {
				 throw new Custom("ELIGIBLE");
			 }
			 else {
				 System.out.println("NOT ELIGIBLE");
			 }
		 }catch(Exception e) {
			// System.out.println(e);
		 e.printStackTrace();
		 }

	}

}
