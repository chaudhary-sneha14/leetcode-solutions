class Solution {
    void generate(ArrayList<String> ans, String s, int open, int close) {
        if (open == 0 && close == 0)
            ans.add(s);

        if (open > 0)
            generate(ans, s + "(", open - 1, close);
        if (close > open)
            generate(ans, s + ")", open, close - 1);
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate(ans, "", n, n);
        return ans;
    }
}