import java.util.Scanner;
public class Largest_of_2_Number {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);{
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x>y){
                System.out.println("X is Larger :"+x);
            }
            else{
                System.out.println("Y is Larger :"+y);
            }
            sc.close();

        }


    }
    
}
