package day4;

public class Lms {
	public static void main(String[] args) {
		String name = args[0];
		int rollNo = Integer.parseInt(args[1]);
		int age = Integer.parseInt(args[2]);
		boolean isPresent = Boolean.parseBoolean(args[3]);
		String mailId = args[4];
		System.out.println("name= " + name + " ,rollno= " + rollNo + " ,age= " + age + " ,isPresent= " + isPresent
				+ " ,mailId= " + mailId);
		int result=rollNo+age;
		System.out.println(result);

	}

}
