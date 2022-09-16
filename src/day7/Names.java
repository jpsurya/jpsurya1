package day7;

public class Names {

	public static void main(String[] args) {
		String[] names= {"prakash ","jpsurya ","surya ","suryaprakash ","jayaprakash"};
		//String[] names1=names[0].split(",");
		String temp=" ";
		for(int i=0;i<names.length;i++) {
			temp=temp+names[i]+",";
			System.out.println(names[i]);
		}
		System.out.println(temp);
		

	}

}
