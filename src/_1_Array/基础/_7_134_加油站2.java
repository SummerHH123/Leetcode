package _1_Array.基础;

/**
 * 贪心
 */
public class _7_134_加油站2 {

    public static void main(String[] args) {
        //gas  = [1,2,3,4,5]
        //cost = [3,4,5,1,2]
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{3, 4, 5, 1, 2};

        int i = canCompleteCircuit(a, b);
        System.out.println(i);

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int total=0;
        int current_station=0;

        for (int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if (sum<0){
                sum=gas[i]-cost[i];
                current_station=i;
            }else {
                sum+=gas[i]-cost[i];
            }
        }
        return total>=0?current_station:-1;



    }

}
