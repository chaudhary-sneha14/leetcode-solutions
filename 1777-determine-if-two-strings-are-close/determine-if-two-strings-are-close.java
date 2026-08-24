class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];

        if (word1.length() != word2.length())
            return false;

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            a[ch - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            b[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] == 0 && b[i] != 0)
                return false;
            if (a[i] != 0 && b[i] == 0)
                return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}