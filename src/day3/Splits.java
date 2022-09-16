package day3;

public class Splits {

	public static void main(String[] args) {
		String name = "jayap,rak.ash";
		String[] strings = name.split("\\p{Punct}");
		System.out.println(strings[1]);
		System.out.println(strings[strings.length - 1]);
	}

}
