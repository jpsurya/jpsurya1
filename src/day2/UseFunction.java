package day2;

public class UseFunction {

	public static void main(String[] args) {
		Function method=new Function();
		method.score();
		method.add(10, 20);
		int c=method.add1();
		System.out.println(c);
		String n=method.add3("Manoj");
		System.out.println(n);
		
	}

}
