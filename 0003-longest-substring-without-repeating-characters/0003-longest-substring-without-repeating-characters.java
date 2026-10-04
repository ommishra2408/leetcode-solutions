class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int start = 0;
        int[] last = new int[256];

        for (int i = 0; i < 256; i++) {
            last[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {

            if (last[s.charAt(i)] >= start) {
                start = last[s.charAt(i)] + 1;
            }

            last[s.charAt(i)] = i;

            count = Math.max(count, i - start + 1);
        }

        return count;
    }
}