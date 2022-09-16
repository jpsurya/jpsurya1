package day4;

public class Lms2 {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		float height = Float.parseFloat(args[2]);
		boolean isMale = Boolean.parseBoolean(args[3]);
		String mailId = args[4];
//		String name1 = name.toUpperCase();
		System.out.println("Name=" + name.toUpperCase() + "  Age=" + age + "  Height=" + height + "  is Male=" + isMale
				+ "  MailId=" + mailId);

	}

}
