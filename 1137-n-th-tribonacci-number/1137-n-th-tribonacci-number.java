// class Solution {
//     public int tribonacci(int n) {
//         if(n==0) return 0;
//         if(n<=2) return 1;
//         int[] dp = new int[n+1];
//         dp[0] = 0; dp[1] = 1; dp[2] = 1;
//         for(int i = 3;i<=n;i++){
//             dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//         }
//         return dp[n];
//     }
// }

class Solution {
    public int fibo(int n,int[] dp){
        if(n==0) return 0;
        if(n<=2) return 1;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1,dp) + fibo(n-2,dp) +fibo(n-3,dp);
        dp[n] = ans;
        return ans;
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
}