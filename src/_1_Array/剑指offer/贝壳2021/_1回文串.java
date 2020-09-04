package _1_Array.剑指offer.贝壳2021;

import java.util.HashMap;
import java.util.Scanner;

public class _1回文串 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String str=scanner.nextLine();
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();



//        System.out.println(HuiWen(str));

    }

    private static int HuiWen(String str) {
        String rev=new StringBuilder(str).reverse().toString();

        int left=0;
        int right=rev.length()-1;
        int max=0;

        while (left<=right){
            if (str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else {
                max++;
                left++;
                right--;
            }
        }
        return max;

    }
}
