package _1_Array._2021腾讯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-06 20:01
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];

        for (int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<a.length && j<b.length){
            if (a[i]>b[j]){
                i++;
            }else if (a[i]<b[j]){
                j++;
            }else if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
        }
       int[] ans=new int[list.size()];
        for (int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }

        System.out.printf("%d",ans[0]);
        for (int k=1;k<ans.length;k++){
            System.out.printf(" %d",ans[k]);
        }
    }
}
