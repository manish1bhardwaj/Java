import java.util.ArrayList;
public class LeaderElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 9, 7, 6, 3, 1};
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                else if(j==arr.length-1){
                    leaders.add(arr[i]);
                    //System.out.println(arr[i]);
                }
            }
        }
        System.out.println(leaders);

    }
}