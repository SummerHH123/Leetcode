package _1_Array.Leetcode;

public class _190颠倒二进制 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--) {
            ans += (n & 1) << bitsSize;
        }
        return ans;

    }
    public int JumpFloorII(int target) {
        if(target<=2){
            return target;
        }
        int[] dp=new int[target+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=target;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j];
            }
        }
        return dp[target];
    }



    public static void main(String[] args) {
//        System.out.println(new _190颠倒二进制().reverseBits(43261596));
//        System.out.println(24^1);

        System.out.println(new _190颠倒二进制().JumpFloorII(5));

    }
}
