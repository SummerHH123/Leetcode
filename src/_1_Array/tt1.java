package _1_Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-11 16:37
 */
public class tt1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(112);
        System.out.println(set.remove(111));
        System.out.println(set.toString());
        String s="dadada\\asdad\\asdasd";
        System.out.println(s);
        String[] split = s.split("\\\\");
        System.out.println(split[1]);

    }
    public static int binarySearch(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=right-(right-left)/2;

            if (nums[mid]<target){
                left=mid+1;
            }else if (nums[mid]>target){
                right=mid-1;
            }else if (nums[mid]==target){
                return target;
            }

        }

        return -1;

    }
}
