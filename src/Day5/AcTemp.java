package Day5;

public class AcTemp {

	public static void main(String[] args) {
		int temp = 19;
		if (temp > 16 || temp <= 18) {
			System.out.println(temp + " is verry cool");
		} else if (temp > 18 || temp <= 20) {
			System.out.println(temp + " is cooling");
		} else {
			System.out.println(temp + " normal");
		}

	}

}
