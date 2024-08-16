
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);{
            System.out.println("Enter The Temperature Value"+" ");
            int F = sc.nextInt();
            double temp = ((F*9/5)+32);
            System.out.println(temp+":"+" Degree Fahrenheit");

        sc.close();
        }
    }
    
}

