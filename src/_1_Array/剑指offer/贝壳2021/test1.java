package _1_Array.剑指offer.贝壳2021;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int dot=n*m;
        if (dot%2==0){
            System.out.println(2);
        }else {
            int out=getMaxMlt(n,m);
            int res=m*n/out;
            System.out.println(res);
        }
    }

    private static int getMaxMlt(int a, int b) {
        int m=a%b;
        while (m!=0){
            a=b;
            b=m;
            m=a%b;
        }
        return b;
    }
}
