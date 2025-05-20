
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int num = sc.nextInt();
        while(num>0){
            int Lastdigit = num%10;
            System.out.print(Lastdigit);
            num/=10;
            }
            System.out.println();
            sc.close();
        }
    }
}
