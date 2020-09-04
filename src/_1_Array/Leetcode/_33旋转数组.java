package _1_Array.Leetcode;

public class _33旋转数组 {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if (nums.length==0){
            return -1;
        }

        while (left<=right){
            int mid=(left+right)/2;

            if (nums[mid]==target){
                return mid;
            }

            if (nums[mid]==nums[left]){
                left++;
                continue;
            }
            if (nums[left]<nums[mid]){

                if (nums[left]<=target && nums[mid]>=target){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else {
                if (nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a=new int[]{4,5,6,7,0,1,2};
        int target=0;
        System.out.println(new _33旋转数组().search(a, target));
    }

}
