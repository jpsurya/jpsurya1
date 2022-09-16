package day8;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop lap1 = new Laptop();
		lap1.brand = "dell";
		lap1.price = 300000;
		lap1.color = "black";
		lap1.istouch = true;
		Laptop lap2 = new Laptop();
		lap2.brand = "hp";
		lap2.price = 400000;
		lap2.color = "blue";
		lap2.istouch = false;
		Laptop lap3 = new Laptop();
		lap3.brand = "hcl";
		lap3.price = 500000;
		lap3.color = "red";
		lap3.istouch = true;
		Laptop[] laps = { lap1, lap2, lap3 };
		for (int i = 0; i < laps.length; i++) {
			if (laps[i].istouch == true) {
				String brand = laps[i].brand;
				int cost = laps[i].price;
				System.out.println( brand+" "+cost);
			} 
			}
		}

	

}
