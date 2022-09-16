package day7;

public class Maximum {

	public static void main(String[] args) {
		int[] nums = { 23, 43, 54, 12, 34, 56, 76, 43 };
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];

			}

		}
		System.out.println(max);

	}

}
