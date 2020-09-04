package _1_Array._2021广联达;

        import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();

        String b=sc.nextLine();

        int count=0;
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                count+=20;
            }else {
                if (count>=10){
                    count-=10;
                }else {
                    count=0;
                }

            }
        }
        System.out.println(count);
    }
}
