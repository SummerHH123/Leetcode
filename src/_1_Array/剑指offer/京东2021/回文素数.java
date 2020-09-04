package _1_Array.剑指offer.京东2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;



public class 回文素数 {
    static HashSet<Integer> set=new HashSet<>();
    static List<HashSet<Integer>> li=new ArrayList<>();
    static boolean flag=false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();




        for (int i=n;i<=m;i++){
            String str=String.valueOf(i);
            int len=str.length();
            for (int j=0;j<len;j++){
                StringBuilder sb=new StringBuilder();
                sb.append(str.substring(0,j));
                sb.append(str.substring(j+1,len));
                String re=sb.toString();
//                System.out.println(re);
                int re1=Integer.valueOf(re);
//                System.out.println(re1);
                calPal(re1);
            }
            if (flag){
                li.add(set);
                flag=false;
            }

        }
//
//        System.out.println(li.toString());

        System.out.println(li.size());


    }

    public  static void calPal(int x){

//        System.out.println(x+":"+isPrim(x));
            if (x==reverse(x) && isPrim(x)){
//                System.out.println(x);
                set.add(x);
                flag=true;
//                ((a,(a,b),((a,b),c)))
            }
    }

    public static boolean isPrim(int x){
        if(x<2) return false;
        int R=(int) Math.sqrt(x);
        for (int i=2;i<=R;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

    public  static int reverse(int x){
        int ans=0;
        while (x>0){
            ans=10*ans+(x%10);
            x/=10;
        }
        return ans;

    }
}
