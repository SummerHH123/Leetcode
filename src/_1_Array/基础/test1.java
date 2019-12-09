package _1_Array.基础;

public class test1 {
    public static void main(String[] args) {
        rec(10);

    }

    public static void rec(int N) {


        if (N>0){
            rec(N - 10);//rec1
            rec(N - 1);//rec2
        }

        System.out.println("N="+N);
        System.out.println("最后一句了");
    }

}
