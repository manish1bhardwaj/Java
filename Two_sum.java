import java.util.Scanner;
public class Two_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
        int[] nums = {1,3,4,5,6};
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("Indices are"+" "+i+" "+"And"+" "+j);
                    found =true;
                }
            }
        }
        if(!found){
            System.out.println("No such pair found in this array whose sum Equal to target");
        }
        sc.close();
    }
    }
}