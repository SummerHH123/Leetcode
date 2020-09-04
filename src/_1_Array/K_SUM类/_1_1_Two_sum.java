package _1_Array.K_SUM类;

import java.util.HashMap;

/**
 * 哈希表
 */
public class _1_1_Two_sum {

    public static void main(String[] args) {
        int[] a=new int[]{3,3,4,4};
        int target=8;
        int[] ints = twoSum(a, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
                mp.put(nums[i],i);
        }

        int index1=0,index2=0;
        for (int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if (mp.containsKey(x)&&mp.get(x)!=i){//如果两个相同，map里存的肯定是后一个
                index2=i;
                index1=mp.get(x);
            }
        }
       return new int[]{index1,index2};

    }
}
