package _1_Array._2021完美世界;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());

        String[] volumesStr = input.nextLine().split(" ");
        int[] volumes = new int[volumesStr.length];
        for (int i = 0; i < volumesStr.length; i++) {
            volumes[i] = Integer.parseInt(volumesStr[i].trim());
        }

        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }

        if (volumes.length == values.length) {
            System.out.println(method(knapsackCapacity, volumes, values));
        }else {
            System.out.println("道具数量不一致。");
        }
        input.close();
    }

    private static int method(int capacity, int[] weight, int[] values) {
        int m=capacity;
        int n=weight.length;
        int[][] c=new int[n+1][m+1];
        for (int i=0;i<n+1;i++){
            c[i][0]=0;
        }
        for (int j=0;j<m+1;j++){
            c[0][j]=0;
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if (weight[i-1]<=j){
                    if (c[i-1][j]<c[i-1][j-weight[i-1]]+values[i-1]){
                        c[i][j]=c[i-1][j-weight[i-1]]+values[i-1];
                    }else {
                        c[i][j]=c[i-1][j];
                    }
                }else {
                    c[i][j]=c[i-1][j];
                }
            }
        }
        return c[n][m];


    }
}
