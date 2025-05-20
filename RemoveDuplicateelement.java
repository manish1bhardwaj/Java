public class RemoveDuplicateelement {
    public static void main(String args[]){
        int[] arr = {1,1,2};
        int i =0;
        int j =1;
        while(j<arr.length){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
            }
            j++;
        }
        System.out.println(i+1);
    }
}
    
