// package Problem on DP;
// memoization
import java.util.*;
// import java.lang.reflect.Array;

public class ClimbingStairs {
    public static int ClimbWays(int n , int [] ways){
        if(n == 0) return   1;
        if(n < 0) return 0;
        if(ways[n] != -1) return ways[n];
        ways[n] = ClimbWays(n-1, ways) + ClimbWays(n-2, ways);
        return ways[n];
    }


    //tabulation loop
    public static int cntWaysTab(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;
        for(int i = 1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(ClimbWays(n, ways));
        System.out.println(cntWaysTab(n));

    }
}
