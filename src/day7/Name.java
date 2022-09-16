package day7;

public class Name {

	public static void main(String[] args) {
		String[] names = { "prakash ", "jpsurya ", "surya ", "suryaprakash ", "jayaprakash" };
		String temp = " ";
		for (int i = 0; i < names.length; i++) {
			char letter = names[i].charAt(i);
			temp = letter + " " + temp;
			System.out.println(names[i].charAt(i));
		}
		System.out.println(temp);
	}
}
