class Solution {
    public int[] asteroidCollision(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (st.peek() < -curr)
                    st.pop();
                else if (st.peek() == -curr) {
                    curr = 0;
                    st.pop();
                } else
                    curr = 0;
            }
            if (curr != 0)
                st.push(curr);
        }
        int idx = 0;
        int[] ans = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}