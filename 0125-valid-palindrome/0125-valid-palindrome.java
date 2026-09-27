class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean istrue = true;
        int left=0;
        int right= s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                istrue = false;
                break;
            }
        }
        return istrue;
        
    }
}