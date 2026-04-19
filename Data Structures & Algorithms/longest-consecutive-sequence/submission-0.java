

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 0;

        for (int num : set) {

            int count = 1;
            int current = num;

            // move forward like you wanted
            while (set.contains(current + 1)) {
                current = current + 1;
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}