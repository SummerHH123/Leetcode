package _1_Array._2021网易互联网;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Summer
 * @version 1.0
 * @date 2020-09-12 16:01
 */
public class Main4 {
    public static int[] match=new int[1010];
    public static int[][] map=new int[1010][1010];
    public static int[] used=new int[1010];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1=sc.nextLine().split(" ");
        HashMap<Integer,Integer> tobe1=new HashMap<>();
        HashMap<Integer,Integer> tobe2=new HashMap<>();
        int tot1=0;
        int tot2=0;
        for (String nows:s1){
            int now=Integer.valueOf(nows);
            tobe1.put(now,++tot1);
        }
        String[] s2=sc.nextLine().split(" ");
        for (String nows:s2){
            int now=Integer.valueOf(nows);
            tobe2.put(now,++tot2);
        }

        int m=sc.nextInt();
        Arrays.fill(match,-1);
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map.length;j++){
                map[i][j]=0;
            }
        }
        for (int i=1;i<=m;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            a=tobe1.get(a);
            b=tobe2.get(b);
            map[a][b]=1;
        }
        int cnt=0;
        for (int i=1;i<=tot1;i++){
            Arrays.fill(used,0);
            if (find(i,tot2)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static boolean find(int x,int n){

        for (int i=1;i<=n;i++){
            if (used[i]==0 && map[x][i]==1){
                used[i]=1;
                if (match[i]==-1 || find(match[i],n)){
                    match[i]=x;
                    return true;
                }
            }
        }
        return false;
    }
}
