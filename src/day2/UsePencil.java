package day2;

public class UsePencil {

	public static void main(String[] args) {
		Pencil sample1=new Pencil();
		sample1.brand="+91";
		sample1.price=1234567892;
		sample1.isBlueColour=true;
		String num=sample1.brand+sample1.price;
		System.out.println(sample1.isBlueColour+num+" "+sample1.brand+" "+sample1.price);
	
 
	}

}
