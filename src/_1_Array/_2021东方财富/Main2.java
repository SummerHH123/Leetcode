package _1_Array._2021东方财富;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();

        List<List<Integer>> split = split(N, n, k);
        System.out.println(split.toString());
    }

    private static List<List<Integer>> split(int n, int k, int l) {
        List<List<Integer>> x=new ArrayList<>();
        if (k<1){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(-1);
            return new ArrayList<>(){{
                add(tmp);
            }};
        }
        if (k==1){
            if (n>=l){
                List<Integer> tmp=new ArrayList<>();
                tmp.add(n);
                return new ArrayList<>(){{
                    add(tmp);
                }};
            }
            return new ArrayList<>(){{
                List<Integer> tmp=new ArrayList<>();
                tmp.add(-1);
                add(tmp);
            }};
        }
        for (int i=l;i<n+1;i++){
            List<List<Integer>> lists=split(n-i,k-1,i);

        }
        return x;


    }
}
