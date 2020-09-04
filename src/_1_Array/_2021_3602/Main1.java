package _1_Array._2021_3602;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();


        String[] ns = str.split("n");


        for (int i=0;i<ns.length;i++){
            if (i==0){
                String tmp=ns[i];
                String ans=tmp.substring(0,1).toUpperCase()+tmp.substring(1);
                System.out.println(ans);
            }else {
                String tmp="n"+ns[i];
                String ans=tmp.substring(0,1).toUpperCase()+tmp.substring(1);
                System.out.println(ans);
            }

        }
        if (str.charAt(str.length()-1)=='n'){
            System.out.println("N");
        }


    }
}
