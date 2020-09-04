package _1_Array.剑指offer;

public class _7斐波那契额 {
    public int Fibonacci(int n) {
        if (n==0){
            return 0;
        }

        if (n==1||n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
