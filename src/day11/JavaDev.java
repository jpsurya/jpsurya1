package day11;

public class JavaDev extends Developer {
	public int exp(int exp) {
		if(exp<2&&exp>3) {
			return 230000;
		}
		else if(exp>2) {
			return 100000;
		}
		else {
			return 40000;
		}
	}

}
