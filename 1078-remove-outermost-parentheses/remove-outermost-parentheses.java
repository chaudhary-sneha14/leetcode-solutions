class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                if (count != 0) {
                    sb.append(s.charAt(i)); //ending bracket wo hoge jha count 0 hoga agr count 0 nhi hai toh append that char
                }
                count++;
            }
             else { //)
                count--;
                if (count != 0) {
                    sb.append(s.charAt(i));

                }

            }
        }
        return sb.toString();
    }
}