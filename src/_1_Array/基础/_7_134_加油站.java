package _1_Array.基础;

public class _7_134_加油站 {
    public static void main(String[] args) {
        //gas  = [1,2,3,4,5]
        //cost = [3,4,5,1,2]
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{3, 4, 5, 1, 2};

        int i = canCompleteCircuit(a, b);
        System.out.println(i);


    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        boolean flag = false;
        int current_station = 0;

        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
        }
        if (sum < 0) {
            return -1;
        } else {
            for (int i = 0; i < gas.length; i++) {
                if (gas[i] >= cost[i]) {
                    int total = 0;
                    for (int j = i; j < gas.length; j++) {
                        total += gas[j] - cost[j];
                        if (total < 0) {
                            break;
                        }
                        current_station = i;
                        if (j == gas.length - 1) {
                            flag = true;
                        }

                    }
                }
                if (flag) {
                    break;
                }
            }


        }
        return current_station;


    }

}
