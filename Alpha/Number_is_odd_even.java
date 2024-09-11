import java.util.Scanner;
public class Number_is_odd_even {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();

            if (n%2==0){
                System.out.println("Number is Even : "+n);
            }
            else{
                System.out.println("Number is Odd : "+n);
            }
            sc.close();

        }
    }
    
}
