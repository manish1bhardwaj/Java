import java.util.*;
public class TypeCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            // int a = sc.nextFloat();  //Not possible Conversion because int < float datatype.
            float a = sc.nextInt(); // Posssible conversion
            System.out.println(a);
            sc.close();
        }
    }
    
}
// same concept for all conversion 