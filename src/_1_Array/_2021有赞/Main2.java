package _1_Array._2021有赞;

import java.util.Arrays;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-11 14:59
 */
public class Main2 {
    public static void main(String[] args) {


    }

    public static int minMoves (int[] nums) {
        // write code here
        Arrays.sort(nums);
        int sum=0;
        int low=0;
        int high=nums.length-1;

        while (low<high){
            sum+=nums[high]-nums[low];
            low++;
            high--;
        }
        return sum;
    }
}
