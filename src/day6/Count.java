package day6;

public class Count {

	public static void main(String[] args) {
		int num = 2000;
		int temp = 0;
		int count=0;
		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				temp = temp + 1;
				count=count+i;
			}
			
		}
		System.out.println(temp);
		System.out.println(count);
	}
}
