class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false;

        Map<Integer, Integer> numToIdx = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(numToIdx.containsKey(nums[i])){
                if(Math.abs(numToIdx.get(nums[i]) - i) <= k) return true;
            }
            numToIdx.put(nums[i], i);
        }

        return false;
    }
}