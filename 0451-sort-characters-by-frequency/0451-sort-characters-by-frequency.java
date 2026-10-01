class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        for (int count = s.length(); count > 0; ) {
            int max = 0;
            int index = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }
            for (int i = 0; i < max; i++) {
                ans.append((char) index);
            }
            count -= max;
            freq[index] = 0;
        }
        return ans.toString();
    }
}