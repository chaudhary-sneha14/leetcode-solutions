class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Stack<String> br = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                st.push(num);
                num = 0;
                br.push("[");
            } else if (s.charAt(i) != ']') {
                br.push(ch + "");

            } else { // if(s.charAt(i)==']')
                String str = "";
                while (!br.peek().equals("[")) {
                    str = br.pop()+str;
                }
                br.pop();
                int no = st.pop();
                String temp = "";

                for (int k = 0; k < no; k++) {
                    temp += str;
                }

                br.push(temp);

            }
        
    
        }
    StringBuilder ans = new StringBuilder();while(!br.isEmpty())
    {
        ans.insert(0, br.pop());
    }

    return ans.toString();
}}