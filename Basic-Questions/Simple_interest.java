import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
            System.out.println("Enter Principal Amount, Rate of Interest and Time  : ");
            int P =sc.nextInt();
            int R =sc.nextInt();
            int T =sc.nextInt();
            double Simple_interest = (P*R*T)/100;
            System.out.println("Simple_interest is"+" "+Simple_interest);

            sc.close();

        }
    }
    
}
    