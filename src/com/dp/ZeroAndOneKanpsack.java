package com.dp;

 public class ZeroAndOneKanpsack {

    public static void main(String[] args) {
        int n=3;
        int w=4;
        int[] values={1,2,3};
        int[] weight={4,5,1};
        System.out.println(knapsack_recursive(values,weight,n-1,w));
    }

    private static int knapsack_recursive(int[] values, int[] weight, int n, int w) {

        if(n==0){
            //System.out.println(w);
            if(weight[0]<=w){
                return values[0];
            }
            return 0;
        }
        int notTaken = knapsack_recursive(values,weight, n - 1, w);


        int taken = Integer.MIN_VALUE;
        if (weight[n] <= w) {
            taken = values[n] + knapsack_recursive(values,weight, n - 1, w - weight[n]);
        }

        return Math.max(notTaken,taken);
    }
}
