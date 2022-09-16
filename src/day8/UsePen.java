package day8;

public class UsePen {

	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.brand = "reynolds";
		pen1.price = 20;
		pen1.color = "blue";
		pen1.isrefil = true;
		Pen pen2 = new Pen();
		pen2.brand = "reynolds";
		pen2.price = 20;
		pen2.color = "blue";
		pen2.isrefil = true;
		Pen pen3 = new Pen();
		pen3.brand = "cello";
		pen3.price = 30;
		pen3.color = "red";
		pen3.isrefil = false;
		Pen pen4 = new Pen();
		pen4.brand = "trymax";
		pen4.price = 40;
		pen4.color = "black";
		pen4.isrefil = true;
		Pen pen5 = new Pen();
		pen5.brand = "gel";
		pen5.price = 10;
		pen5.color = "bLue ";
		pen5.isrefil = false;
		Pen[] pens = { pen1, pen2, pen3, pen4, pen5 };
		int count = 0;
		String brand="";
		for (Pen p : pens) {
			if (p.color.equalsIgnoreCase("blue")) {
				count = count + 1;
				brand=p.brand;
				System.out.println(brand);
			}
		}
		System.out.println(count);
	}
}
