package day11;

public abstract class Furniture {
	abstract public String brand(String brand);
	public String durability(String name) {
		if (name.equals("wood")) {
			return "break easily";
		}
		else if(name.equals("plastic")) {
			return"durable";
		}
		else {
			return "fragile";
		}
	}
		

}
