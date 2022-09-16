package Day5;

public class CheckGrade {

	public static void main(String[] args) {
		int mark = 90;
		if (mark > 0 && mark <= 40) {
			System.out.println("E grade");
		} else if (mark > 40 && mark <= 60) {
			System.out.println("C grade");
		} else if (mark > 60 && mark <= 80) {
			System.out.println("B grade");
		} else {
			System.out.println("jp got A grade");
		}
	}

}
