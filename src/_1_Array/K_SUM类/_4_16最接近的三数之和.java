package _1_Array.K_SUM类;

import java.util.Arrays;

/**
 * 双指针
 * 和第三题类似
 */
public class _4_16最接近的三数之和 {
    public static void main(String[] args) {
        int[] a=new int[]{-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(a,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=nums[0]+nums[1]+nums[2];

        for (int i=0;i<nums.length;i++){
            int index1=i+1;
            int index2=nums.length-1;
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }

            while (index1<index2){
                int sum=nums[i]+nums[index1]+nums[index2];
                if (Math.abs(target-sum)<Math.abs(target-min)){
                    min=sum;
                }

                if (sum==target){
                    return min;
                }
                if (sum<target){

                    index1++;
                }
                if (sum>target){
                    index2--;
                }

            }
        }
        return min;

    }
}
