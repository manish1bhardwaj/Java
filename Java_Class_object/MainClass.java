import java.util.Scanner;
public class MainClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter length and breadth :" );
        int x = sc.nextInt();
        int y = sc.nextInt();


        Rectangle rl = new Rectangle(x,y);
        sc.close();
        rl.area();
        }
}
}