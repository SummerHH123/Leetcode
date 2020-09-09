package _1_Array._2021华为;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 16:17
 */
public class 进制转换 {
    static char a[] =new char [36];

   static {
        for(int i = 0;i<10;i++) {
            a[i]=(char)('0'+i);
        }
        for(int i=10;i<a.length;i++) {
            a[i]=(char)('A'+(i-10));
        }
    }
    static String transRadix(String num,int fromRadix, int toRadix) {
        int number=Integer.valueOf(num, fromRadix);
        StringBuilder s=new StringBuilder();
        while(number!=0) {
            if(toRadix==0)
                return null;
            s.append(a[number%toRadix]);
            number=number/toRadix;
        }
        return s.reverse().toString();

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(transRadix(s,10,2));


    }
}
