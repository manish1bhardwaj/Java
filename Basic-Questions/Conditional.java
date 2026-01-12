import java.util.Scanner;
class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter Two Numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y){
            System.out.println("x is Greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
        sc.close();
    } 
}   
}
