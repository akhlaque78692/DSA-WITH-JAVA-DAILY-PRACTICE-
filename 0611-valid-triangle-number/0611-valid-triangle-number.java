class Solution {
    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int count = 0;

        for (int r = nums.length - 1; r >= 2; r--) {

            int l = 0;
            int m = r - 1;

            while (l < m) {

                if (nums[l] + nums[m] > nums[r]) {
                    count += m - l;
                    m--;
                } else {
                    l++;
                }
            }
        }

        return count;
    }
}