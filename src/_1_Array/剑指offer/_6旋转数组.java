package _1_Array.剑指offer;

//二分查找
public class _6旋转数组 {
    public static int minNumberInRotateArray(int [] array) {

        if (array.length==0){
            return 0;
        }
        int l=0;
        int r=array.length-1;

        while (l<r-1){
            int mid=l+(r-l)/2;

            if (array[mid]>=array[l]){
                l=mid;
            }else if (array[mid]<=array[r]){
                r=mid;
            }
        }
        return array[r];

    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));

    }
}
