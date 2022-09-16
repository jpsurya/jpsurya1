package day10;

public class UsePen {

	public static void main(String[] args) {
		Rifill r=new Rifill("reynolds","red");
		Pen p=new Pen("cello",10,r);
		System.out.println(p.rifill.brand);
		

	}

}
