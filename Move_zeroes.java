public class Move_zeroes {
    public static void main(String args[]){
       int[] nums = {0,1,0,2,0,3,0,4,0,5};
       int i = 0 , j = 0;
       while(j<nums.length){
        if(nums[j]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
        j++;
       }
        for(int k = 0;k<nums.length;k++){
        System.out.print(nums[k]+" ");
       }
    }
    
}
