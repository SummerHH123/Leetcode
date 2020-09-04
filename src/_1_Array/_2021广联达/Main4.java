package _1_Array._2021广联达;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (nums.length <= 1) {
            System.out.println(0);
        }
        System.out.println(ff(nums.length,nums));


    }
    public static int ff(int n,int[] arr){
        int[] sortA=Arrays.copyOf(arr,n);
        Arrays.sort(sortA);

        int i=n-1;
        int j=n-1;
        while (i>=0 && j>= 0){
            if (arr[i]==sortA[j]){
                i--;
                j--;
            }else {
                while (i>=0 && arr[i]!=sortA[j]){
                    i--;
                }
            }
        }
        return j+1;
    }
}
