package day4;

public class useBike {

	public static void main(String[] args) {
		String[] details = args[0].split(",");
		Bike b1 = new Bike();
		b1.brand = details[0];
		b1.price = Integer.parseInt(details[1]);
		b1.tax = Integer.parseInt(details[2]);
		b1.discount = Integer.parseInt(details[3]);
		b1.netPrice = b1.price + (b1.price * b1.tax / 100) * b1.discount / 100;
		System.out.println("Brand=" + b1.brand.toUpperCase() + ", price=" + b1.price + ", NetPrice=" + b1.netPrice);
		String[] details1 = args[1].split(",");
		Bike b2 = new Bike();
		b2.brand = details1[0];
		b2.price = Integer.parseInt(details1[1]);
		b2.tax = Integer.parseInt(details1[2]);
		b2.discount = Integer.parseInt(details1[3]);
		b2.netPrice = b2.price + (b2.price * b2.tax / 100) * b2.discount / 100;
		System.out.println("Brand=" + b2.brand.toUpperCase() + ", price=" + b2.price + ", NetPrice=" + b2.netPrice);

	}

}
