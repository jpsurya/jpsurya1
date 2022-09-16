package day7;

public class Temperature {

	public static void main(String[] args) {
		int[] temp= {-12,12,-23,32,-21,-34,24,54};
	int	negativecount=0;
	int positivecount=0;
	for(int i=0;i<temp.length;i++) {
		if(temp[i]>0) {
			positivecount=positivecount+1;
			System.out.println(temp[i]+" is positive");
		}
		else {
			negativecount=negativecount+1;
			System.out.println(temp[i]+" is negative");
		}
	}
	System.out.println("number of positive temp "+positivecount);
	System.out.println("number of negative temp "+negativecount);
	}

}
