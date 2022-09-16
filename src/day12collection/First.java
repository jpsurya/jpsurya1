package day12collection;

import java.util.ArrayList;

public class First {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("praksh");
		name.add("hari");
		name.add("lokesh");
		name.add("jpsurya");
		System.out.println(name);
		System.out.println("***********after removing*********");
		name.remove(1);
		System.out.println(name);
		System.out.println("**************after updating*************");
		name.set(1, "hariHaran");
		name.set(2, "loki");
		System.out.println(name);
		name.set(1, "jpsurya");
		name.add("surya");
		name.add("surya");
		name.add("jp");
		name.add(1,"jaguar");
		System.out.println(name + name.get(2) + " " + "size= " + name.size());
		ArrayList<Integer> num = new ArrayList<>();
		num.add(45);
		num.add(65);
		num.add(67);
		num.add(32);
		num.add(43);
		System.out.println(num);
		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) > 60) {
				System.out.println("he is old");
			} else {
				System.out.println("he is young");

			}
		}
		for (int i = 0; i < name.size(); i++) {
			if (name.get(i).equalsIgnoreCase("surya")) {
				char letter = name.get(i).charAt(0);
				//System.out.println(name.indexOf(num.get(2)));
				System.out.println(letter);

			} else {
				System.out.println(name.get(i));
			}
		}
	}

}