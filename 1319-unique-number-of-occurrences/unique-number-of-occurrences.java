class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();

        for (int a : arr) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }
        for (int val : mp.values()) {
            if (st.contains(val))
                return false;
            st.add(val);

        }

        return true;
    }
}