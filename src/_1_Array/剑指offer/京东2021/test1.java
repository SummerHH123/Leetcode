package _1_Array.剑指offer.京东2021;

import java.math.BigDecimal;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
//        int n=scanner.nextInt();
//        double sum=0.0;
//        for (int i=0;i<=n;i++){
//            sum+=Math.round((1/(i+1)*(Math.pow(-1,i))));
//        }
//        sum=Math.round( sum*(1/5));
//        System.out.printf("%.4f",sum);

//        double s;
//        s=(double) 4/3;
//        String format = String.format("%.2f", s);
//        double s1=Double.valueOf(format);
//        System.out.println(s1);

        double a;
        a=9.9/5;
        System.out.println(a);
        System.out.printf("%.1f",a);
        System.out.println();

        BigDecimal bigDecimal=new BigDecimal(String.valueOf(a));
//        bigDecimal.add();
//        bigDecimal.setScale(3,);

        System.out.println(bigDecimal);
    }
}
