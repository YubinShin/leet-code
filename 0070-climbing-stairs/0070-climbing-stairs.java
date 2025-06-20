class Solution {
    int[] dp = new int[46];

    public int climbStairs(int n) {
        // 2 이하는 미리 지정한 값 리턴
        if (n <= 2)
            return n;

        // 미리 계산한 결과가 있다면 해당 값 리턴
        if (dp[n] != 0)
            return dp[n];
        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];
    }
}