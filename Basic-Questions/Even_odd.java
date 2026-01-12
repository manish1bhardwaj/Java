import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);{
		System.out.println("Enter a number :");
		int x = sc.nextInt();
		if (x%2 == 0){
			System.out.println(x+" "+"is Even");
		}
		else {
			System.out.println(x+" "+"is Odd");
		}
        sc.close();
    }
	 
}
}