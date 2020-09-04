package _1_Array._2021_360;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        int count=0;

        for (int i=0;i<n;i++){
            int count1=0;
            String tmp=sc.nextLine();
            for (int j=0;j<tmp.length();j++){
                if(tmp.length()<=10  && Character.isLetter(tmp.charAt(j))){
                    count1++;
                }
            }
            if (count1==tmp.length()){
                count++;
            }
        }
        System.out.println(count);
    }
}
