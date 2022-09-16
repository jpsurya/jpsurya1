package day15ExeptionHandling;

public class Checkbrands {

	public static void main(String[] args)throws CheckBrand {
		String[] brands= {"ligra","twills","70mm","vanheusan","parkinson"};
		
		try {
			String name="ligra";
			for(int i=0;i<brands.length;i++) {
				if(brands[i].equalsIgnoreCase(name)) {
					System.out.println("FOUND");
				}
				else {
					//System.out.println("FOUND");
					throw new CheckBrand("NOTFOUND");

				}
			}
						
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
