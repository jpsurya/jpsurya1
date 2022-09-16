package day13HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UsePlayer {

	public static void main(String[] args) {
		Player p6 = new Player("dk", 31, 121, 4, "kkr");
		Player p1 = new Player("dhoni", 40, 183, 7, "csk");
		Player p2 = new Player("kholi", 29, 111, 18, "rcb");
		Player p3 = new Player("raina", 34, 98, 12, "gl");
		Player p4 = new Player("jadeja", 28, 88, 8, "csk");
		Player p5 = new Player("jp", 27, 199, 5, "csk");
		HashMap<Integer, Player> p = new HashMap<>();
		p.put(p1.getNum(), p1);
		p.put(p2.getNum(), p2);
		p.put(p3.getNum(), p3);
		p.put(p4.getNum(), p4);
		p.put(p5.getNum(), p5);
		p.put(p6.getNum(), p6);
		
		  System.out.println(p); 
		  System.out.println(p.values());
		  for(Integer pl:p.keySet()) { System.out.println(p.get(pl)); }
		  System.out.println("**********************LAMBDA*************");
		  p.keySet().forEach((x)->System.out.println(p.get(x)));
		  
		  
		  System.out.println("**********************EVENPLAYER*******************");
		  HashMap<Integer,Player> c=new HashMap<>(); for(Integer k:p.keySet()) {
		  if(k%2==0) { c.put(k,p.get(k));
		  
		  }
		  
		  }
		 
		HashMap<Integer, Player> n = new HashMap<>();
		// c.forEach((x,y)->System.out.println(y));
		p.forEach((m, l) -> {
			if (l.getAge() > 30) {
				n.put(m, l);
			}

		});
		n.forEach((a, b) -> System.out.println(b));
		HashMap<Integer, Player> h = new HashMap<>();
		p.keySet().forEach(o -> {
			if (p.get(o).getAge() > 30)
				h.put(o, p.get(o));
		});
		h.forEach((a, b) -> System.out.println(b.getName()));
		Iterator<Integer> num = p.keySet().iterator();
		while (num.hasNext()) {
			System.out.println(num.next());
		}
		Iterator<Player> num1 = p.values().iterator();
		HashMap<Integer, Player> jp = new HashMap<>();
		while (num1.hasNext()) {
			if (num1.next().getAge() > 30) {
				num1.remove();
				System.out.println(p);
			}
		}
		System.out.println(p);
		int a=.hashCode();
		System.out.println("Hashcode=="+a);
	}
}