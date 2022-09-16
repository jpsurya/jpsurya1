package day7;

public class Startwith {

	public static void main(String[] args) {
		String[] names= {"prakash","jpsurya","surya","suryaprakash","jayaprakash"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("j")) {
				count=count+1;
				System.out.println(names[i]+names[i]);
			}
			else {
				System.out.println("not start with j");
			}
		}
		System.out.println(count);
		

	}

}
