
import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter Radius of Circle : ");
            int R = sc.nextInt();
            double Area = 3.14*(R*R);
            System.out.println("Area of Circle"+" "+Area);
            sc.close();
        }
    }
    
}
