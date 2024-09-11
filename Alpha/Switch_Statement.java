import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int number = sc.nextInt();
            switch(number){
                // case 1 : System.out.println("Mango Shake"); 
                //             break;
                // case 2 : System.out.println("Banana Shake");  // We can use this method generally using (break)but we have another method also written below.
                //             break;
                // case 3 : System.out.println("Cold Drink");
                //             break;
                // default : System.out.println("Item Not Available");
            

                case 1 -> System.out.println("Mango Shake");
                case 2 -> System.out.println("Banana Shake");
                case 3 -> System.out.println("Cold Drink");
                default -> System.out.println("Item Not Available");
            }
            sc.close();
            
        }
    }
    
}

