package day2;
//Bean class 
public class Function {
//Method 1 void without parameter
	public void score() {
		int kabil=100;
		int surya=70;
		
		System.out.println(surya+kabil);
	}
	//Method 2 void with parameter
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	//Method 3 return type without parameter
	public int add1() {
		int a=10;
		int b=20;
		return a+b;
		
	}
	
	//Method 4 return type with parameter
	public String add3(String name) {
		return name;
		
	}

}
