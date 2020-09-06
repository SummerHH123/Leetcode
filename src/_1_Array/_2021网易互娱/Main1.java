package _1_Array._2021网易互娱;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);




        int T=sc.nextInt();
        while (T-->0){
            int N=sc.nextInt();
            int flag=-1;

            HashMap<Integer,Integer> map=new HashMap<>();
            int[][] path=new int[N][2];
            for (int i=0;i<N;i++){
                int dir=sc.nextInt();
                int status=sc.nextInt();
                path[i][0]=dir;
                path[i][1]=status;
                if (status==1){
                    map.put(dir,map.getOrDefault(dir,0)+1);
                }
            }


            for (int i=0;i<N;i++){
                int dir=path[i][0];
                int status=path[i][1];

                if(status==1 && dir==0){
                    if (flag==-1){
                        flag=0;
                    }else if (flag==1){
                        map.put(dir,map.get(dir)-1);
                        flag=0;
                    }

                }

                if(status==1 && dir==1){
                    if (flag==-1){
                        flag=1;
                    }else if (flag==0){
                        map.put(dir,map.get(dir)-1);
                        flag=1;
                    }
                }

                if(status==1 && dir==2){
                    if (flag==-1){
                        flag=2;
                    }else if (flag==3){
                        map.put(dir,map.get(dir)-1);
                        flag=2;
                    }

                }

                if(status==1 && dir==3 ){
                    if (flag==-1){
                        flag=3;
                    }else if (flag==2){
                        map.put(dir,map.get(dir)-1);
                        flag=3;
                    }

                }

            }
            int count=0;
            for (int i=0;i<=3;i++){


            }
            System.out.println(count);


        }
    }
}
