package day13HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseCar {

	public static void main(String[] args) {
		Car c1=new Car("thar",20000000,"tn20","red");
		Car c2=new Car("hundai",1300000,"tn21","white");
		Car c3=new Car("tharcar",1500000,"tn22","black");
		HashMap<String,Car> c=new HashMap<>();
		c.put(c1.getCarNo(), c1);
		c.put(c2.getCarNo(), c2);
		c.put(c3.getCarNo(), c3);
	/*    Car name=c1;
		int max=0;
		for(Car ca:c.values()) {
			if(ca.getPrice()>max) {
				max=ca.getPrice();
				name=ca;
			}
		}
		System.out.println(name);
		Iterator<Car> carss=c.values().iterator();
		while(carss.hasNext()) {
			if(carss.next().getColor().equalsIgnoreCase("red")) {
				carss.remove();
			}
		}
		//System.out.println(c);
		Iterator<Car> it=c.values().iterator();
		while(it.hasNext()) {
			if(it.next().getBrand().equalsIgnoreCase("thar")) {
				it.remove();
			}
		}
		System.out.println(c);
		c.forEach((x,y)->System.out.println(x+"="+y));*/
		Iterator<String> t=c.keySet().iterator();
		while(t.hasNext()) {
			if(c.get(t.next()).getColor().equalsIgnoreCase("white")) {
				t.remove();
			}
		}
		//System.out.println(c);
		
		//c.forEach((x,y)->System.out.println(x+"="+y));
          for(String z:c.keySet()) {
        	  System.out.println(c.get(z));
          }
	}

}
