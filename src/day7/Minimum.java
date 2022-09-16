package day7;

public class Minimum {

	public static void main(String[] args) {
		int[] nums = {5,23, 43, 54, 12, 34, 56, 76, 43 };
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]<=min) {
				min = nums[i];

			}

		}
		System.out.println(min);


	}

}
