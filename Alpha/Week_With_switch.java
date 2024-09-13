import java.util.Scanner;
public class Week_With_switch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter the Number for Require Day : "); 
            int n = sc.nextInt();
            switch(n){
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thrusday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
            }
                sc.close();
        }

        
    }
    
}
