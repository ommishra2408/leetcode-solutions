class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a+=1;
                max=Math.max(max,a);
            }
            else{
                a=0;
            }
           
        }
        return max;
    }
}