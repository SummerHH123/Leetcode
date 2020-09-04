package _1_Array._2021爱奇艺;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int count=0;
         while (n!=0){
             count+=n/5;
             n=n/5;
         }
        System.out.println(count);
    }
}
