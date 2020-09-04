package _1_Array._2021美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> list=new ArrayList<>();
        sc.nextLine();

        for (int i=0;i<n;i++){
            list.add(sc.nextLine());
        }


        for (int i=0;i<n;i++){
            boolean flag1=false;
            boolean flag2=true;
            int count1=0;
            int count2=0;
            String tmp=list.get(i);
            if (Character.isLetter(tmp.charAt(0))){

                flag1=true;
            }

            String regex="^[a-z0-9A-Z]+$";
            if (!tmp.matches(regex)){
                flag2=false;
            }

            for (int j=0;j<tmp.length();j++){
                if (Character.isLetter(tmp.charAt(j))){
                    count1++;
                }else if (Character.isDigit(tmp.charAt(j))){
                    count2++;
                }
            }

            if (flag1 && flag2 && count1>=1 && count2>=1){
                System.out.println("Accept");
            }else {
                System.out.println("Wrong");
            }

        }

    }
}
