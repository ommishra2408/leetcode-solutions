
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int ans[] = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i <= nums.length - k; i++) {

            // Recalculate maximum only if the previous
            // maximum has left the current window
            if (index < i) {
                max = nums[i];
                index = i;

                for (int j = i + 1; j < i + k; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        index = j;
                    }
                }
            } 
            // Check whether the new element is greater
            else if (nums[i + k - 1] >= max) {
                max = nums[i + k - 1];
                index = i + k - 1;
            }

            ans[i] = max;
        }

        return ans;
    }
}