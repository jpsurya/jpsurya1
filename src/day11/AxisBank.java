package day11;

public class AxisBank implements Bank {
	public int amount(int amount) {
		return amount;
	}
	public int rating(int rating) {
		return rating;
	}
	public String name(String name) {
		return name;
	}
	public String isMoneySafe(boolean isMoneySafe) {
		if(isMoneySafe) {
			return "yes";
		}
		return "no";
	}
	

}
