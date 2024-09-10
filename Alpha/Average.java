import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            Double Ave = (double)((a+b+c)/3);
            System.out.println(Ave);
            sc.close();


        }
    }
    
}
