package com.dp;

public class TrappinRainWater {

    public static void main(String[] args) {

        int[] heights= {3,0,0,2,0,4};

        System.out.println(trapRainWaterLinearSpace( heights));

    }

    private static int trapRainWaterLinearSpace(int[] heights) {

        int[] left =new int[heights.length];
        int[] right =new int[heights.length];
        left[0]=heights[0];
        for(int i=1;i< heights.length;i++){

            left[i]=Math.max(left[i-1],heights[i] );
        }
        right[heights.length-1]=heights[heights.length-1];
        for(int i= heights.length-2;i>=0;i--){

            right[i]=Math.max(right[i+1],heights[i] );
        }
      int maxWater=0;
        for(int i=0;i< heights.length;i++){

            maxWater+=Math.min(left[i],right[i] )-heights[i];
        }

        return maxWater;
    }
}
