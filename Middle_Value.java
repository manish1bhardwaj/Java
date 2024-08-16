import java.util.Scanner;
public class Middle_Value {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
        System.out.println("Enter Three Numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x>y)&&(x<z)){
            System.out.println(x+":"+" "+"is Mid Value");
        }
        else if ((x>z)&&(x<y)){
            System.out.println(x+":"+" "+"is Mid Value");
        }
        else if ((y<z)&&(y>x)){
            System.out.println(y+":"+" "+"is Mid Value");
        }
        else if ((y>z)&&(y<x)){
            System.out.println(y+":"+" "+"is Mid Value");
        }
        else if ((z>y)&&(z<x)){
    		System.out.println(z+":"+" "+"is Mid Value");
    	}
 			
 		else if ((z<y)&&(z>x)){
 			System.out.println(z+":"+" "+"is Mid Value");
 		}

        else{
            System.out.println("No Mid Value");
        }
        sc.close();
    }
     
 }   
}
