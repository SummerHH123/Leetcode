package _1_Array.bilbili2021;

import java.util.Scanner;

public class test1 {
    public static String reserve(String str){
        String[] ss = str.split(" ");
        StringBuffer s = new StringBuffer();
        for(int i = ss.length-1; i>=0;i--){
            s.append(ss[i]+" ");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String reserve = reserve(str);
        System.out.println(reserve);
    }
}
