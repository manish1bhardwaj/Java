import java.util.Scanner;
public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int age = sc.nextInt();
        if (age >= 18 ){
            System.out.println("You Are Eligible to Vote & Drive");
        }
        if(age > 13 && age < 18){
            System.out.println("You Are Teenager");
        }
        else{
            System.out.println("Not Eligible,You are Under 18");
        }
        sc.close();
         }
    }
}
