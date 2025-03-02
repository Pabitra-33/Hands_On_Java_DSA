package com.arrayQuestionsPractice;

public class TwoSumTwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {11,3,7,9,14,2};
        int target = 17;
        int[] res = twoSum(arr, target);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
