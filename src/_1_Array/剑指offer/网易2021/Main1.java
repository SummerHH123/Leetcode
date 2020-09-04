package _1_Array.剑指offer.网易2021;

import java.util.Scanner;

public class Main1 {
    static int count=0;
    static boolean flag1=false;

    static int count1=0;



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            count1=0;
            int[] arr=new int[a[i]];
            boolean[] flag=new boolean[a[i]];
            search(a[i],1,0,arr,flag);
            count+=count1;

        }
        System.out.println(count);
    }

    private static void search(int n, int s, int x,int[] arr,boolean[] flag) {

        if (n>0){
            for (int i=s;i<=n;i++){
                arr[x]=i;
                search(n-i,i,x+1,arr,flag);
            }
            return;
        }

        for (int i=0;i<x;i++){
            if (isPrim(arr[i])){
                flag[i]=true;
            }
        }
        for (int i=0;i<x;i++){
            if (!flag[i]){
                flag1=true;
            }
        }
        if (!flag1){
            count1=Math.max(count1,x);
        }
        flag1=false;



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
}
