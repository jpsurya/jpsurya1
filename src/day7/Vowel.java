package day7;

public class Vowel {

	public static void main(String[] args) {
		String[] names= {"prakash ","jpsurya ","surya ","suryaprakash ","jayaprakash"};
			int count=0;
			for(int i=0;i<names.length;i++) {
				String a=names[i].toUpperCase();
			if(a.contains("A")||a.contains("E")||a.contains("I")||a.contains("O")||a.contains("U")) {
			count=count+1;	
			System.out.println(names[i]+"present");
			}
			else {	
			System.out.println(names[i]+"not present");
			}
		}
			System.out.println(count);

	}
}
