package _1_Array._2021_58;

public class Main2 {
    public static void main(String[] args) {

    }
    public int question (int a, int b) {
        int target=0;
        // write code here
        for (int i=500;i>=1;i--){
            if (isComsqrt(i+a)&&isComsqrt(i+b)){
                target=i;

            }
        }
        return target;


    }

    private boolean isComsqrt(int p) {
        boolean flag=false;
        double sqrt=Math.sqrt(p);
        int q=(int)sqrt;

        if(p==Math.pow(q,2)){
            flag=true;
        }
        return flag;
    }
}
