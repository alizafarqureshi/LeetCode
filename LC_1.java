class Solution {
    public int[] twoSum(int[] nums, int target) {

    // Length
        for (int i = 0; i<nums.length;i++){
            int sum = 0;
            for (int j = i+1 ; j<nums.length;j++){
                sum=0;
                sum = nums[i] + nums[j];
                if(sum == target ){
                    nums = new int[]{i, j};
                }
            }
        }
       
        return nums;
    }
}
