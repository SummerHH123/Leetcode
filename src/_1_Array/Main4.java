package _1_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0){
            System.out.println(0);;
        }
        Time[] times=new Time[n];
        for (int i=0;i<n;i++){
            times[i]=new Time();
            String start_end=sc.next();
            String[] split = start_end.split(",");
            times[i].start=Integer.valueOf(split[0]);
            times[i].end=Integer.valueOf(split[1]);
        }
        Arrays.sort(times, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.start>o2.start){
                    return o1.start-o2.start;
                }else if (o1.start==o2.start){
                    return o1.end-o2.end;
                }
                return -1;
            }
        });
        int count=0;
        for (int i=1;i<n;i++){
            for (int j=i;j<=i;j++){
                if (times[i].start==times[j].start ){
                    count++;
//                    if (times[i].end<times[i].end){
//                        times[i].end=times[i-1].end;
//                    }
                }else {
                    if (times[i].start>times[j].start && times[i].end<=times[j].end){
                        count++;
                        times[i].end=times[j].end;
                        continue;
                    }
                    if (times[i].start>times[j].start &&  times[i].end>times[j].end && times[i].start<times[j].end){
                        count++;
                    }
                }
            }

//            else if (times[i-1].end>times[i].start){
//                count++;
//            }


        }
        if (n>=2){
            if (times[1].start<times[0].end){
                count++;
            }
        }


        System.out.println(count);


    }
}
class Time{
    int start;
    int end;
}
