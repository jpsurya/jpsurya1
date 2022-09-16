package day6;

public class Factorial {
	public static void main(String[] args) {
		int num=1;
		int fact=1;
		for (int i=3;i>=num;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
