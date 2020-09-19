package _1_Array._2021平安科技;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-18 20:22
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double ans=(double) max3(a+b,b,c)/(max3(a,b+c,c)+max3(a,b,b+c));
        System.out.println(String.format("%.2f",ans).toString());

    }
    public static int max3(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
}
