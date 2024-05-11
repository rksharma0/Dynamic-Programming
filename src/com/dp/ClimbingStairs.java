package com.dp;

import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {


        int n=3;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(topDown(n,dp));
        System.out.println(bottomUp(n,dp));
        System.out.println(climbingStairsInLinearSpace(n));
    }

    private static int climbingStairsInLinearSpace(int n) {

        if(n<=1)return 1;
        int prevStep=1;
        int nextStep=1;
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=prevStep+nextStep;
            prevStep=nextStep;
            nextStep=ans;

        }
        return ans;

    }

    private static int bottomUp(int n, int[] dp) {

        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

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
