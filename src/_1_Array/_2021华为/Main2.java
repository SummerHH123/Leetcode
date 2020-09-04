package _1_Array._2021华为;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();

        int[][] arr={{1,1},{2,2}};
        System.out.println(
                Arrays.toString(arr)
        );

//        System.out.println(arr[0].length);

        List<int[][]> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        list.add(arr);
        li.add(666);
        li.add(777);
        System.out.println(li);
        System.out.println(list.toString());
//        list.add(arr);
        System.out.println(list.size());
        System.out.println(list.get(0)[1][1]);
//        list.forEach(tmp-> System.out.println(tmp[0][0]));
        for (int i=0;i<list.size();i++){
            System.out.println(Arrays.toString(list.get(i)));
        }


    }
}
