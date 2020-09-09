package _1_Array._2021_中国电信;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-09 21:03
 *
 * 1 7 1 7
 * 7 1 7 1-------
 *
 * 2 6 2 6
 * 6 2 6 2-------
 *
 * 3 5 3 5
 * 5 3 5 3-------
 *
 * 4 4 4 4
 * 4 4 4 4-------
 *
 * 5 3 5 3
 * 3 5 3 5-------
 *
 * 6 2 6 2
 * 2 6 2 6-------
 *
 * 7 1 7 1
 * 1 7 1 7-------
 */
public class Main2 {
    public static void main(String[] args) {


        int a,b,c,d;


        int[] ans=new int[4];
        for (int i=0;i<10000;i++){
            a=i/1000;
            b=(i-a*1000)/100;
            c=(i-a*1000-b*100)/10;
            d=(i-a*1000-b*100-c*10);
            if ((i+b*1000+c*100+d*10+a)==8888 ){

                System.out.printf("%d %d %d %d",a,b,c,d);
                System.out.println();
            }

        }
    }
}
