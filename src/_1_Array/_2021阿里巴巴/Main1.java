package _1_Array._2021阿里巴巴;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int p = gcd(a, b);
        a=a/p;
        b=b/p;
        if(a>A || b>B){
            System.out.println("0 0");
            return;
        }
        p=Math.min(A/a,B/b);
        System.out.println((p*a)+" "+(p*b));
    }

    private static int gcd(int a, int b) {

        if(a%b==0) return b;
        else return gcd(b,a%b);
    }
}
