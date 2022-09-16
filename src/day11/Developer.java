package day11;

public abstract class Developer implements Human{
	abstract public int exp(int exp);
	public String eating(int a) {
		return a+"times per day";
	}
	public String sleeping(float time) {
		if (time>9.00&&time<6.00) {
			return "working time";
		}
		else if (time>6.00&&time<9.00) {
			return "playing time";
		}
		else {
			return "sleeping time";
		}
	}

}
