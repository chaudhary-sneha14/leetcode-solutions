class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int i = 0;

        long ans = 0;
        int maxDiff = 0;
        int diff[] = new int[nums1.length];
        while (i < nums1.length) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            i++;
        }

        long k = (long) k1 + k2;

        int count[] = new int[maxDiff + 1];
        for (int el : diff) {
            count[el]++;
        }

        for (int j = maxDiff; j > 0 && k > 0; j--) {
            int countopt = (int) Math.min(count[j], k);
            count[j] -= countopt;
            count[j - 1] += countopt;
            k -= countopt;

        }
        for (int a = 1; a < count.length; a++) {
            ans += (long) a * a * count[a];
        }

        return ans;
    }
}