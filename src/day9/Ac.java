package day9;

public class Ac {
	String brand;
	String color;
	int price;
	boolean is5star;

	// int tax;
	public void findNetPrice(Ac ac[], int tax) {
		for (int i = 0; i < ac.length; i++) {
			int netPrice = ac[i].price + (ac[i].price * tax / 100);
			System.out.println(netPrice);
		}
	}
}
