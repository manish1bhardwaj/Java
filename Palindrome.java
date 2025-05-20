
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int num = sc.nextInt();
        int rev = 0;
        int Original_val = num;
        while(num>0){
            int LastD = num%10;
            rev = ((rev*10)+LastD);
            num/=10;
        }
        if(Original_val==rev){
            System.out.print("true");
        }
        else{
            System.out.print("false");
            } 
            sc.close();
        }
    }
}
