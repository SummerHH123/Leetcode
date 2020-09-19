package _1_Array._2021网易互联网;

import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 15:41
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solve(s));
    }

    private static int solve(String s) {
        int len=s.length();
        if (len==0){
            return 0;
        }
        int[][] preSum=new int[len][6];
        int start=getIndex(s.charAt(0));
        if (start!=-1){
            preSum[0][start]++;
        }
        for (int i=1;i<len;i++){
            int idx=getIndex(s.charAt(i));
            for (int j=0;j<6;j++){
                if (idx==j){
                    preSum[i][j]=preSum[i-1][j]+1;
                }else {
                    preSum[i][j]=preSum[i-1][j];
                }
            }
        }
        for (int i=len-1;i>=0;i--){
            for (int j=0;j<len-i;j++){
                if (checkV(preSum,s,i,i+j)){
                    return i+1;
                }
            }
        }
        return 0;
    }

    private static boolean checkV(int[][] preSum, String s, int left, int right) {
        int idx=getIndex(s.charAt(left));
        for (int i=0;i<6;i++){
            if ((preSum[right][i]-preSum[left][i]+(idx==i?1:0)&1)==1){
                return false;
            }
        }
        return true;
    }

    private static int getIndex(char ch) {
        if (ch=='a'){
            return 0;
        }
        else if (ch=='b'){
            return 1;
        }
        else if (ch=='c'){
            return 2;
        }
        else if (ch=='x'){
            return 3;
        }
       else if (ch=='y'){
            return 4;
        }
        else if (ch=='z'){
            return 5;
        }
        else return -1;
    }
}
