package 面试;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int target=scanner.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }

        int flag=0;
        int count=0;
        for (int i=0;i<n;i++){
            if (target==a[i]){
               flag=1;
               count=i;
               break;
            }
        }
        if (flag==1){
            System.out.println(count);
        }else {
            System.out.println("未找到");
        }
    }
}
