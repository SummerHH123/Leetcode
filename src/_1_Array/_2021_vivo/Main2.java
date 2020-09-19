package _1_Array._2021_vivo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 20:57
 */
public class Main2 {
    public static boolean flag=false;
    public static boolean flag1=false;
    public static boolean flag2=false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        String ans="";
        if (valid(s,i,j)){
            if (flag){
                int left=0;
                int right=s.length()-1;
                while (left<right){
                    if (s.charAt(i)==s.charAt(j)){
                        i++;
                        j--;
                    }else {
                        if (flag1){
                            System.out.println(s.substring(0,i)+s.substring(i+1));
                            break;
                        }else if (flag2){
                            System.out.println(s.substring(0,j)+s.substring(j+1));
                            break;
                        }

                    }
                }
            }else {
                System.out.println(s);
            }

        }else {
            System.out.println("false");
        }

    }

    private static boolean valid(String s,int i,int j) {


       while (i<j){
           if (s.charAt(i)==s.charAt(j)){
               i++;
               j--;
           }else {
               flag=true;
               String sub1=s.substring(i,j);
               String sub2=s.substring(i+1,j+1);
               return isPAlin(sub1) || isPAlin(sub2);
           }

       }
       return true;
    }

    public static boolean isPAlin(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)-s.charAt(j)!=0){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
