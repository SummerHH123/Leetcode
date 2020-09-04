package _1_Array.bilbili2021;

public class Main3 {
    public static int GetCoinCount (int N) {
        // write code here

        int[] b=new int[4];
        b[0]=1;
        b[1]=4;
        b[2]=16;
        b[3]=64;
        int ans=0;
        int tmp=1024-N;
        for (int i=3;i>=0;i--){
            while (tmp>=b[i]){
                ans+=1;
                tmp-=b[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(GetCoinCount(200));
    }
}
