class Solution {

    int[][] dp;

    int fun(char[] s, String t, int i, int j) {

        // t completely ban gaya
        if (j == t.length()) {
            return 1;
        }

        // s khatam ho gaya, but t abhi baaki hai
        if (i == s.length) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int choose = 0;
        int notPick;

        if (s[i] == t.charAt(j)) {
            choose = fun(s, t, i + 1, j + 1);
        }

        notPick = fun(s, t, i + 1, j);

        return dp[i][j] = choose + notPick;
    }

    public int numDistinct(String s, String t) {

        char[] str = s.toCharArray();

        dp = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return fun(str, t, 0, 0);
    }
}