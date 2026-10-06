class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        int[] remainder = new int[k];

        remainder[0] = 1;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if(rem < 0) {
                rem += k;
            }

            count += remainder[rem];

            remainder[rem]++;
        }

        return count;
    }
}