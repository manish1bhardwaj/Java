import java.util.Scanner;
public class Smallest_Number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
    System.out.println("Enter Three numbers : ");
    int x = sc.nextInt();
    int y= sc.nextInt();
    int z = sc.nextInt();
    if ((x<y) &&(y<z)){
        System.out.println("Smallest Number is"+ " "+x);
    }
    else if ((y<x) &&(y<z)){
        System.out.println("Smallest Number is"+ " "+y);
    }
    else{
        System.out.println("Smallest Number is"+ " "+z);
    }
    sc.close();

    }
    
}

}
