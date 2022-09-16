package day2;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.name = "redmi";
		m1.model = "note5";
		m1.price = 8000;
		m1.ram = 4;
		Mobile m2 = new Mobile();
		m2.name = "samsung";
		m2.model = "galaxynote5";
		m2.price = 12000;
		m2.ram = 8;
		Mobile realme = new Mobile();
		realme.name = "realme";
		realme.price = 11000;
		realme.model = "c25y";
		realme.ram = 6;
		System.out.println(realme.name + " " + realme.model + " " + realme.price + " " + realme.ram);
		System.out.println(m1.name + " " + m1.model + " " + m1.price + " " + m1.ram);
		System.out.println(m2.name + " " + m2.model + " " + m2.price + " " + m2.ram);
		int price = m1.price + m2.price+realme.price;
		System.out.println(price);
	}

}
