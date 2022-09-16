package day7;

public class EndsWith {

	public static void main(String[] args) {
		String[] names= {"prakash","jpsurya","surya","suryaprakash","jayaprakash"};
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("h")) {
				System.out.println(names[i]+names[i]);
			}
			else {
				System.out.println("not end with h");
			}
		}

	}

}
