package day6;

public class AddOdd {
	public static void main(String[] args) {
		int num = 75;
		int temp = 0;
		for (int i = 15; i <= num; i++) {
			if (i % 2 != 0) {
				temp =temp+i;	
			}
		}
		System.out.println(temp);
	}
}
