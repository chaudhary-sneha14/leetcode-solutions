class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                st.push(i);
                open++;
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                    open--;
                }
               else close++;
            }
        }
        return Math.abs(open + close);
    }
}