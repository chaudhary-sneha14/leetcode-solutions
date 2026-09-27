class Solution {

    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            else if (!st.isEmpty() && s.charAt(i) == ')') {
                int j = st.pop();

                int left = j + 1;
                int right = i - 1; //swap beyond () it also include();

                while (left < right) {
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '(' && sb.charAt(i) != ')') {
                ans.append(sb.charAt(i));
            }

        }
        return ans.toString();

    }
}