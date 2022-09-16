package day9;

public class Bike {
	String brand;
	int price;
	String color;
	public void color(Bike[] bikes) {
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].color.equalsIgnoreCase("blue")) {
				System.out.println(bikes[i].brand);
			}
		}
		
		
	}

}
