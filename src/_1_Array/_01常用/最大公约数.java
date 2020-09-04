package _1_Array._01常用;

import java.util.Scanner;

public class 最大公约数 {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
    }
    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }else return gcd(b,a%b);

    }
}
