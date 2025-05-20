import java.util.Scanner;

public class For1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int line = sc.nextInt();
            for(int i = 0; i<line;i++){
                System.out.println("********");
            }
            sc.close();
        }
    }
}