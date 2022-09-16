package day11;

public class UseChair {

	public static void main(String[] args) {
		Chair chair=new Chair();
		System.out.println("brand="+chair.brand("jpChairs"));
		System.out.println("Strength="+chair.durability("plastic"));
	}

}
