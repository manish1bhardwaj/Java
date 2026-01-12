import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
    System.out.println("Enter Three numbers : ");
    int x = sc.nextInt();
    int y= sc.nextInt();
    int z = sc.nextInt();
    if ((x>y) &&(y>z)){
        System.out.println(x+"="+"x is Greater");
    }
    else if ((y>x) &&(y>z)){
        System.out.println(y+"="+"y is Greater");
    }
    else{
        System.out.println(z+"="+"z is Greater");
    }
    sc.close();

    }
    
}
}
