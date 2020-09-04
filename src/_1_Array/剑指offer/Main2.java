package _1_Array.剑指offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] a=new int[N];

            Row[] rows=new Row[M];

            for (int i=0;i<N;i++){
                a[i]=sc.nextInt();
            }
            for (int i=0;i<M;i++){
                rows[i]=new Row();
                rows[i].damage=sc.nextInt();
            }
            for (int i=0;i<M;i++){
                rows[i].spend=sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(rows, new Comparator<Row>() {
                @Override
                public int compare(Row o1, Row o2) {
                    if (o1.damage>o2.damage){
                        return o1.damage-o2.damage;
                    }else if (o1.damage==o2.damage){
                        return o1.spend-o2.spend;
                    }
                    return -1;
                }
            });

            for (Row row : rows) {
                System.out.println(row.damage+":"+row.spend);
            }

//            int count=0;
//            int number=0;
//            int[] visted=new int[M];
//            int[] visted_A=new int[N];
//
//            for (int i=0;i<N;i++){
//                int blod=a[i];
//
//                for (int j=0;j<M;j++){
//                    if (visted[j]==1 || visted_A[i]==1){
//                        continue;
//                    }
//
//                    if (blod<rows[j].damage && visted[j]==0){
//                        visted[j]=1;
//                        visted_A[i]=1;
//                        count+=rows[j].spend;
//                        number++;
//                    }
//
//                }
//
//            }
//            if (number==a.length){
//                System.out.println(count);
//            }else {
//                System.out.println("No");
//            }
//
//
//
        }
    }
}

class Row{
    int damage;
    int spend;
}
