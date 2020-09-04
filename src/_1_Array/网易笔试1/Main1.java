package _1_Array.网易笔试1;

import java.util.*;

public class Main1 {
    static class te implements Comparable<te>{
        int di;
        int pi;

        public te(int di, int pi) {
            this.di = di;
            this.pi = pi;
        }
        @Override
        public int compareTo(te o) {
            if (this.di==o.di){
                return this.pi-o.pi;
            }else {
                return this.di-o.di;
            }

        }

        @Override
        public String toString() {
            return "te{" +
                    "di=" + di +
                    ", pi=" + pi +
                    '}';
        }
    }

    public static void main(String[] args) {
        te[] t1=new te[4];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<4;i++){
            int d=sc.nextInt();
            int p=sc.nextInt();
            t1[i]=new te(d,p);
        }
        Arrays.sort(t1);
        List<Integer> li=new ArrayList<>();
        li.toArray();

        System.out.println(Arrays.asList(t1));



    }
}
