package _1_Array.剑指offer;

public class _9变态跳台阶 {

    public static int JumpFloorII(int target) {

        if (target==1){
            return 1;
        }

        int[] a=new int[target+1];

        int sum=1;
        for (int i=2;i<a.length;i++){
            a[i]=sum+1;
            sum=sum+a[i];
        }
        return a[target];

    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }


}
