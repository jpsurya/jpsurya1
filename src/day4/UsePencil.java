package day4;

public class UsePencil {

	public static void main(String[] args) {
		pencil p1 = new pencil();
		p1.brand = args[0];
		p1.price = Integer.parseInt(args[1]);
		p1.colour = args[2];
		p1.quantity = Integer.parseInt(args[3]);
		p1.size = Float.parseFloat(args[4]);
		System.out.println("brand=" + p1.brand + ", price=" + p1.price + ", colour=" + p1.colour.toUpperCase() + ", quantity=" + p1.quantity
				+ ", size=" + p1.size);

	}

}
