class Solution {
    public int[] twoSum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }
}
