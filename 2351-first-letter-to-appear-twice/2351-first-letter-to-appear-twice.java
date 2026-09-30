class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (seen[index]) {
                return s.charAt(i);
            }

            seen[index] = true;
        }

        return ' ';
    }
}