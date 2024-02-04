class Solution {
    public void sortColors(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		for (int mid = 0; mid <= end; mid++) {

			if (nums[mid] == 0) {
				int x = nums[start];
				nums[start] = 0;
				nums[mid] = x;
				start++;

			}

			else if (nums[mid] == 2) {
				int x = nums[end];
				nums[end] = 2;
				nums[mid] = x;
				end--;
                mid--;

			}
		

		}

	}
}