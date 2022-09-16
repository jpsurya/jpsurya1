package day11;

public class SportsBike implements Bike,Automobile {
	public int speed(int cc) {
		return cc+100;
		
	}
	public String printBrand(String brand) {
		return brand;
	}
	public int price(int price) {
		return price;
	}

}
