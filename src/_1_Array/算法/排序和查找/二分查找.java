package _1_Array.算法.排序和查找;

public class 二分查找 {


    public int binarySearch(int[] arrays,int target){
        int left=0;
        int right=arrays.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            int midValue=arrays[mid];
            if(target>midValue){
                left=mid+1;
            }else if(target<midValue){
                right=mid-1;

            }else if (target==midValue){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,3,4,5,6};
        int target=3;
        int i = new 二分查找().binarySearch(numbers, target);
        System.out.println(i);
    }


}

