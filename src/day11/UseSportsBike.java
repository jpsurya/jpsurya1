package day11;

public class UseSportsBike {

	public static void main(String[] args) {
		SportsBike bike=new SportsBike();
		System.out.println(bike.speed(10));
        System.out.println(bike.printBrand("yamaha"));
        System.out.println(bike.price(2000));
	}

}
