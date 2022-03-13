package com.company;

public class pairwithgetsum {
    static int[] targetSum(int []a , int target)
    {
        int kiri = 0 , kanan = a.length - 1 , tempSum;
        while(kiri < kanan)
        {
            tempSum = a[kiri] + a[kanan];
            if(tempSum == target)
                return new int[]{kiri , kanan};
            if(tempSum > target)
                kanan--;
            else
                kiri++;
        }
        return new int[]{-1 , -1};
    }
    public static void main(String args[])
    {
        int [] a = {1, 2 , 3 , 4 , 6};
        int target = 6;
        for(int x : targetSum(a , target))
            System.out.print(x + " ");
    }
}
