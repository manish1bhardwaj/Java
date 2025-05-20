import java.util.*;
public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int num = sc.nextInt();
            int count = 1;
            while(count<=num){
                System.out.println("Number :"+" "+count);
                count++;
            }
            sc.close();
        }
    }
    
}
