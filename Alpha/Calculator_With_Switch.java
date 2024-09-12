import java .util.Scanner;
public class Calculator_With_Switch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);{
            int a = sc.nextInt();
            int b = sc.nextInt();
            char operator  = sc.next().charAt(0);

            switch(operator) {
                case '+' -> System.out.println(a+b);
                case '*' -> System.out.println(a*b);
                case '-' -> System.out.println(a-b);
                case '/' -> System.out.println(a/b);
                case '%' -> System.out.println(a%b);

            }
            
            sc.close();

        }
    }
    
}
