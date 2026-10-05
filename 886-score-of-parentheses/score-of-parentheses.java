class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') { //fresh case
                st.push(score); //stoore previous score
                score = 0; //reset score;
            }

            else { //")"

                if (s.charAt(i - 1) == '(') {//() case
                    score = st.peek() + 1;
                }

                else {//nested (())
                    score = st.peek() + 2 * score;
                }

                st.pop();
            }
        }
        return score;

    }
}