package _1_Array.Leetcode;

public class _29两数相除 {
    public int divide(int dividend, int divisor) {

        if (dividend == 0) {
            return 0;
        }
        if (dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend ^ divisor) < 0;

        long t = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int result = 0;

        for (int i = 31; i >= 0; i--) {
            if ((t >> i) >= d) {
                result += 1 << i ;
                t -= d << i;
            }
        }
        return negative ? -result : result;


    }

    public static void main(String[] args) {

        System.out.println(new _29两数相除().divide(Integer.MIN_VALUE+1, -1));
        System.out.println(new _29两数相除().divide(Integer.MIN_VALUE, -1));
    }
}
