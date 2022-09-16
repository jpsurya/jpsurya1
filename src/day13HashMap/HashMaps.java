package day13HashMap;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> c = new HashMap<>();
		c.put(785, "asokan");
		c.put(786, "hari");
		c.put(787, "jpsurya");
		c.put(789, "rajkumar");
		c.put(788, "saravanan");
		c.put(790, "lokesh");
		System.out.println("***************allvalues************");
		System.out.println(c);
		System.out.println("**************usingget******************");
		System.out.println(c.get(787));
		System.out.println("***********size**********");
		System.out.println(c.size());
		System.out.println("**************USING KEYSET**************");
		System.out.println(c.keySet());
		System.out.println("***********************USING VALUES**************");
		System.out.println(c.values());
		c.remove(788);
		System.out.println("********************AFTER REMOVE**************");
		System.out.println(c);
		System.out.println(c.putIfAbsent(787, "jpsurya"));
		System.out.println(c);
		System.out.println("********************FOR ENANCED*************");
		for (Integer v : c.keySet()) {
			System.out.print(v);
		}
		for (String k : c.values()) {
			System.out.println(k + " ");
		}
		for (Integer e : c.keySet()) {
			System.out.println(e+" "+c.get(e));
		}
		System.out.println("*******************FOREACH*****************");
		c.values().forEach((x) -> System.out.println(x));
		c.keySet().forEach((x) -> System.out.println(x));
		c.forEach((x, y) -> System.out.println(x+"="+y));
		c.keySet().forEach((x) -> System.out.println(c.get(x)));
	}
	
}
