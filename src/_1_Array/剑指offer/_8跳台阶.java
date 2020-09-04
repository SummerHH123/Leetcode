package _1_Array.剑指offer;

public class _8跳台阶 {

    public static int JumpFloor(int target) {

        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }

        int[] a=new int[target+1];
        a[1]=1;
        a[2]=2;

        for (int i=3;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }

        return a[target];
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(3));
    }
}
