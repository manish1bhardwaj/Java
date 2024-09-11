import java.util.Scanner;
public class Ternary_Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int marks = sc.nextInt();
            String s = (marks>=33)? "Pass" : "Fail";
            System.out.println(s);
            sc.close();

        }
    }
    
}
 