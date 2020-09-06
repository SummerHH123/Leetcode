package _1_Array;

import java.util.Scanner;

public class Test1 {


    public static long f(long a,long b,long c){
        long sum = a + b + c;
        long avl = sum / 3;
        for (long x = avl; x >= 0; x--) {
            long left = sum - 3 * x;
            long right = 0;
            if (x - a > 0) right += x - a;
            if (x - b > 0) right += x - b;
            if (x - c > 0) right += x - c;
            if (left >= right) {
                return 3*x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(",");
        long a = Long.parseLong(s1[0]);
        long b = Long.parseLong(s1[1]);
        long c = Long.parseLong(s1[2]);

        System.out.println(f(a,b,c));
    }
}
