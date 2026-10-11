class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) { //i for the 1-based position.
            if (n % i == 0) {
                ans += nums[i - 1] * nums[i - 1]; //nums[i - 1] to access the element.
            } else {
                continue;
            }
        }
        return ans;
    }
}