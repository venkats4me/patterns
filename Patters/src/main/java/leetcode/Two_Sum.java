package leetcode;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                   res[0]=i;
                   res[1]=j;
                }
            }
        }
        return res;
    }
}
