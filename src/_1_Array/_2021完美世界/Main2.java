package _1_Array._2021完美世界;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[][] weight = new int[6][];

        String[] pointsStr = { "V1", "V2", "V3", "V4", "V5","V6"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < pointsStr.length; i++) {
            String[] valuesStr = input.nextLine().split(" ");
            int[] values = new int[valuesStr.length];
            for (int j = 0; j < valuesStr.length; j++) {
                values[j] = Integer.parseInt(valuesStr[j]);
            }
            weight[i] = values;
        }
        input.close();

        method(weight, pointsStr);
    }

    private static void method(int[][] weight, String[] pointsStr) {
        int n=weight.length;
        for (int k=0;k<n;k++){
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(weight[i][k]==-1 || weight[k][j]==-1) continue;
                    if (weight[i][j]==-1){
                        weight[i][j]=weight[i][k]+weight[k][j];
                    }else {
                        weight[i][j]=Math.min(weight[i][k]+weight[k][j],weight[i][j]);
                    }
                }
            }
        }
        int x=-1;
        for (int i=0;i<n;i++){
            if (pointsStr[i].equals("V1")){
                x=i;
                break;
            }
        }
        for (int i=0;i<n;i++){
            if (i!=x){
                System.out.println(weight[x][i]);
            }
        }
    }

}
