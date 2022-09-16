package day14collection3;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UseAc {

	public static void main(String[] args) {
		Ac e1 = new Ac(1, "lg ", "red", 12000);
		Ac e2 = new Ac(2, "sony", "blue", 10190);
		Ac e3 = new Ac(3, "pvoltas", "white", 9000);
		Ac e4 = new Ac(4, "pcarrier", "green", 8000);
		Ac e5 = new Ac(5, "panasonic", "pink", 10080);
		HashMap<Integer, Ac> ac = new HashMap<>();
		ac.put(e1.getId(), e1);
		ac.put(e2.getId(), e2);
		ac.put(e3.getId(), e3);
		ac.put(e4.getId(), e4);
		ac.put(e5.getId(), e5);
		//System.out.println(ac);
		//List<Integer> a=ac.keySet().stream().collect(Collectors.toList());
		//a.forEach(x->System.out.println(x));
		//a.forEach(x->System.out.println(ac.get(x)));
		//List<Ac> b=ac.values().stream().collect(Collectors.toList());
		//b.forEach(x->System.out.println(x));
		//List<Ac> a=ac.values().stream().filter(x->x.getprice()>10000).collect(Collectors.toList());
		//a.forEach(x->System.out.println(x));
		
	


	}
}
