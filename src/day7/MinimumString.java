package day7;

public class MinimumString {

	public static void main(String[] args) {
		String[] names = { "prakash ", "jpsurya ", "surya ", "suryaprakash", "jayaprakashh" };
		int min = names[0].length();
		String temp = " ";
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= min) {
				min = names[i].length();
				temp = names[i];
			}
		}
		System.out.println(min);
		System.out.println(temp);

	}

}
