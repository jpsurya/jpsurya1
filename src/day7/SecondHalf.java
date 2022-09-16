package day7;

public class SecondHalf {

	public static void main(String[] args) {
		int[] ages = { 27, 24, 23, 24, 25, 24, 26, 27, 25 };
		for (int i = ages.length / 2; i < ages.length; i++) {
			System.out.println(ages[i] + " ");
		}
		 System.out.print(" ");
		 for(int i=ages.length-1;i>ages.length/2;i--) {
			 System.out.print(ages[i]+" ");
		 }

	}

}
