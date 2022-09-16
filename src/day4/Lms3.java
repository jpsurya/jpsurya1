package day4;

public class Lms3 {
	public static void main(String[] args) {
		String[] details = args[0].split(",");
		String name = details[0];
		int age = Integer.parseInt(details[1]);
		float height = Float.parseFloat(details[2]);
		boolean isPresent = Boolean.parseBoolean(details[3]);
		System.out.println(
				"Name =" + name + "," + " Age =" + age + "," + " Height =" + height + "," + " IsPresent =" + isPresent);

	}

}
