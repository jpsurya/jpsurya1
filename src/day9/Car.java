package day9;

public class Car {
	String brand;
	String color;
	int price;

	public void findHighestPrice(Car[] c) {
		int max = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i].price > max) {
				max = c[i].price;
			}

		}
		System.out.println("highest price= "+max);

	}
	public void findLowerPrice(Car[] c) {
		int min=c[0].price;
		for(int i=0;i<c.length;i++) {
			if(c[i].price<min) {
				min=c[i].price;
			}
		}
		System.out.println("lowest price= "+min);
	}
}
