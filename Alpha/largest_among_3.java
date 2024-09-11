import java.util.Scanner;

public class largest_among_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>b && a>c){
                System.out.println("A is largest "+a);
            }
            else if(b>c){
                System.out.println("B is Largest "+b);
            }
            else{
                System.out.println("C is Largest "+c);
            }
            sc.close();

        }
    }
    
}
