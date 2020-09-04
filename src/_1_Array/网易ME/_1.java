package _1_Array.网易ME;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<int[]> li=new ArrayList<>();

        while (scanner.hasNext()){
            int[] a= {scanner.nextInt(),scanner.nextInt()};
            li.add(a);
            for (int[] i:li){
                System.out.println(i[0]+" "+i[1]);
            }
        }



    }
}
