package day7;

public class maxString {

	public static void main(String[] args) {
		String[] names = { "prakash ", "jpsurya ", "surya ", "suryaprakash", "jayaprakashh" };
		int max = 0;
		String temp = " ";
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length();
				temp = names[i];
			}
		}
		System.out.println(max);
		System.out.println(temp);
	}

}
