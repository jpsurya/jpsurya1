package day9;

public class UseBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.brand="honda";
		b.price=60000;
		b.color="blue";
		Bike b1=new Bike();
		b1.brand="hero";
		b1.price=70000;
		b1.color="blue";
		Bike b2=new Bike();
		b2.brand="pulsur";
		b2.price=90000;
		b2.color="black";
		Bike b3=new Bike();
		b3.brand="bajaj";
		b3.price=50000;
		b3.color="green";
		Bike[] bikes= {b,b1,b2,b3};
		b3.color(bikes);

	}

}
