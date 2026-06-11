class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = Math.max(height[i - 1], prefix[i - 1]);
        }

        int[] postfix = new int[height.length];
        for (int i = postfix.length - 2; i >= 0; i--) {
            postfix[i] = Math.max(height[i + 1], postfix[i + 1]);
        }

        int max = 0;

        for (int i = 0; i < height.length; i++) {
            int min = Math.min(postfix[i], prefix[i]);
            if (min <= height[i]) continue;
            max += min - height[i];
        }

        return max;
    }
}


// height = [0, 2, 0, 3, 1, 0, 1, 3, 2, 1]
// postfix =[3, 3, 3, 3, 3, 3, 3, 2, 1, 0]
// prefix = [0, 0, 2, 2, 3, 3, 3, 3, 3, 3]
// result = []
