package day7;

public class EvenOdd {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evencount=evencount+1;
				System.out.println(nums[i]+" is even");
			}
			else {
				oddcount=oddcount+1;
				System.out.println(nums[i]+" is odd");
			}
		}
		System.out.println("even count is"+evencount);
		System.out.println("odd count is"+oddcount);
		
		
		
		

	}

}
