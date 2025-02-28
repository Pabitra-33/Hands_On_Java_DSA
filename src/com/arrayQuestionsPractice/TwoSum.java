package com.arrayQuestionsPractice;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {11,3,7,9,14,2};
        int target = 17;
        //result array to store the result element
        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int second_No = target - arr[i];
            if(map.containsKey(second_No)){
                res[0] = map.get(second_No);
                res[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(res[0]+" "+res[1]);
    }
}
