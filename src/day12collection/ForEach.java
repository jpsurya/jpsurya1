package day12collection;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(45);
		num.add(65);
		num.add(67);
		num.add(32);
		num.add(43);
		//System.out.println(num);
		//num.forEach((a)->System.out.println(a));
		num.forEach((a)->
		{
		if(a>60) {
			System.out.println("he is old");
			
		}
		else {
			System.out.println(a);
		}
		}
		);
	}
}
	
		



