package _1_Array._2021_360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] a=new int[m];
        for (int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            ans[i]=i+1;
        }
        if (n>100000){
            for (int i=0;i<ans.length;i++){
                System.out.printf("%d ",ans[i]);
            }
            return;

        }



        for (int i=0;i<m;i++){

            int count=0;
            if(a[i]==1){
                int tmp=ans[0];
                int[] b=new int[n];
                int index=0;
                for (int j=1;j<b.length;j++){
                    b[index]=ans[j];
                    index++;
                }
                b[b.length-1]=tmp;
                System.arraycopy(b, 0, ans, 0, ans.length);
            }
            if (a[i]==2){
                while (count<ans.length){
                    int tmp=ans[count];
                    ans[count]=ans[count+1];
                    ans[count+1]=tmp;
                    count+=2;
                }
            }

        }

        for (int i=0;i<ans.length;i++){
            System.out.printf("%d ",ans[i]);
        }

    }
}
