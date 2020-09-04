package _1_Array.剑指offer.贝壳2021;

import java.util.Scanner;

public class _牛牛航路 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            int max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = max | arr[i];
            }
            System.out.println(max);

            int length = n;

            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum = sum | arr[j];
                    if(sum == max){
                        length = Math.min(length, j-i+1);
                        break;
                    }

                }
            }
            System.out.println(length);
    }
}
