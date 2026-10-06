class Solution {
    public long maxAlternatingSum(int[] nums) {

        long plus = nums[0];
        long minus = Long.MIN_VALUE;

        long deletedPlus = Long.MIN_VALUE;
        long deletedMinus = Long.MIN_VALUE;

        long ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            long newPlus = Math.max(
                (long) nums[i],
                minus == Long.MIN_VALUE ? Long.MIN_VALUE : minus + nums[i]
            );

            long newMinus = plus - nums[i];

            // Delete nums[i]
            long newDeletedPlus = Math.max(
                deletedMinus == Long.MIN_VALUE
                    ? Long.MIN_VALUE
                    : deletedMinus + nums[i],
                plus
            );

            long newDeletedMinus = Math.max(
                deletedPlus == Long.MIN_VALUE
                    ? Long.MIN_VALUE
                    : deletedPlus - nums[i],
                minus
            );

            plus = newPlus;
            minus = newMinus;

            deletedPlus = newDeletedPlus;
            deletedMinus = newDeletedMinus;

            ans = Math.max(ans,
                    Math.max(
                        Math.max(plus, minus),
                        Math.max(deletedPlus, deletedMinus)
                    ));
        }

        return ans;
    }
}
