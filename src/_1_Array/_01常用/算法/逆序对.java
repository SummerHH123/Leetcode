package _1_Array._01常用.算法;

public class 逆序对 {
    private int sum=0;
    public int reversePairs(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int left=0;

        int right=nums.length-1;

        devide(left,right,nums);


        return sum;

    }

    public void devide(int left,int right,int[] nums){

        if(left==right){
            return;
        }

        int mid=(right+left)>>1;

        devide(left,mid,nums);
        devide(mid+1,right,nums);

        merge(left,mid,right,nums);
    }

    public void merge(int left,int mid,int right,int[] nums){

        int[] tmp=new int[right-left+1];

        int i=left;

        int j=mid+1;
        int index=0;
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){

                sum+=mid-i+1;
                tmp[index++]=nums[j++];

            }else{
                tmp[index++]=nums[i++];
            }
        }
        while(i<=mid){
            tmp[index++]=nums[i++];
        }
        while(j<=right){
            tmp[index++]=nums[j++];
        }

        for(int k=0;k<tmp.length;k++){
            nums[left++]=tmp[k];
        }

    }


}
