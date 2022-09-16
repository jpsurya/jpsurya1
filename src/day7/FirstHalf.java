package day7;

public class FirstHalf {

	public static void main(String[] args) {
		int[] ages = { 27, 24, 23, 24, 25, 24, 26, 27, 25 };
		for (int i = 0; i < ages.length / 2; i++) {
			System.out.println(ages[i] + " ");
		}
		 System.out.print(" ");
		 for(int i=ages.length/2-1;i>0;i--) {
			 System.out.print(ages[i]+" ");
		 }

	}

}
