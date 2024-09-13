import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            double temp = sc.nextDouble();
            if(temp>=100){
                System.out.println("You Have Fever : "+temp);
            }
            else{
                System.out.println("You Don't Have Fever : "+temp);
            }
            sc.close();
        }
    }
    
}
