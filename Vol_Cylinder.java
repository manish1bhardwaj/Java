import java.util.Scanner;
public class Vol_Cylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter Radius and Height of Cylinder : ");
            int R =sc.nextInt();
            int H =sc.nextInt();
            double Volume = (3.14*(R*R)*H);
            System.out.println("Volume of a Cylinder is"+" "+Volume);

            sc.close();

        }
    }
    
}
