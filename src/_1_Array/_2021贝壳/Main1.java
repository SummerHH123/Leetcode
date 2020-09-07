package _1_Array._2021贝壳;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-07 12:42
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while (T-->0){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            String left_mei=s1[0];
            String right_mei=s1[1];
            String left_niu=s1[2];
            String right_niu=s1[3];

            int left_lv=0;
            int right_lv=0;

            if (left_mei.equals("S")){
                if (left_niu.equals("J") && right_niu.equals("J")){
                    left_lv+=2;
                }else if (left_niu.equals("J") || right_niu.equals("J")){
                    left_lv++;
                }
            }

            if (left_mei.equals("J")){
                if (left_niu.equals("B") && right_niu.equals("B")){
                    left_lv+=2;
                }else if (left_niu.equals("B") || right_niu.equals("B")){
                    left_lv++;
                }
            }
            if (left_mei.equals("B")){
                if (left_niu.equals("S") && right_niu.equals("S")){
                    left_lv+=2;
                }else if (left_niu.equals("S") || right_niu.equals("S")){
                    left_lv++;
                }
            }

            if (right_mei.equals("S")){
                if (left_niu.equals("J") && right_niu.equals("J")){
                    right_lv+=2;
                }else if (left_niu.equals("J") || right_niu.equals("J")){
                    right_lv++;
                }
            }

            if (right_mei.equals("J")){
                if (left_niu.equals("B") && right_niu.equals("B")){
                    right_lv+=2;
                }else if (left_niu.equals("B") || right_niu.equals("B")){
                    right_lv++;
                }
            }
            if (right_mei.equals("B")){
                if (left_niu.equals("S") && right_niu.equals("S")){
                    right_lv+=2;
                }else if (left_niu.equals("S") || right_niu.equals("S")){
                    right_lv++;
                }
            }

            if (right_lv>left_lv){
                System.out.println("right");
            }else if (right_lv<left_lv){
                System.out.println("left");
            }else {
                System.out.println("same");
            }
        }
    }
}
