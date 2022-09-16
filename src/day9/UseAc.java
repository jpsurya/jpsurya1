package day9;

public class UseAc {

	public static void main(String[] args) {
		Ac a1 = new Ac();
		a1.brand = "croma";
		a1.color = "blue";
		a1.price = 30000;
		a1.is5star = true;
		// a1.tax=15;
		Ac a2 = new Ac();
		a2.brand = "sony";
		a2.color = "black";
		a2.price = 20000;
		a2.is5star = false;
		// a2.tax=15;
		Ac a3 = new Ac();
		a3.brand = "panasonic";
		a3.color = "white";
		a3.price = 40000;
		a3.is5star = true;
		// a3.tax=14;
		Ac   acs[]  = { a1, a2, a3 };
		a1.findNetPrice(acs, 15);

	}

}
