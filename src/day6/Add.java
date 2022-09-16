package day6;

public class Add {

	public static void main(String[] args) {
		int num=12357;
		int temp=0;
		for (;num>0;) {
			int remainder=num%10;
			temp+=remainder;
			//temp=temp+remainder;
			num/=10;
			//num=num/10;
		}
		System.out.println(temp);

	}

}
