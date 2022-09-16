package day4;

public class UseCar {

	public static void main(String[] args) {
		String[] car = args[0].split(",");
		Car car1 = new Car();
		car1.brand = car[0];
		car1.price = Integer.parseInt(car[1]);
		car1.tax = Integer.parseInt(car[2]);
		car1.discount = Integer.parseInt(car[3]);
		int netPrice = (car1.price + car1.tax) - car1.discount;
		System.out.println("brand=" + car1.brand.toUpperCase() + ", Price=" + car1.price + ", Net Price=" + (netPrice));
		String[] cars = args[1].split(",");
		Car car2 = new Car();
		car2.brand = cars[0];
		car2.price = Integer.parseInt(cars[1]);
		car2.tax = Integer.parseInt(cars[2]);
		car2.discount = Integer.parseInt(cars[3]);
		int netPrice1 = (car2.price + car2.tax) - car2.discount;
		System.out
				.println("brand=" + car2.brand.toUpperCase() + ", Price=" + car2.price + ", Net Price=" + (netPrice1));
		String[] details = args[2].split(",");
		Car car3 = new Car();
		car3.brand = details[0];
		car3.price = Integer.parseInt(details[1]);
		car3.tax = Integer.parseInt(details[2]);
		car3.discount = Integer.parseInt(details[3]);
		car3.netPrice = car3.price + car3.tax - car3.discount;
		System.out.println("brand=" + car3.brand.toUpperCase() + ", price=" + car3.price + ", Net Price=" + netPrice);

	}

}
