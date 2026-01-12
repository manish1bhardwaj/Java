public class Majorityelement {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,2,2}; 
        int val=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                if(count>0){
                    count--;
                }else{
                    count=1;
                }
                
            }else{
                count++;
            }
        }
        System.out.println(val);
    }
    
}