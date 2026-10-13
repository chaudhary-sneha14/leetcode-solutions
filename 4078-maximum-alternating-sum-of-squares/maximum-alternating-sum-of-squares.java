class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long lsum = 0;
        long rsum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < n / 2; i++) {
            lsum += nums[i];
        }
        for (int i = n / 2; i < nums.length; i++) {
            rsum += nums[i];
        }
        return  rsum - lsum;
    }
}