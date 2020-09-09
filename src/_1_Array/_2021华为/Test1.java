package _1_Array._2021华为;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-05 19:33
 */
public class Test1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        int[] a=new int[3];
//        a[0]=sc.nextInt();
//        a[1]=sc.nextInt();
//        a[2]=sc.nextInt();
//        int avr=(a[0]+a[1]+a[2])/3;
//        int sum=(a[0]+a[1]+a[2]);
//        Arrays.sort(a);

        int x=1;
        int y=1;
        Map<Map<Integer,Integer>,Integer> map=new HashMap<>();
        Map<Integer,Integer> tmp=new HashMap<>();
        tmp.put(x,y);
        map.put(tmp,1);
        Map<int[],Integer> tt=new HashMap<>();
        int[] tmp11=new int[2];
        tmp11[0]=2;
        tmp11[1]=4;
        tt.put(tmp11,2);

        System.out.println(map.get(tmp));
        System.out.println(tt.get(tmp11));

        System.out.println((char)('a'-32));

        System.out.println(Integer.parseInt("10111", 2));
        Integer.toBinaryString(16);
        Integer.toOctalString(8);
        Integer.toHexString(7);


    }
}
