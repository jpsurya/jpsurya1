package day6;

public class Number {

	public static void main(String[] args) {
		int num=8;
		int temp=0;
			int	temp1=0;
			for(int i=0;i<=num;i++) {
				temp=temp+i;
				temp1=temp1+temp;
			}
			System.out.println(temp1);

	}

}
