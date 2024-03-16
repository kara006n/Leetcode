class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int max = 0;
        // int idx = 0;
        // for(int i =0; i< nums.length; i++){
        //     int val = map.getOrDefault(nums[i],0);
        //     map.put(nums[i],val+1);
        //     if(val+1>max){
        //         max = val+1;
        //         idx = nums[i];
        //     }
        // }
        // return idx;

        int num =0;
        int count = 0;

        for(int i =0; i< nums.length; i++){
            if(count == 0){
                num = nums[i];
                count++;
            }
            else if(num == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        return num;
    }
}