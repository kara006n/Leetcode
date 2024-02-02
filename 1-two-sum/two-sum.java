class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(target - nums[i], -1) == -1 ) {
                map.put(nums[i], i);
            } else {
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
                break;
            }

        }
        return arr;
    }

    // public int[] twoSum(int[] nums, int target) {
    // int arr[] = new int[2];
    // outerloop: for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // arr[0] = i;
    // arr[1] = j;
    // break outerloop;
    // }
    // }
    // }
    // return arr;
    // }

    // public int[] twoSum(int[] nums, int target) {
    // for(int i = 0; i< nums.length; i++)
    // {
    // for(int j = i+1; j < nums.length; j++){
    // if(nums[i]+nums[j]==target){
    // return new int[]{i,j};
    // }
    // }
    // }
    // return new int[]{};
    // }
}