package com.dp;

import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {


        int n=3;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(topDown(3,dp));
    }

    private static int topDown(int n, int[] dp) {

        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n]=topDown(n-1,dp)+topDown(n-2,dp);
    }
}
ghj