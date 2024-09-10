import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            float a = 23.12f;
            //int b = a;  // this will give error because it float to int is not possible in java
            int b = (int) a; // this is how we do typecasting in java = forcely conversion
            System.out.print(b);
            sc.close();
        }
    }
    
}
