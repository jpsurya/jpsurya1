package day8;

public class UseCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "mahindra";
		car1.price = 700000;
		car1.colour = "black";
		Car car2 = new Car();
		car2.brand = "tata";
		car2.price = 800000;
		car2.colour = "red";
		Car car3 = new Car();
		car3.brand = "hyundai";
		car3.price = 900000;
		car3.colour = "black";
		Car[] cars = { car1, car2, car3 };
		int min = cars[0].price;
		int index=0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].price < min) {
				min = cars[i].price;
                index=i;
			}
		}
		System.out.println(min - (min * 10 / 100));
        System.out.println(cars[index].brand);
	}

}
