package day9;

public class FindMax {
	public void FindMaximum(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a+"=is maximum");
		}
			else if (b>c&&b>a) {
				System.out.println(b+"=is maximum");
			}
			else {
				System.out.println(c+"=is maximum");
			}
		
	}

}
