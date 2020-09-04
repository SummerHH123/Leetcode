package _1_Array.bilbili2021;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public boolean Game24Points(int[] arr) {
        // write code here

        double[] nums = new double[arr.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return dfs(nums);
    }

    private boolean dfs(double[] nums) {

        if (nums.length == 1) {
            return Math.abs(nums[0] - 24.0) < (1e-6);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                double[] nums1 = new double[nums.length - 1];

                for (int k = 0, index = 0; k < nums1.length; k++) {
                    if (k != i && k != j) {
                        nums1[index++] = nums[k];
                    }
                }

                for (double r : com(nums[i], nums[j])) {
                    nums1[nums1.length - 1] = r;

                    if (dfs(nums1)) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    private double[] com(double i, double j) {
        return new double[]{i + j, i - j, j - i, i * j, i / j, j / i};
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 2, 1, 10};
        System.out.println(new Main2().Game24Points(a));

    }
}
