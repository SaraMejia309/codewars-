public class Kata {

    public static long permuversion(int n, int k) {
        if (k < 0 || k > n * (n - 1) / 2) {
            return 0;
        }

        long[][] dp = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = 0;
                for (int m = 0; m <= Math.min(j, i - 1); m++) {
                    dp[i][j] += dp[i - 1][j - m];
                }
            }
        }

        return dp[n][k];
    }
}