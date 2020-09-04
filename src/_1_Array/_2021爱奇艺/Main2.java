package _1_Array._2021爱奇艺;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Set<String> path=new HashSet<>();
        int x=0;
        int y=0;
        path.add((x+","+y));

        boolean flage=false;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='N') y++;
            else if (ch=='S') y--;
            else if(ch=='E') x++;
            else if(ch=='W') x--;
            if (path.contains((x+","+y))){
                flage=true;
                break;
            }else {
                path.add((x+","+y));
            }
        }

        if (flage){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
