import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        for (String s : strs) {

            boolean found = false;

            for (List<String> group : result) {

                if (isAnagram(s, group.get(0))) {
                    group.add(s);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                result.add(newGroup);
            }
        }

        return result;
    }

    public boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
}