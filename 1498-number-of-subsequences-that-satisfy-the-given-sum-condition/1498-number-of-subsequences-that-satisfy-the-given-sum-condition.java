class Solution {

    static final int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;

        // pow[i] = 2^i
        long[] pow = new long[n];
        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }

        int left = 0;
        int right = n - 1;

        long count = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                count = (count + pow[right - left]) % MOD;

                left++;

            } else {

                right--;
            }
        }

        return (int) count;
    }
}