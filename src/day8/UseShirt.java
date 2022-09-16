package day8;

public class UseShirt {

	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		shirt1.brand="76mm";
		shirt1.price=420;
		shirt1.isChecked=true;
		Shirt shirt2=new Shirt();
		shirt2.brand="reymonds";
		shirt2.price=320;
		shirt2.isChecked=false;
		Shirt shirt3=new Shirt();
		shirt3.brand="tommy";
		shirt3.price=620;
		shirt3.isChecked=true;
		Shirt shirt4=new Shirt();
		shirt4.brand="max";
		shirt4.price=520;
		shirt4.isChecked=false;
		Shirt[] shirts=new Shirt[4];
		shirts[0]=shirt1;
		shirts[1]=shirt2;
		shirts[2]=shirt3;
		shirts[3]=shirt4;
		int min=shirts[0].price;
		int index=0;
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price<min) {
				min=shirts[i].price;
				index=index+i;
			}
		}
		String brand=shirts[index].brand;
		boolean checked=shirts[index].isChecked;
		System.out.println(brand+"="+min+" is it checked="+checked);
		//System.out.println(brand);
		//String brand=shirts[index].brand;
		if(brand.contains("a")||brand.contains("e")||brand.contains("i")||brand.contains("o")||brand.contains("u")) {
			System.out.println(brand+"=brand name has vowels");
		}
		else {
			System.out.println("not contain vowels");
		}

	}

}
