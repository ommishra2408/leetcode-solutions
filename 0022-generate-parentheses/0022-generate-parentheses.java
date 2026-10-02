class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate("", 0, 0, n, ans);

        return ans;
    }

    public void generate(String str, int open, int close, int n, List<String> ans) {

        // If we have used all parentheses
        if (str.length() == 2 * n) {
            ans.add(str);
            return;
        }

        // Add '(' if we still have some left
        if (open < n) {
            generate(str + "(", open + 1, close, n, ans);
        }

        // Add ')' only when it won't make the string invalid
        if (close < open) {
            generate(str + ")", open, close + 1, n, ans);
        }
    }
}