package day12collection;

import java.util.ArrayList;

public class Even {

	public static void main(String[] args) {
		ArrayList<String> t=new ArrayList<>();
		t.add("neem");
		t.add("banyan");
		t.add("palm");
		t.add("teak");
		t.add("coconut");
		ArrayList<String> et=new ArrayList<>();
		for(int i=1;i<t.size();i++) {
			if(i%2==0) {
				et.add(t.get(i));
				
			}
		}
		//System.out.println(et);
		ArrayList<String> ett=new ArrayList<>();
		for(String e:t) {
			if(e.length()%2==0) {
				ett.add(e);
				
			}
		}
		System.out.println(ett);
         
	}

}
