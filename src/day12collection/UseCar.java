package day12collection;

import java.util.ArrayList;

public class UseCar {

	public static void main(String[] args) {
		Car c1=new Car("thar",1200000,"red");
		Car c2=new Car("hundai",1100000,"black");
		Car c3=new Car("swift",1000000,"white");
		Car c4=new Car("mahindra",1400000,"white");
		Car c5=new Car("maruti",1300000,"pink");
		Car c6=new Car("jeep",1900000,"WHiTe");
		ArrayList<Car> car=new ArrayList<>();
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		car.add(c5);
		car.add(c6);
        car.add(new Car("jaguar",300000,"orange"));
        ArrayList<String> ca=new ArrayList<>();
        ArrayList<Car> cab=new ArrayList<>();
        for(Car c:car) {
        	if(c.getColor().equalsIgnoreCase("white")&&c.getBrand().length()%2==0){
        	ca.add(c.getBrand());
        }
        	else {
        		cab.add(c);
        	}
	}
        System.out.println(ca);
        System.out.print(cab);

}
}
//(durgasoft,telusko)