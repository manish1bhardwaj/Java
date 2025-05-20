import java.util.Scanner;
public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int num = sc.nextInt();
            int i = 1;
            int sum = 0;
            while(i<=num){
                sum+=i;
                i++;
            }
            System.err.println("Sum of Numbers is"+" "+sum);
            sc.close();

        }
    }
    
}
