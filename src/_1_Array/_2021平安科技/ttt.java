package _1_Array._2021平安科技;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-18 21:34
 */
public class ttt {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNextDouble()){
            double z=sc.nextDouble();
            double a=sc.nextDouble();
            double aa=-(double) (z/a);
            double pow = Math.pow(Math.E, aa);
            System.out.println(pow);
        }

    }
}
