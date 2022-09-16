package day9;

public class UseCar {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="thar";
		c1.color="red";
		c1.price=400000;
		Car c2=new Car();
		c2.brand="hyundai";
		c2.color="black";
		c2.price=500000;
		Car c3=new Car();
		c3.brand="mahindra";
		c3.color="blue";
		c3.price=600000;
		Car c4=new Car();
		c4.brand="ford";
		c4.color="red";
		c4.price=800000;
		Car c5=new Car();
		c5.brand="maruti";
		c5.color="white";
		c5.price=900000;
		Car[] cars=new Car[5];
		cars[0]=c1;
		cars[1]=c2;
		cars[2]=c3;
		cars[3]=c4;
		cars[4]=c5;
		c3.findHighestPrice(cars);
		c3.findLowerPrice(cars);
	}

}
