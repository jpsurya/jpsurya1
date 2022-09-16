package Day5;

public class Strings {

	public static void main(String[] args) {
		String name1 = "prakash";
		String name2 = "surya";
		String name3 = "PRAKASH";
		String name4 = "jayapraksh";
//		startsWith
		if (name1.startsWith(name2)) {
			System.out.println(name1 + "  starts with name2");

		} else {
			System.out.println(name1 + " not starts with name2");
		}
//		endsWithh
		if (name1.endsWith("ash")) {
			System.out.println(name1 + " end with ash");

		} else {
			System.out.println(name1 + " not end with ash");
		}
//		equals
		if (name1.equals(name3)) {
			System.out.println(name1 + "yes it is equal");
		} else {
			System.out.println("not eqaul");
		}
//		equalIgnoreCase
		if (name1.equalsIgnoreCase(name3)) {
			System.out.println("yes it equal");
		} else {
			System.out.println("not equal");
		}
//		contains
		if (name4.contains("a") || name4.contains("i")) {
			System.out.println("it contain");
		} else {
			System.out.println("not contain");
		}
	}

}
