class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int i = 0;
        int insert = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
                i++;
            } else {//)

                if (i < s.length() - 1 && s.charAt(i + 1) == ')') { //check for 2nd )
                    i = i + 2;

                } else { //if 2nd ) not present one insert
                    insert++;
                    i = i + 1;
                }

                if (count > 0) { //balance open bracket
                    count--;
                } else {
                    insert++;//no open bracket;
                }
            }

        }
        if (count != 0) { //means open bracket not balance
            insert += 2 * count; //one open bracket need 2 ))
        }
        return insert;
    }
}