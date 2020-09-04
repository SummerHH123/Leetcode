package _1_Array.Leetcode;

import java.util.Map;

public class _11盛水最多的容器 {

    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int res=(right-left)*Math.min(height[left],height[right]);

        while (left<right){
            if (height[left]<=height[right]){
                left++;
                int temp=(right-left)*Math.min(height[left],height[right]);
                res=Math.max(res,temp);
            }else {
                right--;
                int temp=(right-left)*Math.min(height[left],height[right]);
                res=Math.max(res,temp);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] s=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new _11盛水最多的容器().maxArea(s));
    }
}
