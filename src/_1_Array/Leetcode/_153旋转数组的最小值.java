package _1_Array.Leetcode;

public class _153旋转数组的最小值 {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            if (nums[left]<=nums[right]){
                return nums[left];
            }
            int mid=(left+right)/2;

            if (nums[left]<=nums[mid]){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a=new int[]{3,4,5,1,2};
        System.out.println(new _153旋转数组的最小值().findMin(a));
    }
}
