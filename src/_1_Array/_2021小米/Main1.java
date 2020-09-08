package _1_Array._2021小米;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-08 17:56
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1 = s.split(" ");
        String spec="~!@#$%^&*()_*/<>,.[]\\/";
        for (int i=0;i<s1.length;i++){
            String tmp=s1[i];
            if (tmp.length()>120 || tmp.length()<8){
                System.out.println(1);
                continue;
            }
            boolean flag_number=false;
            boolean flag_fu=false;
            boolean flag_big_zimu=false;
            boolean flag_small_zimu=false;
            boolean flag=true;
            for (int j=0;j<tmp.length();j++){
                if (Character.isUpperCase(tmp.charAt(j))){
                    flag_big_zimu=true;
                }else if (Character.isLowerCase(tmp.charAt(j))){
                    flag_small_zimu =true;
                }else if (Character.isDigit(tmp.charAt(j))){
                    flag_number=true;
                }else if (!tmp.contains(spec)){
                    flag_fu=true;
                }else {
                    flag=false;
                }
            }
            if (flag && flag_big_zimu && flag_fu && flag_number && flag_small_zimu ){
                System.out.println(0);
            }else {
                System.out.println(2);
            }
        }

    }


}
