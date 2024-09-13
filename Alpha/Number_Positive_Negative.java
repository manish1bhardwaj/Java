import java.util.Scanner;
public class Number_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            if(n<0){
                System.out.println("Number is Negative : "+n);
            }
            else{
                System.out.println("Number is Positive : "+n);
            }
            
            
            sc.close();

        }
    }
    
}
