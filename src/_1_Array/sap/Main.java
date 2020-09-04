package _1_Array.sap;

import java.util.Scanner;

public class Main {
    private static int MAX1=10000;
    private static int[] ans=new int[MAX1];
    private static int[] p=new int[MAX1];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        evl();
        int t=sc.nextInt();

        while (t-->0){
            int p1=sc.nextInt();
            System.out.println(p[p[p1]]);
        }
    }

    public  static void evl(){
        for (int i=0;i<MAX1;i++)
            p[i]=i;
        for (int i=2;i<MAX1;i++){
            if (p[i]==i){
                for (int j=i;j<MAX1;j+=i){
                    p[j]=p[j]/i*(i-1);
                }
            }
        }
    }
}
